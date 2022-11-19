grammar fibanocci;

run      
  :prog {System.out.println("Success");}
  ; 
      
prog  
  : using_directive + class_ 
  | class_
  | decl 
  | def  
  | expr  
  | COMMENT
  | MULTILINE_COMMENT
  | EOF
  ;  
WS : [ \r\t\n] -> skip;

USING : 'using';
SYSTEM : 'System';
DOT : '.';
CLASS : 'class'; 
STATIC: 'static';
PUBLIC: 'public';
PRIVATE: 'private';
PROTECTED: 'protected';   
IF: 'if';
FOR: 'for';
WHILE: 'while';
TYPE: INT | CHAR | VOID| BOOL;
INT: 'int';
CHAR: 'char';
VOID: 'void';  
ID : [a-zA-Z]+ [a-zA-Z0-9_]* ;
OPEN_PARENS: '('; 
CLOSE_PARENS: ')'; 

visibility: PUBLIC | PRIVATE | PROTECTED;


output
	:CONSOLE '.' WRITE OPEN_PARENS STRING_LITERAL CLOSE_PARENS ';'
	|CONSOLE '.' WRITE OPEN_PARENS  ID + STRING_LITERAL CLOSE_PARENS ';'
	|CONSOLE '.' WRITE OPEN_PARENS ID CLOSE_PARENS ';'
	;
input
	:ID '=' TYPE '.' keyword '(' keyword '.' keyword ');'
	;



NUMBER: INTEGER_LITERAL| FLOAT_LITERAL| OCTAL_DIGITS | HEX_DIGITS;
INTEGER_LITERAL:[0-9]+ | '-'[0-9]+;
fragment FLOAT_LITERAL: [0-9]+ '.' [0-9]+ | '-'[0-9]+ '.' [0-9]+ ;
fragment OCTAL_DIGITS: '0' '0'..'7'+;
fragment HEX_DIGITS: '0x' ('0'..'9' | 'a'..'f' | 'A'..'F')+;

using_directive 
  : USING SYSTEM ';'                 
  | USING SYSTEM lib';' 
  ;

lib
  : DOT ID lib
  | DOT ID 
  ;  

class_ : visibility CLASS ID block ;

val : NUMBER | CHAR_LITERAL | STRING_LITERAL;
STRING_LITERAL: '"' ~('"')* '"';
CHAR_LITERAL:  '\'' ~('\'') '\'';

function_signature
	:OPEN_PARENS function_parameters ( ',' function_parameters )? CLOSE_PARENS
	;

function_parameters
	: TYPE  (dimension_specifier)* (ID| ARGS) 
	;
dimension_specifier
	: '[' INTEGER_LITERAL ']'
	| '['']'
	;

local_variable_declarator
	: ID ('=' local_variable_initializer )?
	| ID (',' local_variable_declarator)* 
	;

local_variable_initializer
	: val
	| ID
	| keyword DOT keyword '(' expr ')' ';'
	;  

def : TYPE? local_variable_declarator ';' 
    | funcHeader block 
    ; 
    
decl : visibility STATIC funcHeader block
   ;
block : prog
    | '{' stat* '}' 
    | stat*
    ;
  
expr 
   : STRING_LITERAL
   | STRINGS '+' ID
   | (ID|NUMBER) binaryoperator (ID|NUMBER)
   | ID unaryoperator 
   | unaryoperator ID 
   | '(' expr ')'
   ;
operators
	: unaryoperator
	| binaryoperator
	;
unaryoperator
	: '++'
	| '--'
	;
binaryoperator
	: arithmetic
	| logical
	| bitwise
	| assignment
	| relational
	;
arithmetic
	: '+'|'-'|'*'|'/'|'%'
	;
logical
	:'&&'|'||'|'!'
	;
bitwise
	:'<<'|'>>'|'|'|'^'|'&'|'~'
	;
assignment
	: arithmetic? '='
	;
relational
	: '<'|'<='|'>'|'>='|'=='|'!='
	;

stat 
	: output
	| input
	| keyword DOT keyword '(' expr ');'
	| FOR '(' def expr ';' expr ')' block 
	| IF '(' expr ')' block
	| WHILE '(' expr ')' block
	| ID '=' expr ';'
	| 'return' expr ';'
	| ID '=' expr ',' stat 
	| def
	| decl
	| MULTILINE_COMMENT
	| COMMENT
     ;
 
    
   
funcHeader : TYPE ID '(' args? ')'
         | TYPE 'Main(string[] args)'  
         ;

args : arg(',' arg)* ;

arg : TYPE ID ;

