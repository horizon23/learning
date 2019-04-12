package com.gudvin.nlp

import edu.cmu.sphinx.api.{Configuration, LiveSpeechRecognizer}

object SpeechRecognition {

  def run(): Unit = {
    val configuration = new Configuration
    configuration.setAcousticModelPath(getClass.getResource("/models/language/en-us/en-us").getFile)
    configuration.setDictionaryPath(getClass.getResource("/models/language/en-us/cmudict-en-us.dict").getFile)
    configuration.setLanguageModelPath(getClass.getResource("/models/language/en-us/en-us.lm.bin").getFile)

    println("Start speaking :")
    val speechRecognizer = new LiveSpeechRecognizer(configuration)
    speechRecognizer.startRecognition(true)
    var result = speechRecognizer.getResult
    while ({result = speechRecognizer.getResult; result != null}) {
      println(result.getHypothesis)
      println("\n")
      println(result.getWords)
      println("\n")
      println(result.getResult)
      println("\n\n")
    }
  }
}
