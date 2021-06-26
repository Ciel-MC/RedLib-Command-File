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
%state NOARG
%state HELP HELPVALUE
%state PERMISSION PERMISSIONVALUE
%state USER USERVALUE
%state HOOK HOOKVALUE
%state CONTEXT CONTEXTVALUE
%state ASSERT ASSERTVALUE

%%
<YYINITIAL> {
    "help" {yybegin(HELP);return RedLibCommandTypes.HELP;}
    "permission" {yybegin(PERMISSION);return RedLibCommandTypes.PERMISSION;}
    "user" {yybegin(USER);return RedLibCommandTypes.USER;}
    "hook" {yybegin(HOOK);return RedLibCommandTypes.HOOK;}
    "nohelp" {yybegin(NOARG);return NOHELP;}
    "notab" {yybegin(NOARG);return NOTAB;}
    "postarg" {yybegin(NOARG);return POSTARG;}
    "context" {yybegin(CONTEXT);return RedLibCommandTypes.CONTEXT;}
    "assert" {yybegin(ASSERT);return RedLibCommandTypes.ASSERT;}
    {SPACE} {return SPACE;}
    {NEWLINE} {return NEWLINE;}
    {WORD} {yybegin(COMMAND);return COMMANDNAME;}
}

<NOARG> {NEWLINE} {return NEWLINE;}

<COMMAND> {
    "," {return ALIASSEPARATOR;}
    "{" {yybegin(YYINITIAL);return OBRACKET;}
    {NEWLINE} {return NEWLINE;}
    {SPACE} {return SPACE;}
    {WORD} {return ALIAS;}
}

<HELP> {NEWLINE} {yybegin(YYINITIAL);return NEWLINE;}
<HELP> {SPACE} {yybegin(HELPVALUE);return SEPARATOR;}
<HELPVALUE> {
    {NEWLINE} {yybegin(YYINITIAL);return NEWLINE;}
    {WORD} {return HELPMESSAGE;}
    {SPACE} {return SPACE;}
}

<PERMISSION> {NEWLINE} {yybegin(YYINITIAL);return NEWLINE;}
<PERMISSION> {SPACE} {yybegin(PERMISSIONVALUE);return SEPARATOR;}
<PERMISSIONVALUE> {
    {NEWLINE} {yybegin(YYINITIAL);return NEWLINE;}
    "." {return DOT;}
    {WORD} {return PERMISSION_VALUE;}
}

<USER> {NEWLINE} {yybegin(YYINITIAL);return NEWLINE;}
<USER> {SPACE} {yybegin(USERVALUE);return SEPARATOR;}
<USERVALUE> {
    {NEWLINE} {yybegin(YYINITIAL);return NEWLINE;}
}

<HOOK> {NEWLINE} {yybegin(YYINITIAL);return NEWLINE;}
<HOOK> {SPACE} {yybegin(HOOKVALUE);return SEPARATOR;}
<HOOKVALUE> {
    {NEWLINE} {yybegin(YYINITIAL);return NEWLINE;}
    {WORD} {return HOOKNAME;}
}

<CONTEXT> {NEWLINE} {yybegin(YYINITIAL);return NEWLINE;}
<CONTEXT> {SPACE} {yybegin(CONTEXTVALUE);return SEPARATOR;}
<CONTEXTVALUE> {
    {NEWLINE} {yybegin(YYINITIAL);return NEWLINE;}
    {WORD} {return CONTEXTNAME;}
    {SPACE} {return SPACE;}
}

<ASSERT> {NEWLINE} {yybegin(YYINITIAL);return NEWLINE;}
<ASSERT> {SPACE} {yybegin(ASSERTVALUE);return SEPARATOR;}
<ASSERTVALUE> {
    {NEWLINE} {yybegin(YYINITIAL);return NEWLINE;}
    {WORD} {return ASSERTNAME;}
    {SPACE} {return SPACE;}
}

[^] { return BAD_CHARACTER; }