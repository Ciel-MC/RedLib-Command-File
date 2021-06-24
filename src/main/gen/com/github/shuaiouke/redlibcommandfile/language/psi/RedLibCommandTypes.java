// This is a generated file. Not intended for manual editing.
package com.github.shuaiouke.redlibcommandfile.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.shuaiouke.redlibcommandfile.language.psi.impl.*;

public interface RedLibCommandTypes {

  IElementType CLOSE_BRACKET = new RedLibCommandElementType("CLOSE_BRACKET");
  IElementType COMMAND_PROPERTY = new RedLibCommandElementType("COMMAND_PROPERTY");
  IElementType FIRST_COMMAND = new RedLibCommandElementType("FIRST_COMMAND");
  IElementType HELP_LINE = new RedLibCommandElementType("HELP_LINE");
  IElementType OPEN_BRACKET = new RedLibCommandElementType("OPEN_BRACKET");
  IElementType PERMISSION_LINE = new RedLibCommandElementType("PERMISSION_LINE");
  IElementType PROPERTIES = new RedLibCommandElementType("PROPERTIES");
  IElementType SUB_COMMAND = new RedLibCommandElementType("SUB_COMMAND");

  IElementType ALIAS = new RedLibCommandTokenType("alias");
  IElementType ALIAS_SEPARATOR = new RedLibCommandTokenType("Alias_Separator");
  IElementType ASSERTLINE = new RedLibCommandTokenType("AssertLine");
  IElementType CBRACKET = new RedLibCommandTokenType("CBRACKET");
  IElementType COMMANDDEFINITION = new RedLibCommandTokenType("CommandDefinition");
  IElementType COMMANDNAME = new RedLibCommandTokenType("CommandName");
  IElementType COMMENT = new RedLibCommandTokenType("#");
  IElementType CONTEXTLINE = new RedLibCommandTokenType("ContextLine");
  IElementType DOT = new RedLibCommandTokenType("DOT");
  IElementType ENDLINE = new RedLibCommandTokenType("ENDLINE");
  IElementType HELP = new RedLibCommandTokenType("help");
  IElementType HELPMESSAGE = new RedLibCommandTokenType("HelpMessage");
  IElementType HELPMSGLINE = new RedLibCommandTokenType("HelpMsgLine");
  IElementType HOOKLINE = new RedLibCommandTokenType("HookLine");
  IElementType NEWLINE = new RedLibCommandTokenType("newline");
  IElementType NOHELP = new RedLibCommandTokenType("NoHelp");
  IElementType NOTAB = new RedLibCommandTokenType("NoTab");
  IElementType OBRACKET = new RedLibCommandTokenType("OBRACKET");
  IElementType PERMISSION = new RedLibCommandTokenType("permission");
  IElementType PERMISSION_VALUE = new RedLibCommandTokenType("PERMISSION_VALUE");
  IElementType POSTARGLINE = new RedLibCommandTokenType("PostArgLine");
  IElementType SEPARATOR = new RedLibCommandTokenType("Separator");
  IElementType SPACE = new RedLibCommandTokenType("SPACE");
  IElementType USERLINE = new RedLibCommandTokenType("UserLine");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == CLOSE_BRACKET) {
        return new RedLibCommandCloseBracketImpl(node);
      }
      else if (type == COMMAND_PROPERTY) {
        return new RedLibCommandCommandPropertyImpl(node);
      }
      else if (type == FIRST_COMMAND) {
        return new RedLibCommandFirstCommandImpl(node);
      }
      else if (type == HELP_LINE) {
        return new RedLibCommandHelpLineImpl(node);
      }
      else if (type == OPEN_BRACKET) {
        return new RedLibCommandOpenBracketImpl(node);
      }
      else if (type == PERMISSION_LINE) {
        return new RedLibCommandPermissionLineImpl(node);
      }
      else if (type == PROPERTIES) {
        return new RedLibCommandPropertiesImpl(node);
      }
      else if (type == SUB_COMMAND) {
        return new RedLibCommandSubCommandImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
