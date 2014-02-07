import sbt._
import sbt.Keys._

object SlickMySQLSourceCodeGeneratorBuild extends Build {

  private val scala_version = "2.10.3"

  lazy val slickproject = Project(
    id = "slickproject",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "SlickProject",
      organization := "com.pligor",
      version := "0.1",
      scalaVersion := scala_version,
      scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature"),
      // add other settings here

      libraryDependencies ++= List(
        "mysql" % "mysql-connector-java" % "5.1.27",
        "com.typesafe.slick" %% "slick" % "2.0.0",
        "org.slf4j" % "slf4j-nop" % "1.6.4",
        "org.scala-lang" % "scala-reflect" % scala_version
      )
    )
  )
}
