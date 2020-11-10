grammar Caziel;

programa: ID '{' statement* '}';

statement: var | attr | expHead | condition | loop | io;

var: 'var' TIPO ((ID ';') | attr);

attr: ID OP_ATTR (expHead | literal) ';';

expHead: (ID | literal) expTail+;

expTail: op (ID | literal);

condition: conditionIf conditionElseIf* conditionElse?;

conditionIf: conditionIfHead conditionIfTail;
conditionIfHead: 'se' '(' (expHead | ID) ')';
conditionIfTail: 'entao' '{' statement* '}';

conditionElseIf: conditionElseIfHead conditionElseIfTail;
conditionElseIfHead: 'se nao' 'se' '(' (expHead | ID) ')';
conditionElseIfTail: 'entao' '{' statement* '}';

conditionElse: 'se nao' 'entao' '{' statement* '}';

loop: forLoop | whileLoop | doWhile;

forLoop: forLoopDecl forLoopBody;
forLoopDecl: forLoopDeclVar forLoopDeclCheck forLoopDeclUpdate;
forLoopDeclVar: 'para:' '(' (var | attr)? ';';
forLoopDeclCheck: expHead ';';
forLoopDeclUpdate: expHead ')';
forLoopBody: 'faca' '{' statement* '}';

whileLoop: whileLoopHead whileLoopTail;
whileLoopHead: 'enquanto:' '(' expHead ')';
whileLoopTail: 'faca' '{' statement* '}';

doWhile: doWhileHead doWhileTail;
doWhileHead: 'faca' '{' statement* '}';
doWhileTail: 'enquanto:' '(' expHead ')' ';';

io: entrada | saida;

op: OP_MAT_PREC_1 | OP_BOOL_PREC_1;

literal: STR | INT | DEC | BOOL;

STR: '"' [a-zA-Z0-9_: ]+ '"';

INT: [0-9]+;

DEC: [0-9]* '.' [0-9]+;

BOOL: 'verdadeiro' | 'falso';

TIPO: 'string' | 'inteiro' | 'decimal' | 'booleano';

entrada: 'leia:' TIPO ',' ID ';';

saida: 'imprima:' (ID | literal | expHead) ';';

ID: [a-zA-Z_$][a-zA-Z0-9_]*;

OP_MAT_PREC_1: '+' | '-' | '%' | OP_MAT_PREC_2;

OP_MAT_PREC_2: '*' | '/';

OP_BOOL_PREC_1: '||' | '&&' | OP_BOOL_PREC_2;

OP_BOOL_PREC_2: '<' | '<=' | '>' | '>=' | '==';

OP_ATTR: '=' | '+=' | '-=' | '*=' | '/=';

WS: [ \t\r\n]+ -> skip;