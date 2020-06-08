const val LANGUAGE_LENGTH = 20
const val START_TEXT = "Do. Or do not. There is no try."
const val START_TEXT_LANG = "en"

fun getRandomLanguages(languages: Set<String>, length: Int): List<String> {
    val result = languages.shuffled().subList(0, length).toMutableList()
    result.add(0, START_TEXT_LANG)
    result.add(START_TEXT_LANG)
    return result
}

fun main() {
    println("Program Starts")

    val translator = Translator()
    val languages = translator.getSupportedLanguages()
    val selectedLanguages = getRandomLanguages(languages.keys, LANGUAGE_LENGTH)

    var text = START_TEXT
    for (i in 0..LANGUAGE_LENGTH) {
        val from = selectedLanguages[i]
        val to = selectedLanguages[i + 1]
        val translation = translator.translate(text, from, to)
        println("From: $from (${languages[from]}), text: $text, to: $to (${languages[to]}), $translation")
        text = translation
    }

    println("Program Ends")
}