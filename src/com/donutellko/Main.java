package com.donutellko;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.donutellko.SampleData.*;

public class Main {

static Groupp[] groupps = new Groupp[16];
static Child[] children = new Child[10];
static Employee[] employees = new Employee[Employee.jobs.length];
static Service[] services = new Service[10];

public static void main(String[] args) {
    for (int i = 0; i < groupps.length; i++) {
        groupps[i] = new Groupp(i);
        System.out.println(groupps[i]);
    }
    
    System.out.println();
    
    for (int i = 0; i < children.length; i++) {
        children[i] = new Child();
        System.out.println(children[i]);
    }
    
    System.out.println();
    
    for (int i = 0; i < employees.length; i++) {
        employees[i] = new Employee(Employee.jobs[i]);
        System.out.println(employees[i]);
    }
    
    System.out.println();
    
    for (int i = 0; i < services.length; i++) {
        services[i] = new Service();
        System.out.println(services[i]);
    }
    
    System.out.println();
    
    for (Child c : children) {
        for (int i = 0; i < 2019 - c.birthyear - 1; i++) {
            System.out.printf("INSERT INTO GROUPP_CHILD VALUES ('%s', '%s');\n", groupps[(3 - i) * 4 + rand(0, 3)].name, c.certificate);
        }
    }
    
    
    System.out.println();
    
    for (Service s : services) {
        if (!s.appointment.equals("Воспитатель") && !s.appointment.equals("Нянечка")) continue;
        int a = rand(1, 4);
        for (int i = 0; i < a; i++) {
            System.out.printf("INSERT INTO GROUPP_SERVICE VALUES ('%s', '%s');\n", groupps[(3 - i) * 4 + rand(0, 3)].name, s.book);
        }
    }
    
}

static int rand(int a, int b) {
    assert a < b;
    return (int) (Math.random() * (b - a + 1) + a);
}

static String randStrNum(int len) {
    String s = "";
    for (int i = 0; i < len; i++)
        s += rand(0, 9);
    return s;
}

private static String getRand(String[] str) {
    return str[rand(0, str.length - 1)];
}

/**
 * Получить месяц, день в формате MM.DD
 *
 * @return
 */
private static String getMonthDay() {
    String tmp1 = rand(1, 12) + "";
    String tmp2 = rand(1, 28) + "";
    return
            (tmp1.length() == 1 ? "0" : "") + tmp1 + "."
                    + (tmp2.length() == 1 ? "0" : "") + tmp2;
}

static class Human {
    String surname;
    String name;
    String patronimyc;
    boolean sex;
    String adress;
    String phone;
    String insurance;
    String birthday;
    int birthyear;
    
    Human() {
        this(rand(0, 1) == 1);
    }
    
    Human(boolean sex) {
        this.sex = sex;
        surname = getRand(surnames);
        name = getRand(sex ? male_names : female_names);
        patronimyc = getRand(patronymics);
        
        adress = getRand(streets) + ", д" + rand(1, 20);
        
        birthday = getMonthDay();
        birthyear = rand(1950, 1995);
        
        phone = "+7 " + randStrNum(3) + " " +
                randStrNum(3) + "-" + randStrNum(2) + "-" + randStrNum(2);
        insurance = "AAA" + " " + randStrNum(10);
    }
    
    String getBirth() {
        return birthyear + "." + birthday;
    }
}

static class Groupp {
    String name;
    int year;
    
    Groupp(int i) {
        year = 2015 + i / 4;
        name = (year + "").substring(2) + "/" + (i % 4 + 1);
    }
    
    @Override
    public String toString() {
        return String.format("INSERT INTO GROUPP VALUES ( '%s', %s);", name, year);
    }
}

static class Child extends Human {
    static String[] allergies = new String[]{
            "Кошачий белок", "Рыба", "Цитрусовые", "Шерсть", "Шоколад",
            "Пеницилин", "Мел", "Dat gay shit", "Укусы насекомых", "Пыльца"
    };
    Vaccination[] vaccines = new Vaccination[]{
            new Vaccination("Столбняк", "АС"),
            new Vaccination("Дифтерия", "АД-М"),
            new Vaccination("Коклюш", "ИНФАНРИКС ИПВ"),
            new Vaccination("Полиомиелит", "Имовакс-полио"),
            new Vaccination("Гепатит В", "H-B-VAX"),
            new Vaccination("Туберкулёз", "Аваксим"),
            new Vaccination("Ветряная оспа", "Окавакс"),
            new Vaccination("Грипп", "Ваксигрипп"),
    };
    
    Parent p1;
    Parent p2;
    String certificate;
    Set <String> allerg;
    List <Vaccination> vaccin;
    
    Child() {
        super();
        birthyear = rand(2013, 2016);
        certificate = "I-ИК " + randStrNum(6);
        
        p1 = new Parent(surname, true);
        p2 = new Parent(surname, false);
        if (rand(0, 100) < 50) p2.phone = "";
        if (rand(0, 100) < 33) {
            p2.phone = "";
            p2.phone = "";
            p2.surname = "";
            p2.name = "";
            p2.patronimyc = "";
            p2.work = "";
        }
        
        allerg = new HashSet <>();
        int all_count = rand(0, allergies.length);
        for (int i = 0; i < all_count; i++) allerg.add(getRand(allergies));
        
        vaccin = new ArrayList <>();
        for (Vaccination v : vaccines) {
            if (rand(0, 100) < 10) continue; // случайным образом пропускаем 10% прививок
            v.date = 2017 + "." + getMonthDay();
            v.id = certificate;
            vaccin.add(v);
        }
    }
    
