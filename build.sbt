scalaVersion := "2.12.3"

libraryDependencies ++= List(
  "io.circe"      %% "circe-generic" % "0.8.0",
  "io.circe"      %% "circe-literal" % "0.8.0",
  "io.circe"      %% "circe-parser"  % "0.8.0",
  "org.scalatest" %% "scalatest"     % "3.0.1" % "test"
)
