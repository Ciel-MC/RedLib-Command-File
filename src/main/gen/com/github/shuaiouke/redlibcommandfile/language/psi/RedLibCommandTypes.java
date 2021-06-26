// This is a generated file. Not intended for manual editing.
package com.github.shuaiouke.redlibcommandfile.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.shuaiouke.redlibcommandfile.language.psi.impl.*;

public interface RedLibCommandTypes {

  IElementType ASSERT_LINE = new RedLibCommandElementType("ASSERT_LINE");
  IElementType CLOSE_BRACKET = new RedLibCommandElementType("CLOSE_BRACKET");
  IElementType COMMAND_DEFINITION = new RedLibCommandElementType("COMMAND_DEFINITION");
  IElementType COMMAND_PROPERTY = new RedLibCommandElementType("COMMAND_PROPERTY");
  IElementType CONTEXT_LINE = new RedLibCommandElementType("CONTEXT_LINE");
  IElementType HELP_LINE = new RedLibCommandElementType("HELP_LINE");
  IElementType HOOK_LINE = new RedLibCommandElementType("HOOK_LINE");
  IElementType NO_HELP_LINE = new RedLibCommandElementType("NO_HELP_LINE");
  IElementType NO_TAB_LINE = new RedLibCommandElementType("NO_TAB_LINE");
  IElementType OPEN_BRACKET = new RedLibCommandElementType("OPEN_BRACKET");
  IElementType PERMISSION_LINE = new RedLibCommandElementType("PERMISSION_LINE");
  IElementType POST_ARG_LINE = new RedLibCommandElementType("POST_ARG_LINE");
  IElementType USER_LINE = new RedLibCommandElementType("USER_LINE");

  IElementType ALIAS = new RedLibCommandTokenType("alias");
  IElementType ALIASSEPARATOR = new RedLibCommandTokenType("aliasseparator");
  IElementType ASSERT = new RedLibCommandTokenType("assert");
  IElementType ASSERTNAME = new RedLibCommandTokenType("assertname");
  IElementType COMMANDNAME = new RedLibCommandTokenType("commandname");
  IElementType COMMENT = new RedLibCommandTokenType("#");
  IElementType CONTEXT = new RedLibCommandTokenType("context");
  IElementType CONTEXTNAME = new RedLibCommandTokenType("contextname");
  IElementType DOT = new RedLibCommandTokenType("DOT");
  IElementType HELP = new RedLibCommandTokenType("help");
  IElementType HELPMESSAGE = new RedLibCommandTokenType("helpmessage");
  IElementType HOOK = new RedLibCommandTokenType("hook");
  IElementType HOOKNAME = new RedLibCommandTokenType("hookname");
  IElementType NEWLINE = new RedLibCommandTokenType("newline");
  IElementType NOHELP = new RedLibCommandTokenType("nohelp");
  IElementType NOTAB = new RedLibCommandTokenType("notab");
  IElementType OBRACKET = new RedLibCommandTokenType("OBRACKET");
  IElementType PERMISSION = new RedLibCommandTokenType("permission");
  IElementType PERMISSION_VALUE = new RedLibCommandTokenType("PERMISSION_VALUE");
  IElementType POSTARG = new RedLibCommandTokenType("postarg");
  IElementType SEPARATOR = new RedLibCommandTokenType("separator");
  IElementType SPACE = new RedLibCommandTokenType("SPACE");
  IElementType USER = new RedLibCommandTokenType("user");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ASSERT_LINE) {
        return new RedLibCommandAssertLineImpl(node);
      }
      else if (type == CLOSE_BRACKET) {
        return new RedLibCommandCloseBracketImpl(node);
      }
      else if (type == COMMAND_DEFINITION) {
        return new RedLibCommandCommandDefinitionImpl(node);
      }
      else if (type == COMMAND_PROPERTY) {
        return new RedLibCommandCommandPropertyImpl(node);
      }
      else if (type == CONTEXT_LINE) {
        return new RedLibCommandContextLineImpl(node);
      }
      else if (type == HELP_LINE) {
        return new RedLibCommandHelpLineImpl(node);
      }
      else if (type == HOOK_LINE) {
        return new RedLibCommandHookLineImpl(node);
      }
      else if (type == NO_HELP_LINE) {
        return new RedLibCommandNoHelpLineImpl(node);
      }
      else if (type == NO_TAB_LINE) {
        return new RedLibCommandNoTabLineImpl(node);
      }
      else if (type == OPEN_BRACKET) {
        return new RedLibCommandOpenBracketImpl(node);
      }
      else if (type == PERMISSION_LINE) {
        return new RedLibCommandPermissionLineImpl(node);
      }
      else if (type == POST_ARG_LINE) {
        return new RedLibCommandPostArgLineImpl(node);
      }
      else if (type == USER_LINE) {
        return new RedLibCommandUserLineImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
