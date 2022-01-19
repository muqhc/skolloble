rootProject.name = "skolloble"

val grammar = "${rootProject.name}-grammar"

include("$grammar:grammar")

include("${rootProject.name}-parser")
include("${rootProject.name}-test")
include("${rootProject.name}-to-xml")
