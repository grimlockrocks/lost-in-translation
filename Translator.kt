import com.amazonaws.auth.AWSCredentialsProvider
import com.amazonaws.auth.AWSStaticCredentialsProvider
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain
import com.amazonaws.services.translate.AmazonTranslate
import com.amazonaws.services.translate.AmazonTranslateClient
import com.amazonaws.services.translate.model.TranslateTextRequest
import java.io.File

class Translator {

    companion object {
        const val AWS_REGION = "us-east-1"
        const val LANGUAGE_FILE = "supported_languages"
    }
    private val translate: AmazonTranslate
    private var languages = HashMap<String, String>()

    init {
        val awsCreds: AWSCredentialsProvider = DefaultAWSCredentialsProviderChain.getInstance()
        translate = AmazonTranslateClient.builder()
            .withCredentials(AWSStaticCredentialsProvider(awsCreds.credentials))
            .withRegion(AWS_REGION)
            .build()

        loadSupportedLanguages()
    }

    private fun loadSupportedLanguages() {
        var line :Int = 1
        File(this.javaClass.getResource(LANGUAGE_FILE).toURI()).forEachLine {
            if (line++ != 1) {
                val parts = it.split("\t")
                languages[parts[1]] = parts[0]
            }
        }
    }

    fun getSupportedLanguages(): Map<String, String> {
        return languages
    }

    fun translate(text: String, source: String, target: String): String {
        val request = TranslateTextRequest()
            .withText(text)
            .withSourceLanguageCode(source)
            .withTargetLanguageCode(target)
        val result = translate.translateText(request)
        return result.translatedText
    }
}