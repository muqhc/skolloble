package io.github.muqhc.skollobleparser

import io.github.muqhc.skollobleparser.raw.SkollobleParser

class Element internal constructor (elementContext: SkollobleParser.ElementContext) {
    val name = elementContext.ID().text
    val children: List<Element> = elementContext.block()?.element()?.filter { it.ID() != null } ?.map { Element(it) } ?: emptyList()
    val strings: List<String> = elementContext.block()?.element()?.filter { it.STRING() != null } ?.map { it.STRING().text.removeSurrounding("\"","\"") } ?: emptyList()
    val attribution: Attribution = Attribution(elementContext.attribution())
}