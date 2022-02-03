grammar Skolloble ;

file
    :   element
    ;

element
    :   ID namespace? attribution? block
    |   STRING
    ;

attribution
    :   INTOATTR attribute+
    ;

block
    :   INTOBLOCK element* GoOutBLOCK
    |   WholeWrap element+
    |   SingleBlock element
    |   NoBlock
    ;

attribute
    :   ID namespace? STRING?
    ;

namespace
    :   NamespaceSign ID
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
fragment IDSUR
    :   [_a-zA-Z0-9]  ;

fragment IDINNER
    :   [0-9a-zA-Z_.]|'-'  ;

fragment NAMING
    :   IDSUR+ (IDINNER+ IDSUR)?  ;

NamespaceSign
    :   '@'  ;

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


