name := """edArea_V01"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  //"mysql" % "mysql-connector-java" % "5.1.18",
  "commons-io" % "commons-io" % "2.4",  //add this here
  javaJdbc,
  javaEbean,
  cache,
  javaWs
)
