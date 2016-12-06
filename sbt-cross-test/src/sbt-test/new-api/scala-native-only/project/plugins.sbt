resolvers += Resolver.sonatypeRepo("snapshots")

val pluginVersion = sys.props.get("plugin.version").getOrElse("0.1.0-SNAPSHOT")

addSbtPlugin("org.scala-native" % "sbt-cross"        % pluginVersion)
addSbtPlugin("org.scala-native" % "sbt-scala-native" % "0.1.0-SNAPSHOT")

scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-feature",
  "-encoding",
  "utf8"
)
