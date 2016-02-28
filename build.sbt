lazy val commonSettings = Seq(
  organization := "com.superwatermelon.math",
  version := "0.1.0",
  scalaVersion := "2.11.7"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "bigmatrix",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "2.2.6" % "test",
      "org.scala-lang.modules" %% "scala-xml" % "1.0.4" % "test"
    )
  )
    