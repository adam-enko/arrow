plugins {
  `kotlin-dsl`
}

dependencies {
  implementation("org.jetbrains.dokka:dokka-gradle-plugin:2.0.20+")
  implementation(libs.kotlin.gradlePlugin)
  implementation(libs.android.library.gradlePlugin)
}
