parser grammar ConnectorParser;

options
   { tokenVocab = ConnectorLexer; }

stat
   : send_with_where | send_basic
   ;

send_with_where
    : send_clause where_clause TO metric
    ;

send_basic
  : send_clause TO metric
  ;

send_clause
  : SEND stattype OF send_field FROM topicname
  ;

where_clause
  : WHERE  comparison
  ;

comparison
  : lhs comp_op rhs
  ;

comp_op
  : EQUALS
  ;

lhs
   : ID | WORD
   ;

rhs
   : STRING | INT | DECIMAL
   ;

field
   : ID|WORD
   ;

send_field
   : ASTERISK|ID|WORD
   ;

stattype
   : COUNT | VALUE
   ;

template
   : (START_TEMPLATE)field(END_TEMPLATE)
   ;


metric
  : (METRIC|WORD)template?
  ;

topicname
   : TOPICNAME|WORD|ID|METRIC
   ;