keyword: ABSTRACT
  | MAIN
  | CONSOLE
  | WRITE
  | AS
  | BASE
  | BOOL
  | BREAK
  | BYTE
  | CASE
  | CATCH
  | CHAR
  | CLASS
  | CONST
  | CONTINUE
  | DECIMAL
  | DEFAULT
  | DO
  | DOUBLE
  | ELSE
  | ENUM
  | EVENT
  | EXPLICIT
  | EXTERN
  | FALSE
  | FINALLY
  | FIXED
  | FLOAT
  | FOR
  | FOREACH
  | GOTO
  | IMPLICIT
  | IN
  | INT
  | INTERFACE
  | INTERNAL
  | IS
  | LOCK
  | LONG
  | NAMESPACE
  | NEW
  | NULL_
  | OBJECT
  | OPERATOR
  | OUT
  | OVERRIDE
  | PARAMS
  | PRIVATE
  | PROTECTED
  | PUBLIC
  | READONLY
  | REF
  | RETURN
  | SBYTE
  | SHORT
  | SIZEOF
  | STATIC
  | STRUCT
  | SWITCH
  | THIS
  | THROW
  | TRUE
  | TRY
  | TYPEOF
  | UINT
  | ULONG
  | USHORT
  | VIRTUAL
  | VOID
  | VOLATILE
  | WHILE
  | ARGS
  | PARSE
  | READLINE
  | ID
  | ADD
  | ALIAS
  | ARGLIST
  | ASCENDING
  | ASYNC
  | AWAIT
  | BY
  | DESCENDING
  | DYNAMIC
  | EQUALS
  | FROM
  | GET
  | GROUP
  | INTO
  | ORDERBY
  | PARTIAL
  | REMOVE
  | SELECT
  | SET
  | VAR
  | WHEN
  | WHERE
  | YIELD
  ;

COMMENT : '//' ~[\r\n]* -> channel(HIDDEN) ;
MULTILINE_COMMENT : '/*' .*? '*/' -> channel(HIDDEN) ;
ABSTRACT:      'abstract';
ADD:           'add';
ARGS:          'args';
PARSE:         'Parse';
READLINE:      'ReadLine()';
ALIAS:         'alias';
ARGLIST:       '__arglist';
AS:            'as';
ASCENDING:     'ascending';
ASYNC:         'async';
AWAIT:         'await';
BASE:          'base';
BOOL:          'bool';
BREAK:         'break';
BY:            'by';
BYTE:          'byte';
CASE:          'case';
CATCH:         'catch';
CHECKED:       'checked';
CONST:         'const';
CONTINUE:      'continue';
DECIMAL:       'decimal';
DEFAULT:       'default';
DELEGATE:      'delegate';
DESCENDING:    'descending';
DO:            'do';
DOUBLE:        'double';
DYNAMIC:       'dynamic';
ELSE:          'else';
ENUM:          'enum';
EQUALS:        'equals';
EVENT:         'event';
EXPLICIT:      'explicit';
EXTERN:        'extern';
FALSE:         'false';
FINALLY:       'finally';
FIXED:         'fixed';
FLOAT:         'float';
FOREACH:       'foreach';
FROM:          'from';
GET:           'get';
GOTO:          'goto';
GROUP:         'group';
IMPLICIT:      'implicit';
IN:            'in';
INTERFACE:     'interface';
INTERNAL:      'internal';
INTO:          'into';
IS:            'is';
JOIN:          'join';
LET:           'let';
LOCK:          'lock';
LONG:          'long';
NAMEOF:        'nameof';
NAMESPACE:     'namespace';
NEW:           'new';
NULL_:         'null';
OBJECT:        'object';
ON:            'on';
OPERATOR:      'operator';
ORDERBY:       'orderby';
OUT:           'out';
OVERRIDE:      'override';
PARAMS:        'params';
PARTIAL:       'partial';
READONLY:      'readonly';
REF:           'ref';
REMOVE:        'remove';
RETURN:        'return';
SBYTE:         'sbyte';
SEALED:        'sealed';
SELECT:        'select';
MAIN:          'Main';
CONSOLE:       'Console';
WRITE:         'Write';
SET:           'set';
SHORT:         'short';
SIZEOF:        'sizeof';
STACKALLOC:    'stackalloc';
STRINGS:        'string';
STRUCT:        'struct';
SWITCH:        'switch';
THIS:          'this';
THROW:         'throw';
TRUE:          'true';
TRY:           'try';
TYPEOF:        'typeof';
UINT:          'uint';
ULONG:         'ulong';
UNCHECKED:     'unchecked';
UNMANAGED:     'unmanaged';
UNSAFE:        'unsafe';
USHORT:        'ushort';
VAR:           'var';
VIRTUAL:       'virtual';
VOLATILE:      'volatile';
WHEN:          'when';
WHERE:         'where';
YIELD:         'yield';