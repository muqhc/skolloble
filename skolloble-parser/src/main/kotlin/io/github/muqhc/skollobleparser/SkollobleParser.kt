package io.github.muqhc.skollobleparser

import io.github.muqhc.skollobleparser.raw.SkollobleParser as rawParser
import io.github.muqhc.skollobleparser.raw.SkollobleLexer as rawLexer
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream

class SkollobleParser(value: String) {
    private val parser: rawParser = rawParser(CommonTokenStream(rawLexer(ANTLRInputStream(value))))
    val rootElement: Element = Element(parser.file().element())
}