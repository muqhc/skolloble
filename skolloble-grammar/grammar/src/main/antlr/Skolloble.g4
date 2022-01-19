grammar Skolloble ;

file
    :   element
    ;

element
    :   ID attribution? block?
    |   STRING
    ;

attribution
    :   INTOATTR attribute+
    ;

block
    :   INTOBLOCK element+ GoOutBLOCK
    |   WholeWrap element+
    |   SingleBlock element
    |   NoBlock
    ;

attribute
    :   ID STRING?
    ;



// --Space--
NEWLINE
    :   ('\n'|'\r\n')     -> skip  ;

Space
    :   [ \t]+      -> skip  ;

// -- Keywords --
INTOATTR
    :   ':'  ;

// -- Identifier --
fragment IDHEAD
    :   [_a-zA-Z]  ;

fragment IDTAIL
    :   [0-9a-zA-Z_]|'-'  ;

fragment NAMING
    :   IDHEAD (IDTAIL)*  ;

ID
    :   NAMING  ;

WholeWrap
    :   '/'  ;

SingleBlock
    :   '-'  ;

NoBlock
    :   '\\'  ;

GoOutBLOCK
    :   '}'  ;

INTOBLOCK
    :   '{'  ;


STRING
    :   '"'.*?'"'  ;

// -- Commant --
Comment
    :   ';'.*?';'       -> skip  ;
