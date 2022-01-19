# skolloble-to-xml

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
    implementation("io.github.muqhc:skolloble-parser:1.0.0")
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
                meta : charset"utf-8" \
                title - "Hello Skolloble"
            }
            body /
                button: disabled -
                    a: href"https://github.com/" target"_blank" -
                        "Click to go Github !"""".trimIndent()

val skollobleParser = SkollobleParser(testResource)

println(
    skollobleParser
        .rootElement
        .children[1]
        .children[0]
        .children[0]
        .attribution
        .entries
)
```
##### // output
```
[href=https://github.com/, target=_blank]
```