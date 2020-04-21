// give the user a nice default project!
organization := "com.example"
scalaVersion := "2.12.8"

lazy val root = (project in file(".")).
  settings(
    name := "My Template Project"
  )
