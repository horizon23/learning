import sbt._

object Dependencies {

  val akkaV = "2.5.18"
  val sparkV = "2.4.0"
  val sphinxV = "1.0.0"
  val scalaTestV = "3.0.5"


  val sparkDependencies = Seq(
    "org.apache.spark" %% "spark-core" % sparkV
    , "org.apache.spark" %% "spark-sql" % sparkV
  )

  val akkaDependencies = Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaV
  )

  val sphinxDependencies = Seq(
    "de.sciss" % "sphinx4-core" % sphinxV
  )
  
  val scalaTestDependencies = Seq(
    "org.scalatest" %% "scalatest" % scalaTestV % "test"
  )
}
