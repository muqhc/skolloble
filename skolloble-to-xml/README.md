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
    implementation("io.github.muqhc:skolloble-to-xml:1.2.1")
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
        <a:button disabled="disabled">
            <a:a href=""https://github.com/"" target=""_blank"">Click to go Github !</a>
        </button>
    </body>
</html>
<html><head><meta charset=""utf-8""/><title>Hello Skolloble</title></head><body xmlns:a=""[uri]""><a:button disabled="disabled"><a:a href=""https://github.com/"" target=""_blank"">Click to go Github !</a></button></body></html>
```
