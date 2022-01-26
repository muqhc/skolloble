# skolloble-to-xml

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
    implementation("io.github.muqhc:skolloble-to-xml:1.1.0")
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

val generatedHtml = skollobleToXml(testResource)  // generate xml from skolloble
val minimizedHtml = skollobleToXmlMinimize(testResource)  // generate minimized xml 

println(generatedHtml)
println(minimizedHtml)
```
##### // output
```

<html>
    <head>
        <meta  charset="utf-8"/>    
        <title>
            Hello Skolloble
        </title>
    </head>
    <body>
        <button disabled="disabled">
            <a href="https://github.com/" target="_blank">
                Click to go Github !
            </a>
        </button>
    </body>
</html>
<html><head><meta  charset="utf-8"/><title>Hello Skolloble</title></head><body><button disabled="disabled"><a href="https://github.com/" target="_blank">Click to go Github !</a></button></body></html>
```
