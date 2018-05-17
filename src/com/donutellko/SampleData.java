package com.donutellko;

class SampleData {
static String[] surnames = new String[]{
"Соболев", "Морозов", "Громов", "Алмазов", "Державин", "Богатырев", "Майоров",
"Адмиралов", "Любимов", "Воронцов", "Воскресенская", "Лебедева", "Александрова",
"Серебрянская", "Королькова", "Виноградова", "Тальникова", "Щедрая", "Золотарева",
"Цветаева", "Родригес", "Фернандес", "Гонсалес", "Перес", "Мартинес", "Санчес",
"Алварес", "Торрес", "Ромеро", "Флорес", "Кастильо", "Гарсиа", "Паскуаль",
"Робер", "Ришар", "Бернар", "Дюран", "Моро", "Лефевр", "Леруа", "Бонне",
"Франсуа", "Буке", "Вернер", "Герман", "Якоби", "Петерс", "Леманн",
"Майер", "Петерс", "Фишер", "Вейсс", "Хан", "Ланг", "Робинсон", "Харрис",
"Эванс", "Лав", "Гилмор", "Флоренс", "Стоун", "Форд", "Ламберт", "Ньюэлл",
"Беллоуз", "Хьюстон", "Тэйлор", "Дэвис", "Фостер"
};

static String[] male_names = new String[]{
"Август", "Августин", "Аврор", "Агап", "Адам", "Аксён", "Алевтин", "Александр",
"Алексей", "Алексий", "Альберт", "Анастасий", "Анатолий", "Анвар", "Андрей",
"Андрон", "Анисим", "Антип", "Антон", "Антонин", "Аристарх", "Аркадий", "Арсений",
"Артамон", "Артём", "Артемий", "Артур", "Архип", "Аскольд", "Афанасий",
"Афиноген", "Борис", "Богдан", "Борислав", "Вадим", "Валентин", "Валерий",
"Валерьян", "Василий", "Вацлав", "Велимир", "Велор", "Вениамин", "Викентий",
"Виктор", "Вилен", "Виталий", "Влад", "Владимир", "Владислав", "Владлен",
"Влас", "Власий", "Володар", "Вольдемар", "Всеволод", "Вячеслав", "Гавриил",
"Гаврила", "Гайдар", "Гаспар", "Гай", "Гений", "Геннадий", "Георгий", "Герман",
"Гермоген", "Глеб", "Граф", "Григорий", "Дан", "Даниил", "Давид", "Данила",
"Дар", "Дементий", "Демид", "Демократ", "Демьян", "Денис", "Дидим", "Дин",
"Дмитрий", "Димитрий", "Добрыня", "Донат", "Дорофей", "Евгений", "Евграф",
"Евдоким", "Евлампий", "Евлогий", "Евсей", "Евстафий", "Егор", "Елизар",
"Елеазар", "Елисей", "Емельян", "Епифан", "Еремей", "Ермак", "Ермил",
"Ермолай", "Ерофей", "Ефим", "Ефрем", "Ждан", "Захар", "Зиновий", "Зорий",
"Зот", "Иван", "Игнат", "Игорь", "Изяслав", "Ий", "Илларион", "Илья",
"Иннокентий", "Иосиф", "Ипполит", "Искандер", "Ириний", "Июлий", "Казимир",
"Капитон", "Кай", "Каспар", "Ким", "Кир", "Кирилл", "Клавдий", "Клементий",
"Клим", "Кондратий", "Кондрат", "Константин", "Краснослав", "Кузьма", "Лавр",
"Лаврентий", "Лазарь", "Ларион", "Лев", "Леонид", "Леонтий", "Леопольд", "Лермонт",
"Лис", "Лука", "Лукьян", "Любим", "Май", "Макар", "Макс", "Максим", "Максимильян",
"Марин", "Маркел", "Марс", "Марсель", "Мануил", "Мартын", "Мартин", "Матвей",
"Мефодий", "Мечеслав", "Милад", "Милен", "Милослав", "Мир", "Мирон", "Мирослав",
"Михаил", "Митя", "Мстислав", "Наум", "Неонил", "Нестор", "Никанор", "Никита",
"Никифор", "Никодим", "Николай", "Никон", "Нил", "Новомир", "Октябрь", "Олег",
"Ольгерд", "Онисим", "Осип", "Оскар", "Остап", "Остромир", "Павел", "Пантелеймон",
"Панфил", "Парамон", "Пахом", "Пересвет", "Пётр", "Платон", "Потап", "Прозор",
"Прокофий", "Прохор", "Радислав", "Радомир", "Родион", "Роман", "Ролан",
"Ростислав", "Савелий", "Самсон", "Свет", "Светлан", "Светозар", "Светослав",
"Святогор", "Святослав", "Север", "Северьян", "Семён", "Серафим", "Сергей", "Сидор",
"Слава", "Спартак", "Спиридон", "Сталий", "Станислав", "Степан", "Стефан", "Тарас",
"Тельнан", "Терентий", "Тимофей", "Тихомир", "Тихон", "Трифон", "Трофим", "Тунгуз", "Ульян",
"Устин", "Фадей", "Февралий", "Фёдор", "Федор", "Феодор", "Феодосий", "Феофан", "Филарет",
"Филат", "Филимон", "Филипп", "Фома", "Фрол", "Харитон", "Храбр", "Цезарь", "Шмидт", "Эдгар",
"Эдип", "Эдмунд", "Эдуард", "Эль", "Эльбрус", "Энгель", "Энергий", "Эразм", "Эраст", "Эрг",
"Эрий", "Эрик", "Юлиан", "Юлий", "Юм", "Юпитер", "Юрий", "Юстин", "Яков", "Ян", "Яромир",
"Яродан", "Ярослав"
};

static String[] female_names = new String[]{
"Августа", "Аврора", "Авигея", "Агата", "Агнесса", "Агния", "Ада", "Адель", "Адельфина",
"Аделина", "Аза", "Азалия", "Азиза", "Аида", "Айлин", "Аксинья", "Алевтина", "Александра",
"Александрина", "Алика", "Алина", "Алиса", "Алира", "Алла", "Альберта", "Альбина",
"Альвина", "Альжбета", "Амелия", "Амина", "Амира", "Алия", "Анна", "Анастасия", "Ангелина",
"Андриана", "Анжела", "Анисья", "Анита", "Анжиолетта", "Анжелика", "Антонина", "Анфиса",
"Анэля", "Алёна", "Алира", "Арьяна", "Ариадна", "Арина", "Артемида", "Архелия", "Астра",
"Ася", "Асида", "Аурелия", "Аэлита", "Аюна.", "Беатриса", "Белла", "Береслава", "Берта",
"Биргит", "Богдана", "Божена", "Борислава", "Бронислава", "Бриллиант", "Валентина",
"Валерия", "Ванда", "Ванесса", "Варвара", "Василиса", "Венера", "Вера", "Верона",
"Вероника", "Версавия", "Веселина", "Весняна", "Веста", "Вида", "Виктория", "Вилора",
"Виолетта", "Виоланта", "Виргиния", "Винетта", "Виталина", "Влада", "Владислава",
"Владлена", "Властилина", "Галина", "Габриэлла", "Габи", "Гаянэ", "Гелана", "Гелена",
"Гелла", "Гелианна", "Генриетта", "Георгина", "Гера", "Герда", "Гертруда", "Глафира",
"Глория", "Гражина", "Грета.", "Дана", "Данна", "Даниэла", "Дания", "Данута", "Дарина",
"Дария", "Дарья", "Дарьяна", "Дебора", "Джема", "Джулия", "Джульетта", "Диана", "Дина",
"Динара", "Диодора", "Дионисия", "Диша", "Доля", "Доминика", "Дэнна", "Ева", "Евгения",
"Евдокия", "Екатерина", "Есения", "Елена", "Елизавета", "Жанна", "Жасмин", "Жаклин",
"Женевьева", "Жюли", "Зара", "Залина", "Зарина", "Земфира", "Зинаида", "Злата", "Зоряна",
"Златослава", "Зоя", "Иветта", "Ивона", "Изабелла", "Изольда", "Илзе", "Илена", "Илона",
"Инара", "Индира", "Инга", "Инесса", "Инна", "Иоанна", "Иоланта", "Ираида", "Ирина",
"Ирма", "Ирэн", "Ирэна", "Калерия", "Камилла", "Капитолина", "Кара", "Карина", "Каролина",
"Кармелитта", "Каторина", "Кира", "Клавдия", "Клара", "Кристина", "Крис", "Ксения",
"Келен", "Лада", "Лана", "Ландыш", "Лайма", "Лали", "Лариса", "Лаура", "Леся", "Лейла",
"Лея", "Лиана", "Лидия", "Лиза", "Лигия", "Лина", "Лика", "Лира", "Лилия", "Лили", "Лия",
"Луиза", "Лилу", "Лунара", "Любава", "Любовь", "Людмила", "Ляля.", "Майя", "Маргарита",
"Магда", "Магдалина", "Марина", "Мариша", "Марианна", "Марьяна", "Мария", "Марта",
"Мальта", "Малика", "Мартина", "Марфа", "Мериса", "Мелиана", "Мелитта", "Мила", "Милена",
"Милана", "Милиса", "Милолика", "Милослава", "Милда", "Мирра", "Мишель", "Мия", "Моника",
"Муза", "Мэри.", "Надежда", "Наталья", "Наталия", "Наоми", "Нания", "Нелли", "Нева",
"Неолина", "Нега", "Ника", "Никки", "Николь", "Нила", "Нина", "Нинна", "Нонна", "Номи",
"Нора", "Оксана", "Олеся", "Октябрина", "Ольга", "Пелагея", "Патрисия", "Полина",
"Полианна", "Прасковья", "Раиса", "Ралина", "Радмила", "Рамина", "Рая", "Радослава",
"Регина", "Рамина", "Риана", "Римма", "Роза", "Розалина", "Роксана", "Роксалана",
"Романа", "Руслана.", "Сабина", "Сабрина", "Санта", "Санда", "Сандра", "Сара",
"Сафина", "Светлана", "Северина", "Святослава", "Серафима", "Селена", "Сильва",
"Силика", "Сима", "Симона", "Снежана", "София", "Софья", "Станислава", "Стелла",
"Стефания", "Сусанна", "Таира", "Таисия", "Тала", "Тамара", "Татьяна", "Тереза",
"Томила", "Триана", "Ульяна", "Ульна", "Уля", "Устинья", "Фаиза", "Фаина", "Фаня",
"Фая", "Фия", "Фелиция", "Феодосия", "Флора", "Франсуаза", "Фрида", "Харита",
"Хана", "Хельга", "Хильда", "Христина", "Цветана", "Чеслава", "Эвелина", "Эдда",
"Эдита", "Эдилия", "Эдуарда", "Эжени", "Элеонора", "Элина", "Элиза", "Элизабет",
"Элла", "Эллада", "Элоиза", "Эльвира", "Эльвина", "Эльга", "Эльза", "Эльмира",
"Эля", "Эмбер", "Эстелла", "Эмилия", "Эмма", "Эрида", "Эрика", "Эшли", "Юзефа",
"Юлиана", "Юлия", "Юланта", "Юстина", "Юна", "Юнона", "Юфеза", "Ядвига", "Яна",
"Янина", "Янита", "Ясмина", "Ярослава"
};

static String[] patronymics = new String[]{
"Ааронович", "Абрамович", "Августович", "Авдеевич", "Аверьянович", "Адамович",
"Адрианович", "Акимович", "Аксёнович", "Александрович", "Алексеевич", "Анатольевич",
"Андреевич", "Анисимович", "Антипович", "Антонович", "Ануфриевич", "Аркадьевич",
"Арсенович", "Арсеньевич", "Артёмович", "Артемьевич", "Артурович", "Архипович",
"Афанасьевич", "Батькович", "Бедросович", "Бенедиктович", "Богданович", "Бориславич",
"Бориславович", "Борисович", "Борисыч", "Брониславович", "Вадимович", "Валентинович",
"Валерианович", "Валерьевич", "Валерьянович", "Васильевич", "Вахтангович", "Венедиктович",
"Вениаминович", "Викентьевич", "Викторович", "Виленович", "Вилорович", "Виссарионович",
"Витальевич", "Владиленович", "Владимирович", "Владиславович", "Владленович", "Власович",
"Вольфович", "Всеволодович", "Вячеславович", "Гавриилович", "Гаврилович", "Гаджиевич",
"Геннадиевич", "Геннадьевич", "Генрихович", "Георгиевич", "Герасимович", "Германович",
"Гертрудович", "Глебович", "Гордеевич", "Григорьевич", "Гурьевич", "Давидович", "Давыдович",
"Даниилович", "Данилович", "Демидович", "Демьянович", "Денисович", "Димитриевич",
"Дмитриевич", "Дорофеевич", "Евгеньевич", "Евграфович", "Евдокимович", "Евсеевич",
"Евстигнеевич", "Егорович", "Елизарович", "Елисеевич", "Емельянович", "Еремеевич",
"Ермилович", "Ермолаевич", "Ерофеевич", "Ефимович", "Ефимьевич", "Ефремович", "Ефстафьевич",
"Жанович", "Жоресович", "Захарович", "Захарьевич", "Зиновьевич", "Ибрагимович", "Иванович",
"Игнатович", "Игнатьевич", "Игоревич", "Измаилович", "Изотович", "Израилевич", "Иларионович",
"Ильгизович", "Ильич", "Ильмирович", "Ильнурович", "Ильсурович", "Ильясович", "Иоаннович",
"Иосипович", "Иосифович", "Исаевич", "Исидорович", "Леонидович", "Леонович", "Львович",
"Магомедович", "Магометович", "Макарович", "Максимович", "Маркович", "Матвеевич",
"Михайлович", "Натанович", "Наумович", "Никитич", "Никифорович", "Николаевич", "Олегович",
"Осипович", "Павлович", "Петрович", "Платонович", "Прохорович", "Романович",
"Ростиславович", "Русланович", "Рустамович", "Семёнович", "Сергеевич", "Сидорович",
"Соломонович", "Степанович", "Тарасович", "Теймуразович", "Терентьевич", "Тимофеевич",
"Тимурович", "Тихонович", "Трифонович", "Трофимович", "Устинович", "Фадеевич", "Фёдорович",
"Федосеевич", "Федосьевич", "Федотович", "Феликсович", "Феодосьевич", "Феоктистович",
"Феофанович", "Филатович", "Филимонович", "Филиппович", "Фокич", "Фомич", "Фролович",
"Харитонович", "Харламович", "Харлампович", "Харлампьевич", "Чеславович", "Эдгардович",
"Эдгарович", "Эдуардович", "Юлианович", "Юльевич", "Юрьевич", "Яковлевич", "Якубович",
"Ярославович", "Ярославович"
};

static String[] streets = new String[]{
"Адмиралтейский проспект", "Улица Александра Невского", "Амбарная улица",
"Апраксин переулок", "Аптекарский переулок", "Артиллерийская улица",
"Артиллерийский переулок", "Атаманская улица", "Проспект Бакунина",
"Банковский переулок", "Басков переулок", "Улица Белинского", "Большая линия",
"Улица Бонч-Бруевича", "Боровая улица", "Бородинская улица", "Виленский переулок",
"Владимирский проспект", "Водопроводный переулок", "Волоколамский переулок",
"Волынский переулок", "Воронежская улица", "Воскресенская набережная",
"Улица Восстания", "Гагаринская улица", "Гангутская улица", "Гончарная улица",
"Гороховая улица", "Госпитальная улица", "Графский переулок", "Греческий проспект",
"Гродненский переулок", "Дворцовая набережная", "Дворцовый проезд", "Дегтярная улица",
"Дегтярный переулок", "Переулок Джамбула", "Дмитровский переулок",
"Днепропетровская улица", "Улица Достоевского", "Друскеникский переулок",
"Думская улица", "Евгеньевская улица", "Улица Жуковского", "Загородный проспект",
"Замковая улица", "Захарьевская улица", "Заячий переулок", "Улица Зодчего Росси",
"Инженерная улица", "Исполкомская улица", "Итальянская улица", "Кавалергардская улица",
"Казанская улица", "Калужский переулок", "Караванная улица", "Переулок Кваренги",
"Кирилловская улица", "Кирочная улица", "Кирпичный переулок", "Кленовая улица",
"Ковенский переулок", "Колокольная улица", "Конная улица", "Улица Константина Заслонова",
"Большая Конюшенная улица", "Малая Конюшенная улица", "Конюшенный переулок",
"Улица Короленко", "Костромская улица", "Красноборский переулок",
"Улица Красного Текстильщика", "Кременчугская улица", "Кричевский переулок",
"Круглый переулок", "Переулок Крылова", "Кузнечный переулок", "Набережная Кутузова",
"Лафонская улица", "Лиговский переулок", "Лиговский проспект", "Литейный проспект",
"Улица Ломоносова", "Манежный переулок", "Улица Марата", "Мариинский проезд",
"Улица Маяковского", "Мелитопольский переулок", "Миллионная улица",
"Миргородская улица", "Митавский переулок", "Михайловская улица",
"Улица Моисеенко", "Набережная реки Мойки", "Набережная реки Монастырки",
"Большая Морская улица", "Малая Морская улица", "Москательный переулок",
"Большая Московская улица", "Малая Московская улица", "Моховая улица",
"Мошков переулок", "Мраморный переулок", "Мучной переулок", "Мытнинская улица",
"Набережная канала Грибоедова", "Набережная Обводного канала", "Невский проспект",
"Улица Некрасова", "Новгородская улица", "Проспект Обуховской Обороны",
"Одесская улица", "Озерной переулок", "Орловская улица", "Орловский переулок",
"Улица Оружейника Фёдорова", "Остропольский переулок", "Очаковская улица",
"Павлоградский переулок", "Парадная улица", "Перекупной переулок", "Перинная линия",
"Песковский переулок", "Улица Пестеля", "Улица Печатника Григорьева",
"Поварской переулок", "Полтавская улица", "Полтавский проезд", "Потёмкинская улица",
"Улица Правды", "Улица Профессора Ивашенцова", "Прудковский переулок",
"Пушкинская улица", "Переулок Радищева", "Улица Радищева", "Разъезжая улица",
"Роменская улица", "Улица Рубинштейна", "Улица Рылеева", "Рязанский переулок",
"Малая Садовая улица", "Садовая улица", "Сапёрный переулок", "Свечной переулок",
"Переулок Сергея Тюленина", "Синопская набережная", "Смольная набережная",
"Аллея Смольного", "Улица Смольного", "Смольный проезд", "Смольный проспект",
"1-я Советская улица", "2-я Советская улица", "3-я Советская улица",
"4-я Советская улица", "5-я Советская улица", "6-я Советская улица",
"7-я Советская улица", "8-я Советская улица", "9-я Советская улица",
"10-я Советская улица", "Солдатский переулок", "Соляной переулок",
"Социалистическая улица", "Ставропольская улица", "Старорусская улица",
"Стремянная улица", "Суворовский проспект", "Сухопутный переулок",
"Таврическая улица", "Таврический переулок", "Тверская улица", "Тележная улица",
"Тележный переулок", "Торговый переулок", "Транспортный обход центра",
"Транспортный переулок", "Тульская улица", "Улица Тюшина", "Переулок Ульяны Громовой",
"Набережная реки Фонтанки", "Фонтанная улица", "Фуражный переулок", "Фурштатская улица",
"Харьковская улица", "Херсонская улица", "Херсонский проезд", "Улица Хохрякова",
"Царицынский проезд", "Улица Чайковского", "Чебоксарский переулок",
"Чернорецкий переулок", "Проспект Чернышевского", "Улица Черняховского",
"Улица Чехова", "Шведский переулок", "Шпалерная улица", "Шуваловский проезд",
"Щербаков переулок"
};

static String[] works = new String[]{
"Газпром нефть", "ФОРД МОТОР КОМПАН", "СИБУР Холдинг", "Пивоваренная компания Балтика",
"Ростелеком", "ЛЕНТА", "О''КЕЙ", "АГРОТОРГ", "ГАЗПРОМ ТРАНСГАЗ САНКТ–ПЕТЕРБУРГ",
"Северная верфь", "ФИЛИП МОРРИС ИЖОРА", "Трансойл", "ПЕТЕРБУРГРЕГИОНГАЗ", "ГРУППА ИЛИМ",
"ТРАНСАЭРО", "Петербургская сбытовая компания", "ТГК–1", "ГОЗНАК", "КИНЕФ", "ООО Силовые машины"
};
}
