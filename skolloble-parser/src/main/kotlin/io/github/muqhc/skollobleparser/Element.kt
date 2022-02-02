package io.github.muqhc.skollobleparser

import io.github.muqhc.skollobleparser.raw.SkollobleParser

class Element(private val elementContext: SkollobleParser.ElementContext) {
    val name = elementContext.ID().text
    val namespace = elementContext.namespace()?.ID()?.text
    val wholeID get() = (name + elementContext.namespace()?.NamespaceSign()?.text + namespace)
    val children: List<Element> = elementContext.block()?.element()?.filter { it.ID() != null } ?.map { Element(it) } ?: emptyList()
    val strings: List<String> = elementContext.block()?.element()?.filter { it.STRING() != null } ?.map { it.STRING().text.removeSurrounding("\"","\"") } ?: emptyList()
    val attribution: Attribution = Attribution(elementContext.attribution())
}