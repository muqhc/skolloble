dependencies {
    implementation("org.antlr:antlr4-runtime:4.9.3")
    implementation(rootProject.project("${rootProject.name}-parser"))
    implementation(rootProject.project("${rootProject.name}-to-xml"))
}