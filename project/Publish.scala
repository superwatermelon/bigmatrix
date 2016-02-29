import sbt.AutoPlugin
import sbt.Keys._
import sbt._

object Publish extends AutoPlugin {

  override def trigger = allRequirements

  override val projectSettings = Seq(
    publishMavenStyle := true,
    publishTo := {
      val nexus = "https://oss.sonatype.org/"
      if (isSnapshot.value)
        Some("snapshots" at nexus + "content/repositories/snapshots")
      else
        Some("releases"  at nexus + "service/local/staging/deploy/maven2")
    },
    pomIncludeRepository := (_ => false),
    licenses := Seq("MIT License" -> url("http://www.opensource.org/licenses/mit-license.php")),
    homepage := Some(url("http://superwatermelon.com/scala/math/bigmatrix")),
    pomExtra := (
      <scm>
        <url>https://github.com/superwatermelon/bigmatrix</url>
        <connection>scm:git:git@github.com:superwatermelon/bigmatrix.git</connection>
      </scm>
      <developers>
        <developer>
          <id>stuartwakefield</id>
          <name>Stuart Wakefield</name>
          <url>http://stuartwakefield.co.uk</url>
        </developer>
      </developers>)

  )

}