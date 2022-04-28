# .skolloble  (.skble)

#### _skolloble, the markup language such as xml_

## Grammar

#### [grammar definition with antlr4](skolloble-grammar/grammar/src/main/antlr/Skolloble.g4)

### Comment
wrap texts with '*'
```
* It is a Comment! *
```

### element

```
name : attribute"value" / * under all child elements *

name : attribute"value" { * child elements * }

name : attribute"value" -  * single child element *

name : attribute"value" ;  * no child element *
```

#### text
```
name : attr"value" {
    "I'm a Text!"
    `I'm a Text too!`
}
```

#### short-attribute

attribute without "value"

```
name : shortattr1 shortattr2 ........
```

#### prefix
```
abc<>world : abc<>attr1"value" abc<>attr2"value" ....
```
```
world@abc : attr1@abc"value" attr2@abc"value" ....
```

### Tips

+ You can write `"Text"` or attribute's `"value"` like this...
  + ``` `Text` ```, ``` `value` ```
  + ``` ` it can include "double quates" ` ```

### ( Example )

#### ### simple html page

in skolloble......

```
html /
    head {
        meta : charset"utf-8" ;
        title - "Hello Skolloble"
    }
    body /
        button: disabled -
            a: href"https://github.com/" target"_blank" -
                "Click to go Github !"
```

in xml......

```
<html>
    <head>
        <meta charset="utf-8"/>    
        <title>Hello Skolloble</title>
    </head>
    <body>
        <button disabled="disabled">
            <a href="https://github.com/" target="_blank">Click to go Github !</a>
        </button>
    </body>
</html>
```

[example-code](skolloble-test)

## more

### parser

##### [skolloble-parser](skolloble-parser)

### skolloble to xml converter

##### [skolloble-to-xml](skolloble-to-xml)

### here to try skolloble

##### [![Discord Skolloble Testing Bot](https://cdn.discordapp.com/avatars/940828335754334209/efc1bfd6dd576e0728fa80c1a1bf38d3.webp?size=128) (Discord Server for Trying Skolloble)](https://discord.gg/yj9YKDyw)

