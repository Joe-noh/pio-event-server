import Dependencies._

lazy val root = (project in file(".")).
  enablePlugins(JavaAppPackaging).
  settings(
    inThisBuild(List(
      organization := "jp.suzuri",
      scalaVersion := "2.10.7",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "PioEventServer",

    libraryDependencies += "io.prediction"    %% "tools"      % "0.9.6",
    libraryDependencies += "org.apache.spark" %% "spark-core" % "2.2.2",
    libraryDependencies += "org.postgresql"   %  "postgresql" % "42.2.5"
  )
