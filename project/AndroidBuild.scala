import sbt._
import sbt.Keys._
import android.Keys._

/**
 * A scala build file template.
 */
object AndroidBuild extends Build {
  lazy val androidTemplate = Project("andtemplate", file(".")).settings(projectSettings: _*)

  lazy val projectSettings: Seq[Setting[_]] = android.Plugin.androidBuild ++ androidSettings ++ Seq(
    scalaVersion := "2.10.4",
    fork in Test := true,
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "2.1.6" % "test",
      "com.github.malliina" %% "util-android" % "0.7.4")
  )

  def androidSettings = Seq(
    platformTarget in Android := "android-19",
    useProguard in Android := true
  )
}