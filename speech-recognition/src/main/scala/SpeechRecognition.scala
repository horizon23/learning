import edu.cmu.sphinx.api._

object SpeechRecognition {
  def main(args: Array[String]): Unit = {
    val configuration = new Configuration
    configuration.setAcousticModelPath("file:models/acoustic/wsj")
    configuration.setDictionaryPath("file:models/acoustic/wsj/dict/cmudict.0.6d")
    configuration.setLanguageModelPath("models/language/en-us.lm.dmp")
  }
}
