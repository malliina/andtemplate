import sbt._

object BuildBuild extends Build {

  override lazy val settings = super.settings ++ Seq(
  ) ++ sbtPlugins

  def sbtPlugins = Seq(
    "com.hanhuy.sbt" % "android-sdk-plugin" % "1.2.16",
    "com.github.mpeltonen" % "sbt-idea" % "1.6.0",
    "com.timushev.sbt" % "sbt-updates" % "0.1.6"
  ) map addSbtPlugin

  override lazy val projects = Seq(root)
  lazy val root = Project("plugins", file("."))
}