lexer grammar ConnectorLexer;
@ header {
 }


SEND
   : 'send' | 'SEND'
   ;

COUNT
   : 'count' | 'COUNT'
   ;

VALUE
   : 'value' | 'VALUE'
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


EQUALS
   : '='
   ;


TOPICNAME
   : ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9'| '.' | '-' | '+' | '/' )+
   ;

METRIC
   : ( 'a' .. 'z' | 'A' .. 'Z' | '.' | '0' .. '9' )+
   ;

MESSAGES
    : 'messages' | 'MESSAGES'
    ;

ID
   : ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
   ;

WS
  : ( ' ' | '\t' | '\n' | '\r' )+ -> skip
  ;