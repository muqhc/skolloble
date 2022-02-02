package io.github.muqhc.skollobleparser

import io.github.muqhc.skollobleparser.raw.SkollobleParser

class Attribute(val attributeContext: SkollobleParser.AttributeContext) {
    val id = attributeContext.ID().text
    val namespace = attributeContext.namespace()?.ID()?.text
    val value = attributeContext.STRING()?.text ?: id
}