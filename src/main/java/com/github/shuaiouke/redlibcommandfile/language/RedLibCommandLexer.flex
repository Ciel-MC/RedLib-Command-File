package com.github.shuaiouke.redlibcommandfile.language;

import com.github.shuaiouke.redlibcommandfile.language.psi.RedLibCommandTypes;import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.github.shuaiouke.redlibcommandfile.language.psi.RedLibCommandTypes.*;

%%

%{
  public RedLibCommandLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class RedLibCommandLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

CRLF=\R
WORD=\w+
NEWLINE=[\r\n]
WHITE_SPACE=[\ \n\t\f]
SPACE=\s
EOL=\$

%state COMMAND
%state HELP HELPVALUE
%state PERMISSION PERMISSIONVALUE
%state USER USERVALUE

%%
<YYINITIAL> {
    "help" {yybegin(HELP);return RedLibCommandTypes.HELP;}
    "permission" {yybegin(PERMISSION);return RedLibCommandTypes.PERMISSION;}
    "user" {yybegin(USER);return RedLibCommandTypes.USER;}
    "}" {return CBRACKET;}
    {NEWLINE} {return NEWLINE;}
    {WORD} {yybegin(COMMAND);return COMMANDNAME;}
}

<COMMAND> {
    "," {return ALIAS_SEPARATOR;}
    "{" {yybegin(YYINITIAL);return OBRACKET;}
    {WORD} {return ALIAS;}
}

<HELP> {SPACE} {yybegin(HELPVALUE);return SEPARATOR;}
<HELPVALUE> {
    {NEWLINE} {yybegin(YYINITIAL);return ENDLINE;}
    {WORD} {return HELPMESSAGE;}
    {SPACE} {return SPACE;}
}

<PERMISSION> {SPACE} {yybegin(PERMISSIONVALUE);return SEPARATOR;}
<PERMISSIONVALUE> {
    {NEWLINE} {yybegin(YYINITIAL);return ENDLINE;}
    "." {return DOT;}
    {WORD} {return PERMISSION_VALUE;}
}

<USER> {SPACE} {yybegin(USERVALUE);return SEPARATOR;}
<USERVALUE> {
    {NEWLINE} {yybegin(YYINITIAL);return ENDLINE;}
}

[^] { return BAD_CHARACTER; }