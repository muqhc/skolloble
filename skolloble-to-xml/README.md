# skolloble-to-xml
[![Maven Central](https://img.shields.io/maven-central/v/io.github.muqhc/skolloble-to-xml.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22io.github.muqhc%22%20AND%20a:%22skolloble-to-xml%22)

#### _the skolloble to xml converter_

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
    implementation("io.github.muqhc:skolloble-to-xml:1.4.1")
}
```

## example

#### hello.kt

##### import

```kotlin
import io.github.muqhc.skollobletoxml.skollobleToXml
```

##### main()

```kotlin
val testResource = """
        html /
            head {
                meta : charset"utf-8" \
                title - "Hello Skolloble"
            }
            body /
                button: disabled -
                    a: href"https://github.com/" target"_blank" -
                        "Click to go Github !"""".trimIndent()

val generatedHtml = skollobleToXml(testResource)
val minimizedHtml = skollobleToXmlMinimize(testResource)

println(generatedHtml)
println(minimizedHtml)
```
##### // output
```

<html>
    <head>
        <meta charset=""utf-8""/>    
        <title>Hello Skolloble</title>
    </head>
    <body>
        <button disabled="disabled">
            <a href=""https://github.com/"" target=""_blank"">Click to go Github !</a>
        </button>
    </body>
</html>
<html><head><meta charset=""utf-8""/><title>Hello Skolloble</title></head><body xmlns:a=""[uri]""><a:button disabled="disabled"><a:a href=""https://github.com/"" target=""_blank"">Click to go Github !</a></button></body></html>
```