    class Parent extends Human {
        int id;
        String work;
        
        Parent(String lastname, boolean sex) {
            super(sex);
            
            id = rand(0, 10000);
            this.surname = lastname;
            work = getRand(works);
            
            if (rand(0, 100) < 10) surname = getRand(surnames);
        }
    }
    
    @Override
    public String toString() {
        String s = String.format(
                "INSERT INTO CHILD VALUES (" +
                        "'%s', '%s', '%s', '%s', '%s', " +
                        "TO_DATE('%s 01:00:00', 'YYYY-MM-DD HH:mi:SS'), '%s', '%s', '%s', '%s', " +
                        "'%s', '%s', '%s', '%s', '%s', " +
                        "'%s', '%s');",
                certificate, insurance, surname, name, patronimyc,
                getBirth(), adress, p1.phone, p1.surname, p1.name,
                p1.patronimyc, p1.work, p2.phone, p2.surname, p2.name,
                p2.patronimyc, p2.work);
        for (Vaccination v : vaccin)
            s += "\nINSERT INTO VACCINATION_CHILD " + v;
        for (String a : allerg)
            s += String.format("\nINSERT INTO CHILD_ALLERGY VALUES('%s', '%s'); ", certificate, a);
        return s;
    }
}

static class Employee extends Human {
    String book;
    String type = "Админ";
    String appointment;
    
    List <Vaccination> vaccin;
    
    Vaccination[] vaccines = new Vaccination[]{
            new Vaccination("Столбняк", "АС"),
            new Vaccination("Дифтерия", "АД-М"),
            new Vaccination("Корь", "Приорикс"),
            new Vaccination("Краснуха", "Приорикс"),
            new Vaccination("Гепатит В", "H-B-VAX"),
            new Vaccination("Гепатит А", "Окавакс"),
            new Vaccination("Грипп", "Ваксигрипп"),
    };
    
    static String[] jobs = new String[]{"Директор", "Бухгалтер", "Зам.директора", "Экономист", "Уборщик", "Дворник", "Инженер", "Медсестра"};
    
    Employee(String job) {
        this();
        appointment = job;
    }
    
    Employee() {
        super();
        book = "AT-II " + randStrNum(7);
        
        vaccin = new ArrayList <>();
        for (Vaccination v : vaccines) {
            if (rand(0, 100) < 10) continue; // случайным образом пропускаем 10% прививок
            v.date = 2017 + "." + getMonthDay();
            v.id = book;
            vaccin.add(v);
        }
    }
    
    @Override
    public String toString() {
        String s = String.format("INSERT INTO EMPLOYEE VALUES (" +
                        "'%s', '%s', '%s', '%s', '%s', " +
                        "'%s', '%s', TO_DATE('%s 01:00:00', 'YYYY.MM.DD HH:mi:SS'), '%s', '%s');",
                book, insurance, phone, (sex ? 'М' : 'Ж'), surname,
                name, patronimyc, getBirth(), adress, type);
        s += String.format("\nINSERT INTO APPOINTMENT VALUES ('%s', TO_DATE('%s 01:00:00', 'YYYY.MM.DD HH:mi:SS'), NULL, '%s');", book,
                "201" + rand(0, 5) + "." + getMonthDay(), appointment);
        return s;
    }
}

static class Service extends Employee {
    String heath;
    String heath_reg;
    
    static String[] jobs = new String[]{
            "Воспитатель", "Воспитатель", "Воспитатель",
            "Нянечка", "Нянечка", "Нянечка", "Нянечка", "Нянечка",
            "Повар", "Мойщик посуды"};
    
    Service() {
        super();
        type = "Обслуж";
        heath = "МЦ" + randStrNum(5) + ('A' + rand(0, 20)) + randStrNum(1);
        heath_reg = 2017 + "." + getMonthDay();
        
        appointment = getRand(jobs);
    }
    
    @Override
    public String toString() {
        String s = super.toString();
        s += String.format("\nINSERT INTO SERVICE_EMPLOYEE VALUES (" +
                        "'%s', '%s', '%s', TO_DATE('%s 01:00:00', 'YYYY.MM.DD HH:MI:SS'));",
                book, type, heath, heath_reg);
        for (Vaccination v : vaccin)
            s += "\nINSERT INTO VACCINATION_SERVICE " + v;
        return s;
    }
}

static class Vaccination {
    String id;
    String name;
    String type;
    String date;
    
    Vaccination(String name, String type) {
        this.name = name;
        this.type = type;
    }
    
    @Override
    public String toString() {
        return String.format("VALUES ('%s', '%s', TO_DATE('%s 01:00:00', 'YYYY.MM.DD HH:MI:SS'), '%s');", id, name, date, type);
    }
}
}
