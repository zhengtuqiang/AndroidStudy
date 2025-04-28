repositories {
    // 添加阿里云镜像仓库
    maven { url = uri("https://maven.aliyun.com/repository/public") }
    maven { url = uri("https://maven.aliyun.com/repository/google") }
    maven { url = uri("https://maven.aliyun.com/repository/central") }
    google()
    jcenter()
    mavenCentral()
    maven {
        url = uri("$rootDir/spi_repo")
    }
}

allprojects {
    repositories {
//        mavenCentral()
//        google()
//        jcenter()
    }
}

plugins {
    `kotlin-dsl`
// 确保使用兼容的 Kotlin 版本（需要与项目主版本一致）
    kotlin("jvm") version "1.6.10" // 请确认与您项目中的 kotlin_version 一致
}