package com.github.shuaiouke.redlibcommandfile.language;

import com.github.shuaiouke.redlibcommandfile.language.psi.RedLibCommandTypes;import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;import org.apache.xmlbeans.XmlCursor;

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

COMMENT="//".*
NOSHOWTYPE=\*
NOREQ=\?
NOSHOWTYPENOREQ=\*\?|\?\*
CRLF=\R
ESCAPED_QUOTE=\\[^\n]
UNESCAPED_QUOTE=[^\n()]
QUOTE=({ESCAPED_QUOTE}|{UNESCAPED_QUOTE})*
CONSUME_TOKEN="..."|"[]"
VAR_TYPE=\w+
DASH=-+
WORD=[\w\d][\w\d\-]*
ALPHA=\w+
NEWLINE=[\r\n]
WHITE_SPACE=[\ \n\t\f]
SPACE=\s
EOL=\$
HELPMESSAGE=([^\n])*
ESCAPED_CHAR=(\\[^\n])
UNESCAPED_CHAR=[^\n<>]
CONSTRAINT=\<({UNESCAPED_CHAR}|{ESCAPED_CHAR})*\>
FLAG_COLON=\:-+

%state COMMAND
%state NOARG
%state HELP HELPVALUE
%state HELPMSG HELPMSGVALUE
%state PERMISSION PERMISSIONVALUE
%state USER USERVALUE
%state HOOK HOOKVALUE
%state CONTEXT CONTEXTVALUE
%state ASSERT ASSERTVALUE
%state ARGS
%state FLAG
%state ARG
%state DEFAULTVALUE
%state POSTARGTYPE

%%
<YYINITIAL> {
    "helpmsg" {yybegin(HELPMSG);return RedLibCommandTypes.HELPMSG;}
    "help" {yybegin(HELP);return RedLibCommandTypes.HELP;}
    "permission" {yybegin(PERMISSION);return RedLibCommandTypes.PERMISSION;}
    "user" {yybegin(USER);return RedLibCommandTypes.USER;}
    "hook" {yybegin(HOOK);return RedLibCommandTypes.HOOK;}
    "nohelp" {yybegin(NOARG);return NOHELP;}
    "notab" {yybegin(NOARG);return NOTAB;}
    "postarg" {yybegin(NOARG);return POSTARG;}
    "hidesub" {yybegin(NOARG);return HIDESUB;}
    "context" {yybegin(CONTEXT);return RedLibCommandTypes.CONTEXT;}
    "assert" {yybegin(ASSERT);return RedLibCommandTypes.ASSERT;}
    "}" {return CBRACKET;}
    {NEWLINE} {return NEWLINE;}
    {SPACE} {return SPACE;}
    {WORD} {yybegin(COMMAND);return COMMANDNAME;}
    {COMMENT} {return COMMENT;}
}

<NOARG> {
    "{" {yybegin(YYINITIAL);return OBRACKET;}
    {NEWLINE} {yybegin(YYINITIAL);return NEWLINE;}
    {SPACE} {return SPACE;}
}

<COMMAND> {
    "," {return COMMA;}
    "{" {yybegin(YYINITIAL);return OBRACKET;}
    {NEWLINE} {return NEWLINE;}
    {SPACE} {yybegin(ARGS);return SPACE;}
    {WORD} {return ALIAS;}
}

<ARGS>
{
    ":" {yybegin(POSTARGTYPE);return COLON;}
    //skip to flag section
    {DASH} {yybegin(FLAG);return DASHES;}
    {NEWLINE} {yybegin(COMMAND);return NEWLINE;}
    "{" {yybegin(YYINITIAL);return OBRACKET;}
    {SPACE} {return SPACE;}
    {VAR_TYPE} {return ARG_TYPE;}
    {CONSUME_TOKEN} {return CONSUME_TOKEN;}
    {CONSTRAINT} {return CONSTRAINT;}
}

<POSTARGTYPE>
 {
    {WORD} {yybegin(ARG);return ARG_NAME;}
    {DASH} {yybegin(FLAG);return DASHES;}
    {NEWLINE} {yybegin(COMMAND);return NEWLINE;}
 }

