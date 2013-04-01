import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "multi_module"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      // Add your project dependencies here,
    )

    val sub1 = PlayProject(appName + "-sub1", appVersion, appDependencies, mainLang = SCALA, path=file("modules/sub1")).settings(
      // Add your own project settings here      
    )
    val sub2 = PlayProject(appName + "-sub2", appVersion, appDependencies, mainLang = SCALA, path=file("modules/sub2")).settings(
      // Add your own project settings here      
    )
    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      // Add your own project settings here      
    ).dependsOn(sub1, sub2).aggregate(sub1, sub2)

}
