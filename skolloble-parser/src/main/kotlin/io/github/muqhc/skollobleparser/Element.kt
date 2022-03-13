package io.github.muqhc.skollobleparser

import io.github.muqhc.skollobleparser.raw.SkollobleParser

class Element(private val elementContext: SkollobleParser.ElementContext) {
    val name = elementContext.name().ID().text
    val namespace = elementContext.name()?.forenamespace()?.text ?: elementContext.name()?.backnamespace()?.text
    val children: List<Element> = elementContext.block()?.element()?.filter { it.name().ID() != null } ?.map { Element(it) } ?: emptyList()
    val strings: List<String> = elementContext.block()?.element()?.filter { it.STRING() != null } ?.map { it.STRING().text.drop(1).dropLast(1) } ?: emptyList()
    val attribution: Attribution = Attribution(elementContext.attribution())
}