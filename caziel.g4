grammar caziel;

programa: ID '{' statement* '}';

statement: var | attr | exp | condition | loop | io;

var: 'var' TIPO ((ID ';') | attr);

attr: ID OP_ATTR (exp | literal)';';

exp: (ID | literal) (op (ID | literal))+;

condition:
	'se' '(' (exp | ID) ')' 'entao' '{'
    statement*
  '}' ('se nao' 'se' '(' (exp | ID) ')' 'entao' '{'
    statement*
  '}')* ('se nao' 'entao' '{'
    statement*
  '}')? ('talvez' 'entao' '{'
    statement*
  '}')?;

loop: forLoop | whileLoop | doWhile;

forLoop:
	'para:' '(' (var | attr)? ';' exp ';' exp ')' 'faca' '{' statement* '}';

whileLoop: 'enquanto:' '(' exp ')' 'faca' '{' statement* '}';

doWhile: 'faca' '{' statement* '}' 'enquanto:' '(' exp ')' ';';

io: entrada | saida;

op: OP_MAT_PREC_1 | OP_BOOL_PREC_1;

literal: STR | INT | DEC | BOOL;

STR: '"' [a-zA-Z0-9_: ]+ '"';

INT: [0-9]+;

DEC: [0-9]* '.' [0-9]+;

BOOL: 'verdadeiro' | 'falso' | 'talvez';

TIPO: 'string' | 'inteiro' | 'decimal' | 'booleano';

entrada: 'leia:' ID ';';

saida: 'imprima:' (ID | literal | exp) ';';

ID: [a-zA-Z_$][a-zA-Z0-9_]*;

OP_MAT_PREC_1: '+' | '-' | '%' | OP_MAT_PREC_2;

OP_MAT_PREC_2: '*' | '/';

OP_BOOL_PREC_1: '||' | '&&' | OP_BOOL_PREC_2;

OP_BOOL_PREC_2: '<' | '<=' | '>' | '>=' | '==';

OP_ATTR: '=' | '+=' | '-=' | '*=' | '/=';

WS: [ \t\r\n] -> skip;