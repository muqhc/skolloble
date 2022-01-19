plugins {
    antlr
}

dependencies {
    antlr("org.antlr:antlr4:4.9.3")
}

tasks {
    generateGrammarSource {
        maxHeapSize = "64m"
    }
}