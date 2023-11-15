plugins {
    `java-library`
    id("org.openapi.generator") version "6.2.0"
}

repositories {
    mavenCentral()
}

sourceSets{
    main{
        java{
            srcDir(openApiGenerate)
        }
    }
}