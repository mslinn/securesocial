import bintray.Keys._

name := "SecureSocial"

version := "2.1.5"

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

libraryDependencies ++= Seq(
  cache,
  //"com.typesafe.play" %% "play"         % "2.3.8" % "provided",
  "com.typesafe.play" %% "play-mailer"  % "2.4.0",
  "org.mindrot"       %  "jbcrypt"      % "0.3m"
  //"com.typesafe.play.plugins" % "play-plugins-util" % "2.3.1"
)

resolvers ++= Seq(
  Resolver.typesafeRepo("Typesafe releases")
)

organization := "ws.securesocial"

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

scalaVersion := "2.11.6"

crossScalaVersions := Seq("2.10.5", "2.11.6")

publishMavenStyle := true

publishArtifact in Test := false

scalacOptions := Seq("-feature", "-deprecation")

bintrayPublishSettings
bintrayOrganization in bintray := Some("micronautics")
repository in bintray := "play"

publishArtifact in Test := false
