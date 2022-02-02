import io.github.muqhc.skollobletoxml.skollobleToXml
import io.github.muqhc.skollobletoxml.skollobleToXmlMinimize
import java.io.File

fun main() {

    val testResource = """
        html /
            head {
                meta : charset"utf-8" \
                title - "Hello Skolloble"
            }
            body: xmlns@a "uri" /
                button@a: disabled -
                    a@a: href"https://github.com/" target"_blank" -
                        "Click to go Github !"""".trimIndent()

    val generatedHtml = skollobleToXml(testResource).also(::println)
    val minimizedHtml = skollobleToXmlMinimize(testResource).also(::println)

}