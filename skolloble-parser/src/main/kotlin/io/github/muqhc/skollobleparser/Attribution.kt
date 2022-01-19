package io.github.muqhc.skollobleparser

import io.github.muqhc.skollobleparser.raw.SkollobleParser

class Attribution(attributionContext: SkollobleParser.AttributionContext?): Map<String,String> {
    private val data: Map<String,String> = attributionContext?.attribute()?.associate {
        it.STRING()?.run {
            it.ID().text to it.STRING().text.removeSurrounding("\"", "\"")
        } ?: (it.ID().text to it.ID().text.removeSurrounding("\"", "\""))
    } ?: emptyMap()

    override val entries: Set<Map.Entry<String, String>>
        get() = data.entries
    override val keys: Set<String>
        get() = data.keys
    override val size: Int
        get() = data.size
    override val values: Collection<String>
        get() = data.values

    override fun containsKey(key: String): Boolean = data.containsKey(key)

    override fun containsValue(value: String): Boolean = data.containsValue(value)

    override fun get(key: String): String? = data[key]

    override fun isEmpty(): Boolean = data.isEmpty()
}