package articles

class Question(var question: String, var answer: String) {

}

fun main() {

    var arr: ArrayList<Question> = arrayListOf(
        Question(
            "С абстрактными неопределеными процессами, выражаемыми герундиями: running, reading",
            "no articles"
        ),
        Question(
            "С абстрактными определеными процессами, выражаемыми герундиями: running, reading",
            "the"
        ),
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
        Question("... english language", "the"),
        Question("... english", "no articles"),
        Question("С названием религий", "no articles"),
        Question("С названием не определеных дней", "no articles"),
        Question("С названием не определеных месяцев", "no articles"),
        Question("С названием не определеных и определеных праздников", "no articles"),
        Question(
            "С названием стран (не обозначающих множества типа Штатов, Островов, Обьединения и тд)",
            "no articles"
        ),
        Question("С названием болезней(если не исключение)", "no articles"),
        Question("Перед притяжательнми местоимениями (my, your ...)", "no articles"),
        Question("... my car", "no articles"),
        Question("... this car", "no articles"),
        Question("Перед указательными местоимениями (this, that ...)", "no articles"),
        Question(
            "Перед неопределенными местоимениями (some, any, each, every ...)",
            "no articles"
        ),
        Question("... some car", "no articles"),
        Question("Перед вопросами (what, whose, which ...)", "no articles"),
        Question("What ... car", "no articles"),
        Question("Перед количественные прилагательными (two, three ...)", "a/an/the"),
        Question("... two car", "a/an/the"),
        Question("Перед цифрами (one, two ...)", "no articles"),
        Question("... one", "no articles"),
        Question("at  ...  night", "no articles"),
        Question("...  night", "a/an/the"),
        Question("at ...  noon", "no articles"),
        Question("...  noon", "a/an/the"),
        Question("at ...  midnight", "no articles"),
        Question("...  midnight", "a/an/the"),
        Question("all ...  day", "no articles"),
        Question("...  day", "a/an/the"),
        Question("all ...  night", "no articles"),
        Question("...  night", "a/an/the"),
        Question("all ...  month", "no articles"),
        Question("...  month", "a/an/the"),
        Question("... yesterday", "no articles"),
        Question("... tomorrow", "no articles"),
        Question("С именами людей", "no articles"),
        Question(" ...  university", "a"),
        Question(" ...  union", "a"),
        Question(" ...  European", "a"),
        Question("Перед названием профессии или рода занятий", "a/an"),
        Question("... engineer", "a/an"),
        Question("Перед обобщающими существительными в ед. числе", "a/an"),
        Question(
            "Перед few в значении есть что немного когда ожидалось что совсем нет",
            "a/an"
        ),
        Question("Перед few в значении мало (когда ожидалось много)", "no articles"),
        Question(
            "Перед little в значении есть что немного когда ожидалось что совсем нет",
            "a/an"
        ),
        Question("Перед little в значении мало (когда ожидалось много)", "no articles"),
        Question(
            "С периодичностью действия -  I have my English class twice ... week",
            "a/an"
        ),
        Question("Перед unique", "a"),
        Question(
            "Перед уникальными обьеками, которые могт быть только в одном экземпляре",
            "the"
        ),
        Question("... earth", "the"),
        Question("Перед названиями не конкретных musical instruments", "the"),
        Question("... piano", "the"),
        Question("Перед названиями не конкретных plants", "the"),
        Question("... rose", "the"),
        Question("Перед названиями не конкретных animals", "the"),
        Question("... dog", "the"),
        Question("Перед названиями не конкретных изобритений", "the"),
        Question("Перед названиями не конкретных валют", "the"),
        Question("... dollar", "the"),
        Question("Перед названиями не конкретных частей тела", "the"),
        Question("... hand", "the"),
        Question(
            "Перед порядковыми прилагательными (first, second, last, following ...)",
            "the"
        ),
        Question("... second car", "the"),
        Question("Перед прилагательными в превосходной степени (best, biggest)", "the"),
        Question("... fastest car", "the"),
        Question("Перед направлениями с предлогами (to ... south, on ... right", "the"),
        Question("on ... right", "the"),
        Question("to ... south", "the"),
        Question("Перед направлениями без предлога (... south, ... right", "no articles"),
        Question("без предлога ... right", "no articles"),
        Question("без предлога ... south", "no articles"),
        Question("Перед частями света (the South, the North)", "the"),
        Question("Перед фамилией (если речь о семье)", "the"),
        Question(
            "Перед описательными названиями групп людей \" blind\", \" elderly\"",
            "the"
        ),
        Question("... elderly ", "the"),
        Question(" ...  measles", "the"),
        Question(" ...  flu", "the"),
        Question(" ...  mumps", "the"),
        Question(" ...  bubonic plague", "the"),
        Question("in ... morning", "the"),
        Question("... morning", "a/an/the"),
        Question("in ... afternoon", "the"),
        Question("... afternoon", "a/an/the"),
        Question("in ... evening", "the"),
        Question("during ... night", "the"),
        Question("... night", "a/an/the"),
        Question("during ... day", "the"),
        Question("... day", "a/an/the"),
        Question("... day before yesterday", "the"),
        Question("... day after tomorrow", "the"),
        Question("С конкретным временем года (the fall)", "the"),
        Question("С не конкретным временем года (fall)", "no articles"),
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