enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)

name := "Scala.js Tutorial"
scalaVersion := "2.13.4" // or any other Scala version >= 2.11.12

// This is an application with a main method
scalaJSUseMainModuleInitializer := true
scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.CommonJSModule) }

version in webpack := "4.8.1"

npmDependencies in Compile += "google-play-scraper" -> "8.0.2" //"6.2.3"
webpackConfigFile := Some(baseDirectory.value / "no-fs.webpack.config.js")

