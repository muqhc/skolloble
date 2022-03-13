package io.github.muqhc.skollobleparser

import io.github.muqhc.skollobleparser.raw.SkollobleParser

class Attribute(val attributeContext: SkollobleParser.AttributeContext) {
    val id = attributeContext.name().ID().text
    val namespace = attributeContext.name().forenamespace()?.ID()?.text ?: attributeContext.name().backnamespace()?.ID()?.text
    val value = attributeContext.STRING()?.text?.drop(1)?.dropLast(1) ?: id
}