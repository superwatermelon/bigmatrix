import sbt.AutoPlugin
import sbt.Keys._
import sbt._

object Dependencies extends AutoPlugin {

  val scalaTest = "org.scalatest" %% "scalatest" % "2.2.6"
  val scalaXml = "org.scala-lang.modules" %% "scala-xml" % "1.0.4"

  val testLibraryDependencies = Seq(
    scalaTest % "test",
    scalaXml % "test"
  )

  override def trigger = allRequirements

  override val projectSettings = Seq(
    libraryDependencies ++= testLibraryDependencies
  )

}