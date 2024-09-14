package com.samikhao.kotlincourse.lesson3

class Hw3 {
    val eventName: String = "itmo.hackday"  // Название мероприятия
    var eventDate: String = "07.09.2024"  // Дата проведения
    var eventPlace: String = "Lomonosova, 9"// Место проведения
    private var budgetPlan: String = "a lot of information" // Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы.
    var attendeesCount: Int = 0 // Количество участников
        private set(value) {}
    var eventTime: Int = 8 * 60 * 60 // Длительность хакатона
    private lateinit var vendorContract: String // Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.
    var eventStatus: String = "Planned" // Текущее состояние хакатона (статус)
    val sponsors: String = "Yandex, Sber, Tinkoff" // Список спонсоров
    private var eventBudget: Int = 143000 // Бюджет мероприятия
    var internetAccess: String = "Slowed" // Текущий уровень доступа к интернету
    private var transportation: String = "" // Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки.
    var countTeams: Int = 0 // Количество команд
    val taskList: String = "" // Перечень задач
    val evacuationPlan: String = "" // План эвакуации
    var availableEquipment: String = "" // Список доступного оборудования
    var freeEquipment: String = "" // Список свободного оборудования
    lateinit var mealSchedule: String // График питания участников (зависит от поставщика питания, определяемого за неделю до начала)
    var emergencyPlan: String = "" // План мероприятий на случай сбоев
    var juryList: String = "" // Список экспертов и жюри
    var collectingFeedback: String = "" // Методы и процедуры для сбора отзывов от участников и гостей, включая анонимные опросы и интервью.
    val privacyPolicy: String = "" // Политика конфиденциальности
    private lateinit var feedback: String // Приватные отзывы (фидбэк) участников и зрителей для анализа проблем.
    var temperature: Int = 52 // Текущая температура в помещении
    private var networkMonitoring: String = "" // Мониторинг и анализ производительности сетевого оборудования и интернет-соединения.
    var lightLevel: Int = 77 // Уровень освещения
    var eventLog: Int = 234 // Лог событий мероприятия
    var ambulance: Boolean = true // Доступность медицинской помощи
    private var safetyPlan: String = "" // Планы и процедуры для обеспечения безопасности мероприятия, включая планы эвакуации и протоколы чрезвычайных ситуаций.
    val registration: Int = 123 // Регистрационный номер мероприятия
    val maxNoiseLevel: Int = 150 // Максимально допустимый уровень шума в помещении хакатона.
    var noiseLevelIndicator: Boolean = false // Индикатор превышения уровня шума в помещениях
    lateinit var eventFormat: String // Формат мероприятия (зависит от геополитической обстановки)
    var availableRestingPlaces: Int = 100 // Количество свободных мест для отдыха (например, кресел или диванов), сеттер валидирует, чтобы количество не было меньше нуля.
        set(value) {
            if (value >= 0) field = value
        }
    var mediaRelationsPlan: String = "" // План взаимодействия с прессой
    lateinit var teamProjectsDetails: String // Детальная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистики прогона автоматизированных проверок.
    var approvalStatus: Boolean = false // Статус получения всех необходимых разрешений
    var exclusiveAccess: Boolean = true // Указывает, открыт ли доступ к эксклюзивным ресурсам (например, специальному оборудованию)
    val partners: String = "Yandex, Sber, Tinkoff" // Список партнеров мероприятия
    val eventReport: String by lazy { "" } // Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия.
    var prizeDistributionPlan: String = "" // План распределения призов
    private var emergencyContacts: String = "" // Контактная информация экстренных служб, медицинского персонала и других важных служб, недоступная участникам.
    var disabilitiesConditions: String = "" // Особые условия для участников с ограниченными возможностями
    val overallMood: String by lazy { "" } // Общее настроение участников (определяется опросами)
    lateinit var detailedPlan: String // Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед началом мероприятия.
    lateinit var specialGuest: String // Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия.
    val maxAttendees: Int = 1000 // Максимальное количество людей, которое может вместить место проведения.
    var projectTime: Int = 6 * 60 * 60 // Стандартное количество часов, отведенное каждой команде для работы над проектом.
    var currentTemperature: Int = 27 // Текущая температура в помещении
}