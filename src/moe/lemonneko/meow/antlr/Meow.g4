grammar Meow;

compilation_unit: file EOF;
file: file_header file_content comment*;
comment: SINGLE_LINE_COMMENT | MULTI_LINE_COMMENT | DOCUMENT;
file_header: package_define? package_using*;
file_content: (class_definition | variable | constant | function)*;
package_define: PACKAGE package_name;
package_using: USING package_name;
package_name: (ID DOT)*ID;
class_definition: modifier CLASS TYPE LEFT_BRACE class_body RIGHT_BRACE;
class_body: (variable | constant | function | class_definition)*;
constant: modifier VAL ID (COLON TYPE (EQUALS expression)? | EQUALS expression);
variable: modifier VAR ID (COLON TYPE (EQUALS expression)? | EQUALS expression);
function: function_define (function_body | EQUALS expression);
function_define: modifier FUN ID LEFT_BRACKET function_parameter RIGHT_BRACKET COLON TYPE;
function_parameter: (ID COLON TYPE)*;
function_body: LEFT_BRACE (variable | constant | expression)* RIGHT_BRACE;
modifier: (PRIVATE | PROTECTED | PUBLIC)? STATIC?;
function_invoke: (ID DOT)? ID LEFT_BRACKET (expression COMMA)*expression? RIGHT_BRACKET;
integer: DECIMAL_INTEGER | HEX_INTEGER | BINARY_INTEGER;
float_number: DECIMAL_FLOAT;
value: integer | float_number | STRING;
expression: LEFT_BRACKET expression RIGHT_BRACKET
          | function_invoke
          | value
          | ID
          | expression MUL expression
          | expression DIV expression
          | expression ADD expression
          | expression SUB expression;

SINGLE_LINE_COMMENT: '//'(.*?);
MULTI_LINE_COMMENT: '/*'(.*?)'*/';
DOCUMENT: '/**'(.*?)'*/';
PACKAGE: 'package';
USING: 'using';
DOT: '.';
CLASS: 'class';
TYPE: ([A-Z])+([a-zA-Z0-9] | '_')*;
LEFT_BRACE: '{';
RIGHT_BRACE: '}';
VAR: 'var';
VAL: 'val';
COLON: ':';
EQUALS: '=';
FUN: 'fun';
LEFT_BRACKET: '(';
RIGHT_BRACKET: ')';
PRIVATE: 'private';
PROTECTED: 'protected';
PUBLIC: 'public';
STATIC: 'static';
COMMA: ',';
DECIMAL_INTEGER: [0-9]+;
HEX_INTEGER: '0'('x' | 'X')[0-9A-Fa-f]+;
BINARY_INTEGER: [0-1]+;
DECIMAL_FLOAT: [0-9]+'.'[0-9]+;
STRING: '"'.*?'"';
MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
ID: ([a-zA-Z] | '_')+([a-zA-Z0-9] | '_')*;
WS: [ \n\t\r]+ -> skip;
