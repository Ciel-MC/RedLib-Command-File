// This is a generated file. Not intended for manual editing.
package com.github.shuaiouke.redlibcommandfile.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.shuaiouke.redlibcommandfile.language.psi.impl.*;

public interface RedLibCommandTypes {

  IElementType ARG = new RedLibCommandElementType("ARG");
  IElementType ARGS = new RedLibCommandElementType("ARGS");
  IElementType ARGS_CONSUME = new RedLibCommandElementType("ARGS_CONSUME");
  IElementType ARGUMENT = new RedLibCommandElementType("ARGUMENT");
  IElementType ASSERT_LINE = new RedLibCommandElementType("ASSERT_LINE");
  IElementType BLANK_LINE = new RedLibCommandElementType("BLANK_LINE");
  IElementType CLOSE_BRACKET = new RedLibCommandElementType("CLOSE_BRACKET");
  IElementType COMMAND_DEF = new RedLibCommandElementType("COMMAND_DEF");
  IElementType COMMAND_DEFINITION = new RedLibCommandElementType("COMMAND_DEFINITION");
  IElementType COMMAND_DEFINITION_CONSUME = new RedLibCommandElementType("COMMAND_DEFINITION_CONSUME");
  IElementType COMMAND_PROPERTY = new RedLibCommandElementType("COMMAND_PROPERTY");
  IElementType COMMAND_PROPERTY_CONSUME = new RedLibCommandElementType("COMMAND_PROPERTY_CONSUME");
  IElementType CONSUMING_ARG = new RedLibCommandElementType("CONSUMING_ARG");
  IElementType CONTEXT_LINE = new RedLibCommandElementType("CONTEXT_LINE");
  IElementType FLAG = new RedLibCommandElementType("FLAG");
  IElementType HELP_LINE = new RedLibCommandElementType("HELP_LINE");
  IElementType HELP_MSG_LINE = new RedLibCommandElementType("HELP_MSG_LINE");
  IElementType HOOK_LINE = new RedLibCommandElementType("HOOK_LINE");
  IElementType LINE = new RedLibCommandElementType("LINE");
  IElementType LINE_CONSUME = new RedLibCommandElementType("LINE_CONSUME");
  IElementType NO_HELP_LINE = new RedLibCommandElementType("NO_HELP_LINE");
  IElementType NO_TAB_LINE = new RedLibCommandElementType("NO_TAB_LINE");
  IElementType OPEN_BRACKET = new RedLibCommandElementType("OPEN_BRACKET");
  IElementType PERMISSION_LINE = new RedLibCommandElementType("PERMISSION_LINE");
  IElementType POST_ARG_LINE = new RedLibCommandElementType("POST_ARG_LINE");
  IElementType USER_LINE = new RedLibCommandElementType("USER_LINE");

  IElementType ALIAS = new RedLibCommandTokenType("alias");
  IElementType ALIASSEPARATOR = new RedLibCommandTokenType("aliasseparator");
  IElementType ARG_NAME = new RedLibCommandTokenType("ARG_NAME");
  IElementType ARG_TYPE = new RedLibCommandTokenType("ARG_TYPE");
  IElementType ARG_TYPE_CONSUME = new RedLibCommandTokenType("ARG_TYPE_CONSUME");
  IElementType ASSERT = new RedLibCommandTokenType("assert");
  IElementType ASSERTNAME = new RedLibCommandTokenType("assertname");
  IElementType BOTHMODIFIERS = new RedLibCommandTokenType("bothmodifiers");
  IElementType BRACKET_CLOSE = new RedLibCommandTokenType("BRACKET_CLOSE");
  IElementType BRACKET_OPEN = new RedLibCommandTokenType("BRACKET_OPEN");
  IElementType COMMA = new RedLibCommandTokenType("COMMA");
  IElementType COMMANDNAME = new RedLibCommandTokenType("commandname");
  IElementType COMMENT = new RedLibCommandTokenType("#");
  IElementType CONTEXT = new RedLibCommandTokenType("context");
  IElementType CONTEXTNAME = new RedLibCommandTokenType("contextname");
  IElementType DASHES = new RedLibCommandTokenType("DASHES");
  IElementType DEFAULT_VALUE = new RedLibCommandTokenType("DEFAULT_VALUE");
  IElementType DOT = new RedLibCommandTokenType("DOT");
  IElementType FLAG_MODIFIER = new RedLibCommandTokenType("FLAG_MODIFIER");
  IElementType FLAG_NAME = new RedLibCommandTokenType("FLAG_NAME");
  IElementType HELP = new RedLibCommandTokenType("help");
  IElementType HELPMESSAGE = new RedLibCommandTokenType("helpmessage");
  IElementType HELPMESSAGEKEY = new RedLibCommandTokenType("helpmessagekey");
  IElementType HELPMSG = new RedLibCommandTokenType("helpmsg");
  IElementType HELPMSGKEY = new RedLibCommandTokenType("helpmsgkey");
  IElementType HOOK = new RedLibCommandTokenType("hook");
  IElementType HOOKNAME = new RedLibCommandTokenType("hookname");
  IElementType NEWLINE = new RedLibCommandTokenType("newline");
  IElementType NOHELP = new RedLibCommandTokenType("nohelp");
  IElementType NOSHOWTYPE = new RedLibCommandTokenType("noshowtype");
  IElementType NOTAB = new RedLibCommandTokenType("notab");
  IElementType NOTREQUIRED = new RedLibCommandTokenType("notrequired");
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
      if (type == ARG) {
        return new RedLibCommandArgImpl(node);
      }
      else if (type == ARGS) {
        return new RedLibCommandArgsImpl(node);
      }
      else if (type == ARGS_CONSUME) {
        return new RedLibCommandArgsConsumeImpl(node);
      }
      else if (type == ARGUMENT) {
        return new RedLibCommandArgumentImpl(node);
      }
      else if (type == ASSERT_LINE) {
        return new RedLibCommandAssertLineImpl(node);
      }
      else if (type == BLANK_LINE) {
        return new RedLibCommandBlankLineImpl(node);
      }
      else if (type == CLOSE_BRACKET) {
        return new RedLibCommandCloseBracketImpl(node);
      }
      else if (type == COMMAND_DEF) {
        return new RedLibCommandCommandDefImpl(node);
      }
      else if (type == COMMAND_DEFINITION) {
        return new RedLibCommandCommandDefinitionImpl(node);
      }
      else if (type == COMMAND_DEFINITION_CONSUME) {
        return new RedLibCommandCommandDefinitionConsumeImpl(node);
      }
      else if (type == COMMAND_PROPERTY) {
        return new RedLibCommandCommandPropertyImpl(node);
      }
      else if (type == COMMAND_PROPERTY_CONSUME) {
        return new RedLibCommandCommandPropertyConsumeImpl(node);
      }
      else if (type == CONSUMING_ARG) {
        return new RedLibCommandConsumingArgImpl(node);
      }
      else if (type == CONTEXT_LINE) {
        return new RedLibCommandContextLineImpl(node);
      }
      else if (type == FLAG) {
        return new RedLibCommandFlagImpl(node);
      }
      else if (type == HELP_LINE) {
        return new RedLibCommandHelpLineImpl(node);
      }
      else if (type == HELP_MSG_LINE) {
        return new RedLibCommandHelpMsgLineImpl(node);
      }
      else if (type == HOOK_LINE) {
        return new RedLibCommandHookLineImpl(node);
      }
      else if (type == LINE) {
        return new RedLibCommandLineImpl(node);
      }
      else if (type == LINE_CONSUME) {
        return new RedLibCommandLineConsumeImpl(node);
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
