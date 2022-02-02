package io.github.muqhc.skollobleparser

import io.github.muqhc.skollobleparser.raw.SkollobleParser

class Attribution(attributionContext: SkollobleParser.AttributionContext?): Map<String,Attribute> {
    private val data: Map<String,Attribute> = attributionContext?.attribute()?.associate {
        it.ID().text + (if (it.namespace() == null) "" else (it.namespace().NamespaceSign().text+it.namespace().ID().text)) to Attribute(it)
    } ?: emptyMap()

    override val entries: Set<Map.Entry<String, Attribute>>
        get() = data.entries
    override val keys: Set<String>
        get() = data.keys
    override val size: Int
        get() = data.size
    override val values: Collection<Attribute>
        get() = data.values

    override fun containsKey(key: String): Boolean = data.containsKey(key)

    override fun containsValue(value: Attribute): Boolean = data.containsValue(value)

    override fun get(key: String): Attribute? = data[key]

    override fun isEmpty(): Boolean = data.isEmpty()
}