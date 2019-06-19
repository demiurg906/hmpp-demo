plugins {
    kotlin("multiplatform").version("1.3.50-dev-1324").apply(false)
}

allprojects {
    repositories {
        mavenLocal()
        maven { setUrl("https://teamcity.jetbrains.com/guestAuth/app/rest/builds/buildType:(id:Kotlin_dev_Compiler),number:1.3.50-dev-1324,branch:default:any/artifacts/content/maven/") }
        maven("$rootDir/repo")
        jcenter()
    }
}