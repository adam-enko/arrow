rootProject.name = "buildSrc"

pluginManagement {
  @Suppress("LocalVariableName") val kotlin_repo_url: String? by settings
  repositories {
    gradlePluginPortal()
    mavenCentral()
  }
}

dependencyResolutionManagement {
  val kotlin_repo_url: String? by settings
  repositories {
    kotlin_repo_url?.also { maven(it) }
    mavenCentral()
    gradlePluginPortal()
    maven("https://maven.pkg.jetbrains.space/kotlin/p/dokka/dev") {
      name = "JetBrains Dokka Dev"
    }
    google()
  }

  versionCatalogs {
    create("libs") {
      from(files("../gradle/libs.versions.toml"))
    }
  }
}
