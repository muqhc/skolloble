# skolloble-parser
[![Maven Central](https://img.shields.io/maven-central/v/io.github.muqhc/skolloble-parser.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22io.github.muqhc%22%20AND%20a:%22skolloble-parser%22)

#### _the skolloble parser_

## add dependency

### Gradle Kotlin Dsl

#### build.gradle.kts

```kotlin
repositories {
    mavenCentral()
}
```

```kotlin
dependencies {
    implementation("io.github.muqhc:skolloble-parser:1.5.1")
}
```

## example

#### hello.kt

##### import

```kotlin
import io.github.muqhc.skollobleparser.SkollobleParser
```

##### main()

```kotlin
val testResource = """
        html /
            head {
                meta : charset"utf-8" ;
                title - "Hello Skolloble"
            }
            body /
                button: disabled -
                    a: href"https://github.com/" target"_blank" -
                        "Click to go Github !"""".trimIndent()

val skollobleParser = SkollobleParser(testResource)

skollobleParser
    .rootElement
    .children[1]
    .children[0]
    .children[0]
    .attribution
    .entries.forEach { (key,value) ->
        println("$key=${value.value}")
    }
```
##### // output
```
href=https://github.com/
target=_blank
```
