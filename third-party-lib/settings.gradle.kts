pluginManagement {
    repositories {
        maven { setUrl("https://teamcity.jetbrains.com/guestAuth/app/rest/builds/buildType:(id:Kotlin_dev_Compiler),number:1.3.50-dev-1324,branch:default:any/artifacts/content/maven/") }
        mavenLocal()
        gradlePluginPortal()
    }
}

rootProject.name = "third-party-lib"

enableFeaturePreview("GRADLE_METADATA")