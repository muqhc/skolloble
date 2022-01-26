package io.github.muqhc.skollobletoxml.test

import io.github.muqhc.skollobletoxml.skollobleToXmlMinimize

class SkollobleToXmlTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("=================")
            skollobleToXmlMinimize("""
                html /
                    head {
                        meta : charset"utf-8" \
                        title - "Hello Skolloble"
                    }
                    body /
                        button: disabled -
                            a: href"https://github.com/" target"_blank" -
                                "Click to go Github !"
            """.trimIndent()).also(::println)
            println("=================")
        }
    }
}