import play.core.PlayVersion.{current => playV}

name := "ssdemo-scala"
version := "0.1.0"
organization := "com.micronautics"

scalaVersion := "2.11.6"

javacOptions ++= Seq("-source", "1.7", "-target", "1.7")

scalacOptions ++= Seq("-deprecation", "-encoding", "UTF-8", "-feature", "-target:jvm-1.7", "-unchecked",
    "-Ywarn-adapted-args", "-Ywarn-value-discard", "-Xlint")

libraryDependencies := Seq(
  "com.typesafe.play" %% "play"         % playV,
  "ws.securesocial"   %% "securesocial" % "2.1.5"
)

resolvers ++= Seq(
  "micronautics/play on bintray" at "http://dl.bintray.com/micronautics/play"
)

logLevel := Level.Warn
logLevel in test := Level.Info // Level.Info is needed to see detailed output when running tests
logLevel in compile := Level.Warn

lazy val root = (project in file(".")).enablePlugins(PlayScala)
