//val scalaJSVersion = sys.props.getOrElse("scalajs.version", sys.error("'scalajs.version' environment variable is not defined"))
//val scalaJSBundlerVersion = sys.props.getOrElse("plugin.version", sys.error("'plugin.version' environment variable is not set"))

//addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.4.0")

addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % "0.18.0")

//ivyLoggingLevel in ThisBuild := UpdateLogging.Quiet
