import io.github.muqhc.skollobletoxml.skollobleToXml
import java.io.File

fun main() {

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

    File("generated-from-skolloble.html").run {
        writeText(
            generatedHtml
        )
        println(readText())
        createNewFile()
    }

}