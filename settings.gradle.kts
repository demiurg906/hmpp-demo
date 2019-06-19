import java.net.URI

pluginManagement {
    repositories {
        maven { setUrl("https://teamcity.jetbrains.com/guestAuth/app/rest/builds/buildType:(id:Kotlin_dev_Compiler),number:1.3.50-dev-1324,branch:default:any/artifacts/content/maven/") }
        mavenLocal()
        maven { url = URI.create("https://dl.bintray.com/kotlin/kotlin-dev") }
        gradlePluginPortal()
    }
}

rootProject.name = "hmpp-demo"

include("my-lib-foo", "my-lib-bar", "my-app")

enableFeaturePreview("GRADLE_METADATA")