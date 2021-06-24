// This is a generated file. Not intended for manual editing.
package com.github.shuaiouke.redlibcommandfile.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.shuaiouke.redlibcommandfile.language.psi.impl.*;

public interface RedLibCommandTypes {

  IElementType CLOSE_BRACKET = new RedLibCommandElementType("CLOSE_BRACKET");
  IElementType COMMAND_DEFINITION = new RedLibCommandElementType("COMMAND_DEFINITION");
  IElementType COMMAND_PROPERTY = new RedLibCommandElementType("COMMAND_PROPERTY");
  IElementType HELP_LINE = new RedLibCommandElementType("HELP_LINE");
  IElementType HOOK_LINE = new RedLibCommandElementType("HOOK_LINE");
  IElementType NO_HELP = new RedLibCommandElementType("NO_HELP");
  IElementType NO_TAB = new RedLibCommandElementType("NO_TAB");
  IElementType OPEN_BRACKET = new RedLibCommandElementType("OPEN_BRACKET");
  IElementType PERMISSION_LINE = new RedLibCommandElementType("PERMISSION_LINE");
  IElementType USER_LINE = new RedLibCommandElementType("USER_LINE");

  IElementType ALIAS = new RedLibCommandTokenType("alias");
  IElementType ALIAS_SEPARATOR = new RedLibCommandTokenType("Alias_Separator");
  IElementType ASSERTLINE = new RedLibCommandTokenType("AssertLine");
  IElementType COMMANDNAME = new RedLibCommandTokenType("CommandName");
  IElementType COMMENT = new RedLibCommandTokenType("#");
  IElementType CONTEXTLINE = new RedLibCommandTokenType("ContextLine");
  IElementType DOT = new RedLibCommandTokenType("DOT");
  IElementType HELP = new RedLibCommandTokenType("help");
  IElementType HELPMESSAGE = new RedLibCommandTokenType("HelpMessage");
  IElementType HELPMSGLINE = new RedLibCommandTokenType("HelpMsgLine");
  IElementType HOOK = new RedLibCommandTokenType("hook");
  IElementType HOOKNAME = new RedLibCommandTokenType("hookname");
  IElementType NEWLINE = new RedLibCommandTokenType("newline");
  IElementType NOHELP = new RedLibCommandTokenType("nohelp");
  IElementType NOTAB = new RedLibCommandTokenType("notab");
  IElementType OBRACKET = new RedLibCommandTokenType("OBRACKET");
  IElementType PERMISSION = new RedLibCommandTokenType("permission");
  IElementType PERMISSION_VALUE = new RedLibCommandTokenType("PERMISSION_VALUE");
  IElementType POSTARGLINE = new RedLibCommandTokenType("PostArgLine");
  IElementType SEPARATOR = new RedLibCommandTokenType("Separator");
  IElementType SPACE = new RedLibCommandTokenType("SPACE");
  IElementType USER = new RedLibCommandTokenType("user");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == CLOSE_BRACKET) {
        return new RedLibCommandCloseBracketImpl(node);
      }
      else if (type == COMMAND_DEFINITION) {
        return new RedLibCommandCommandDefinitionImpl(node);
      }
      else if (type == COMMAND_PROPERTY) {
        return new RedLibCommandCommandPropertyImpl(node);
      }
      else if (type == HELP_LINE) {
        return new RedLibCommandHelpLineImpl(node);
      }
      else if (type == HOOK_LINE) {
        return new RedLibCommandHookLineImpl(node);
      }
      else if (type == NO_HELP) {
        return new RedLibCommandNoHelpImpl(node);
      }
      else if (type == NO_TAB) {
        return new RedLibCommandNoTabImpl(node);
      }
      else if (type == OPEN_BRACKET) {
        return new RedLibCommandOpenBracketImpl(node);
      }
      else if (type == PERMISSION_LINE) {
        return new RedLibCommandPermissionLineImpl(node);
      }
      else if (type == USER_LINE) {
        return new RedLibCommandUserLineImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
