plugins {
  id("org.jetbrains.dokka")
}

dokka {
  dokkaGeneratorIsolation = ClassLoaderIsolation()
//  dokkaGeneratorIsolation = ProcessIsolation {
//    jvmArgs = listOf(
//      "-Xmx6G",
//      //"-XX:+UseParallelGC",
//      //"-XX:MaxMetaspaceSize=1g",
//    )
//  }
}
