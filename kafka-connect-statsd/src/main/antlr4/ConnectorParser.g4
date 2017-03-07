parser grammar ConnectorParser;

options
   { tokenVocab = ConnectorLexer; }

send_count_basic
   : SEND COUNT OF TOPICNAME TO METRIC
   ;