<FLAG>
{
    "(" {yybegin(DEFAULTVALUE);return BRACKET_OPEN;}
    //For aliases
    "," {return COMMA;}
    {SPACE} {yybegin(ARGS);return SPACE;}
    {NEWLINE} {yybegin(COMMAND);return NEWLINE;}
    {DASH} {return DASHES;}
    //Report a flag name
    {WORD} {return FLAG_NAME;}
    {NOSHOWTYPE} {return FLAG_MODIFIER;}
}

<ARG>
{
    "(" {yybegin(DEFAULTVALUE);return BRACKET_OPEN;}
    ")" {yybegin(ARGS);return BRACKET_CLOSE;}
    {NOSHOWTYPE} {return NOSHOWTYPE;}
    {NOREQ} {return NOTREQUIRED;}
    {NOSHOWTYPENOREQ} {return BOTHMODIFIERS;}
    {NEWLINE} {yybegin(COMMAND);return NEWLINE;}
    {SPACE} {yybegin(ARGS);return SPACE;}
    {WORD} {return ARG_NAME;}
}

<DEFAULTVALUE>
{
    ")" {yybegin(ARGS);return BRACKET_CLOSE;}
    {QUOTE} {return DEFAULT_VALUE;}
}

<HELP> {NEWLINE} {yybegin(YYINITIAL);return NEWLINE;}
<HELP> {SPACE} {yybegin(HELPVALUE);return SPACE;}
<HELPVALUE> {
    "{" {yybegin(YYINITIAL);return OBRACKET;}
    {NEWLINE} {yybegin(YYINITIAL);return NEWLINE;}
    {HELPMESSAGE} {return HELPMESSAGE;}
    {SPACE} {return SPACE;}
}

<HELPMSG> {NEWLINE} {yybegin(YYINITIAL);return NEWLINE;}
<HELPMSG> {SPACE} {yybegin(HELPMSGVALUE);return SPACE;}
<HELPMSGVALUE> {
    "{" {yybegin(YYINITIAL);return OBRACKET;}
    {NEWLINE} {yybegin(YYINITIAL);return NEWLINE;}
    {HELPMESSAGE} {return HELPMSGKEY;}
    {SPACE} {return SPACE;}
}

<PERMISSION> {NEWLINE} {yybegin(YYINITIAL);return NEWLINE;}
<PERMISSION> {SPACE} {yybegin(PERMISSIONVALUE);return SPACE;}
<PERMISSIONVALUE> {
    "{" {yybegin(YYINITIAL);return OBRACKET;}
    {NEWLINE} {yybegin(YYINITIAL);return NEWLINE;}
    "." {return DOT;}
    {WORD} {return PERMISSION_VALUE;}
}

<USER> {NEWLINE} {yybegin(YYINITIAL);return NEWLINE;}
<USER> {SPACE} {yybegin(USERVALUE);return SPACE;}
<USERVALUE> {
    "{" {yybegin(YYINITIAL);return OBRACKET;}
    "player" {return PLAYER;}
    "console" {return CONSOLE;}
    "everyone" {return EVERYONE;}
    {NEWLINE} {yybegin(YYINITIAL);return NEWLINE;}
}

<HOOK> {NEWLINE} {yybegin(YYINITIAL);return NEWLINE;}
<HOOK> {SPACE} {yybegin(HOOKVALUE);return SPACE;}
<HOOKVALUE> {
    "{" {yybegin(YYINITIAL);return OBRACKET;}
    {NEWLINE} {yybegin(YYINITIAL);return NEWLINE;}
    {WORD} {return HOOKNAME;}
}

<CONTEXT> {NEWLINE} {yybegin(YYINITIAL);return NEWLINE;}
<CONTEXT> {SPACE} {yybegin(CONTEXTVALUE);return SPACE;}
<CONTEXTVALUE> {
    "{" {yybegin(YYINITIAL);return OBRACKET;}
    {NEWLINE} {yybegin(YYINITIAL);return NEWLINE;}
    {WORD} {return CONTEXTNAME;}
    {SPACE} {return SPACE;}
}

<ASSERT> {NEWLINE} {yybegin(YYINITIAL);return NEWLINE;}
<ASSERT> {SPACE} {yybegin(ASSERTVALUE);return SPACE;}
<ASSERTVALUE> {
    "{" {yybegin(YYINITIAL);return OBRACKET;}
    {NEWLINE} {yybegin(YYINITIAL);return NEWLINE;}
    {WORD} {return ASSERTNAME;}
    {SPACE} {return SPACE;}
}

[^] {return BAD_CHARACTER;}