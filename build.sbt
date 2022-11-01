// See README.md for license details.

scalaVersion     := "2.13.8"
version          := "0.1.1-SNAPSHOT"
organization     := "Martoni"

githubOwner := "Martoni"
githubRepository := "fpgamacro"

val chiselVersion = "3.5.1"

lazy val root = (project in file("."))
  .settings(
    name := "VGA",
    libraryDependencies ++= Seq(
      "edu.berkeley.cs" %% "chisel3" % chiselVersion,
      "edu.berkeley.cs" %% "chiseltest" % "0.5.1" % "test"
    ),
    scalacOptions ++= Seq(
      "-language:reflectiveCalls",
      "-deprecation",
      "-feature",
      "-Xcheckinit",
      "-P:chiselplugin:genBundleElements",
    ),
    addCompilerPlugin("edu.berkeley.cs" % "chisel3-plugin" % chiselVersion cross CrossVersion.full),
  )

