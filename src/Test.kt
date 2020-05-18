class Question(var question: String, var answer: String) {

}

fun main() {

    var arr: ArrayList<Question> = arrayListOf(
        Question("С абстрактными процессами, выражаемыми герундиями: running, reading", "no articles"),
        Question("С названием озер", "no articles"),
        Question("С названием островов", "no articles"),
        Question("С названием пляжей", "no articles"),
        Question("С названием водопадов", "no articles"),
        Question("С названием гор", "no articles"),
        Question("С названием каньонов", "no articles"),
        Question("С названием заливов", "no articles"),
        Question("С названием улиц", "no articles"),
        Question("С названием площадей", "no articles"),
        Question("С названием госпиталей", "no articles"),
        Question("С названием стадионов", "no articles"),
        Question("С названием аллей (alley)", "no articles"),
        Question("С названием парков", "no articles"),
        Question("С названием церквей", "no articles"),
        Question("С названием крепостей", "no articles"),
        Question("С названием университетов", "no articles"),
        Question("С названием колледжей", "no articles"),
        Question("С названием языков", "no articles"),
        Question("С названием религий", "no articles"),
        Question("С названием дней", "no articles"),
        Question("С названием месяцев", "no articles"),
        Question("С названием праздников", "no articles"),
        Question(
            "С названием стран (не обозначающих множества типа Штатов, Островов, Обьединения и тд)",
            "no articles"
        ),
        Question("С названием болезней(если не исключение)", "no articles"),
        Question("Перед притяжательнми местоимениями (my, your ...)", "no articles"),
        Question("Перед указательными местоимениями (this, that ...)", "no articles"),
        Question("Перед неопределенными местоимениями (some, any, each, every ...)", "no articles"),
        Question("Перед вопросами (what, whose, which ...)", "no articles"),
        Question("Перед количественные прилагательными (two, three ...)", "no articles"),
        Question("Перед числительными (one, two ...)", "no articles"),
        Question("at  ...  night", "no articles"),
        Question("at ...  noon", "no articles"),
        Question("at ...  midnight", "no articles"),
        Question("all ...  day", "no articles"),
        Question("all ...  night", "no articles"),
        Question("all ...  month", "no articles"),
        Question("... yesterday", "no articles"),
        Question("... tomorrow", "no articles"),
        Question("С именами людей", "no articles"),
        Question(" ...  university", "a/an"),
        Question("Перед названием профессии или рода занятий", "a/an"),
        Question("Перед обобщающими существительными в ед. числе", "a/an"),
        Question("Перед few в значении есть что немного когда ожидалось что совсем нет", "a/an"),
        Question("Перед few в значении мало (когда ожидалось много)", "no articles"),
        Question("Перед little в значении есть что немного когда ожидалось что совсем нет", "a/an"),
        Question("Перед little в значении мало (когда ожидалось много)", "no articles"),
        Question("С периодичностью действия -  I have my English class twice ... week", "a/an"),
        Question("Перед unique", "a"),
        Question("Перед уникальными обьеками, которые могт быть только в одном экземпляре", "the"),
        Question("Перед названиями musical instruments", "the"),
        Question("Перед названиями plants", "the"),
        Question("Перед названиями animals", "the"),
        Question("Перед названиями изобритений", "the"),
        Question("Перед названиями валют", "the"),
        Question("Перед названиями частей тела", "the"),
        Question("Перед названиями частей тела", "the"),
        Question("Перед порядковыми прилагательными (first, second, last, following ...)", "the"),
        Question("Перед прилагательными в превосходной степени (best, biggest)", "the"),
        Question("Перед направлениями с предлогами (to ... south, on ... right", "the"),
        Question("Перед направлениями без предлога (... south, ... right", "no articles"),
        Question("Перед частями света (south, north)", "the"),
        Question("Перед фамилией (если речь о семье)", "the"),
        Question("Перед описательными названиями групп людей \" blind\", \" elderly\"", "the"),
        Question(" ...  measles", "the"),
        Question(" ...  flu", "the"),
        Question(" ...  mumps", "the"),
        Question(" ...  bubonic plague", "the"),
        Question("in ... morning", "the"),
        Question("in ... afternoon", "the"),
        Question("in ... evening", "the"),
        Question("during ... night", "the"),
        Question("during ... day", "the"),
        Question("... day before yesterday", "the"),
        Question("... day after tomorrow", "the"),
        Question(" ...  fall", "the"),
        Question(" ...  summer", "the"),
        Question("to ... cinema/ theatre", "the"),
        Question("to ... shop", "the"),
        Question(" ...  market", "the"),
        Question("at ... cinema", "the"),
        Question("at ... shop", "the"),
        Question("Перед названием Столицы", "the")
    )


    var i = 0
    while (true) {
        i++
        var a = (0 until arr.size).random()
        print("$i ${arr[a].question}")
        if (readLine() == "s") break
        print(arr[a].answer)
        if (readLine() == "s") break
        println("------------------------------------------------------")
    }

}