# .skolloble  (.skble)

#### _skolloble, the markup language like xml_

## Grammar

### Comment
wrap texts with ';'
```
; Hello Skolloble Comment! ;
```

### element

```
name : attribute"value" / ; wrap whole elements ;

name : attribute"value" { ; elements ; }

name : attribute"value" -  ; single element ;

name : attribute"value" \  ; no element ;
```

#### short-attribute

```
name : shortattr1 shortattr2 \
```

### ( example )

```
html /
    head {
        meta : charset"utf-8" \
        title - "Hello Skolloble"
    }
    body /
        button: disabled -
            a: href"https://github.com/" target"_blank" -
                "Click to go Github !"
```

<=>

```html
<html>
    <head>
        <meta  charset="utf-8"/>    
        <title>
            Hello Skolloble
        </title>
    </head>
    <body>
        <button disabled="disabled">
            <a href="https://github.com/" target="_blank">
                Click to go Github !
            </a>
        </button>
    </body>
</html>
```

[example-code](skolloble-test)

[skolloble-parser](skolloble-parser)

[skolloble-to-xml](skolloble-to-xml)

