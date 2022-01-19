package io.github.muqhc.skollobletoxml

import io.github.muqhc.skollobleparser.Element
import io.github.muqhc.skollobleparser.SkollobleParser

fun skollobleToXml(skolloble: String): String = skollobleToXml(SkollobleParser(skolloble).rootElement)

fun skollobleToXml(element: Element) = skollobleToXml(element,"")

internal fun skollobleToXml(element: Element, prefix: String): String =
    if (element.children.isEmpty() && element.strings.isEmpty()) "\n$prefix<${element.name} ${attributeGen(element)}/>"
    else "\n$prefix<${element.name}${attributeGen(element)}>" +
            element.children.joinToString(prefix) { skollobleToXml(it, "$prefix    ") } +
            element.strings.let { if (it.isEmpty()) "" else it.joinToString("\n$prefix    ","\n$prefix    ") } +
            "\n$prefix</${element.name}>"

internal fun attributeGen(element: Element) =
    element.attribution.entries.let {
        if (it.isEmpty()) ""
        else it.joinToString(" ", " ") { (key, value) -> "$key=\"$value\"" }
    }
