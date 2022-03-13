package io.github.muqhc.skollobletoxml

import io.github.muqhc.skollobleparser.Element
import io.github.muqhc.skollobleparser.SkollobleParser

fun skollobleToXml(skolloble: String): String = skollobleToXml(SkollobleParser(skolloble).rootElement)

fun skollobleToXml(element: Element) = skollobleToXml(element,"")

internal fun skollobleToXml(element: Element, prefix: String): String =
    if (element.children.isEmpty() && element.strings.isEmpty()) "\n$prefix<${tagGen(element)}/>"
    else "\n$prefix<${tagGen(element)}>" +
            element.strings.let { if (it.isEmpty()) "" else it.joinToString("\n") } +
            element.children.run { if (isEmpty()) "" else joinToString(prefix, "","\n$prefix") { skollobleToXml(it, "$prefix    ") } } +
            "</${element.name}>"

fun skollobleToXmlMinimize(skolloble: String): String = skollobleToXmlMinimize(SkollobleParser(skolloble).rootElement)

internal fun skollobleToXmlMinimize(element: Element): String =
    if (element.children.isEmpty() && element.strings.isEmpty()) "<${tagGen(element)}/>"
    else "<${tagGen(element)}>" +
            element.children.joinToString("") { skollobleToXmlMinimize(it) } +
            element.strings.let { if (it.isEmpty()) "" else it.joinToString("\n") } +
            "</${element.name}>"

internal fun tagGen(element: Element) = "${if (element.namespace == null) "" else "${element.namespace}:"}${element.name}${attributeGen(element)}"

internal fun attributeGen(element: Element) =
    element.attribution.entries.let {
        if (it.isEmpty()) ""
        else it.joinToString(" "," ") { (key, value) -> "${if (value.namespace == null) "" else value.namespace+":"}${value.id}=\"${value.value}\"" }
    }
