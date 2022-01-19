import io.github.muqhc.skollobleparser.SkollobleParser

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

}