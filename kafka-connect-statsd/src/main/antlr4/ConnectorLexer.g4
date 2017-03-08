lexer grammar ConnectorLexer;
@ header {
 }


SEND
   : 'send' | 'SEND'
   ;

COUNT
   : 'count()' | 'COUNT()'
   ;

VALUE
   : 'value()' | 'VALUE()'
   ;

OF
   : 'of' | 'OF'
   ;

TO
   : 'to' | 'TO'
   ;

FROM
   : 'from' | 'FROM'
   ;

WHERE
   : 'where' | 'WHERE'
   ;

STRING
   : '\''.*'\''
   ;

INT
   : ( '0' .. '9' )+
   ;


DECIMAL
  : INT'.'INT
  ;

EQUALS
   : '='
   ;

START_TEMPLATE
   : '${'
   ;

END_TEMPLATE
  : '}'
  ;

WORD
   : ( 'a' .. 'z' | 'A' .. 'Z' )
   ;

ID
   : ( WORD ( '0' .. '9' )? )+
   ;

METRIC
   : ( WORD | '.' )+
   ;

TOPICNAME
   : ( METRIC | METRIC ( '-' | '+' | '/' | '_' )? )+
   ;



ASTERISK
   : '*'
   ;

WS
  : ( ' ' | '\t' | '\n' | '\r' )+ -> skip
  ;