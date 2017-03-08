parser grammar ConnectorParser;

options
   { tokenVocab = ConnectorLexer; }

stat
   : send_basic
   ;


send_basic
   : SEND stattype OF field FROM topicname TO metric
   ;


field
   : MESSAGES|ID
   ;

stattype
   : COUNT | VALUE
   ;

topicname
   : TOPICNAME
   ;

metric
   : METRIC
   ;
