enablePlugins(SbtTwirl)

libraryDependencies ++= Seq(
  "com.lihaoyi" %% "scalatags" % "0.6.5",
  "com.storm-enroute" %% "scalameter" % "0.8.2" % Test
)

logBuffered in test := false

parallelExecution in Test := false

scalaVersion := "2.12.2"

testFrameworks += new TestFramework("org.scalameter.ScalaMeterFramework")
