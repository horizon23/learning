import Dependencies._

name := "learning"

version := "0.1"

scalaVersion := "2.12.7"

organization in ThisBuild := "com.gudvin"

lazy val root = (project in file("."))
  .aggregate(
    sparkLearning
    , speechRecognition
  )


val sparkLearningPName = "spark-learning"
lazy val sparkLearning = (project in file(sparkLearningPName))
  .settings(
    name := sparkLearningPName,
    version := "0.1.0-SNAPSHOT",
    libraryDependencies ++= akkaDependencies ++ sparkDependencies
  )

val speechRecognitionPName = "speech-recognition"
lazy val speechRecognition = (project in file(speechRecognitionPName))
  .settings(
    name := speechRecognitionPName,
    version := "0.1.0-SNAPSHOT",
    resolvers += "Central maven 2" at "http://central.maven.org/maven2",
    libraryDependencies ++= sphinxDependencies
  )
