addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.12.0")
addSbtPlugin("org.scala-js" % "sbt-jsdependencies" % "1.0.2")
addSbtPlugin("org.scala-native" % "sbt-scala-native" % "0.4.9")
addSbtPlugin("io.spray" % "sbt-revolver" % "0.9.1")
addSbtPlugin("com.eed3si9n" % "sbt-projectmatrix" % "0.9.0")

val sbtSoftwareMillVersion = "2.0.9"
addSbtPlugin("com.softwaremill.sbt-softwaremill" % "sbt-softwaremill-common" % sbtSoftwareMillVersion)
addSbtPlugin("com.softwaremill.sbt-softwaremill" % "sbt-softwaremill-publish" % sbtSoftwareMillVersion)
addSbtPlugin("com.softwaremill.sbt-softwaremill" % "sbt-softwaremill-browser-test-js" % sbtSoftwareMillVersion)

addSbtPlugin("org.scalameta" % "sbt-mdoc" % "2.3.6")

addSbtPlugin("org.jetbrains.scala" % "sbt-ide-settings" % "1.1.1")
addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "1.1.1")
