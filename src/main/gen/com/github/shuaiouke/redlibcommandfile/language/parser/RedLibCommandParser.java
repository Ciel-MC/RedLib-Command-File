// This is a generated file. Not intended for manual editing.
package com.github.shuaiouke.redlibcommandfile.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.shuaiouke.redlibcommandfile.language.psi.RedLibCommandTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class RedLibCommandParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return root(b, l + 1);
  }

  /* ********************************************************** */
  // ((ARG_TYPE? Flag) | (ARG_TYPE Argument)) (newline | SPACE)
  public static boolean Arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Arg")) return false;
    if (!nextTokenIs(b, "<arg>", ARG_TYPE, DASHES)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARG, "<arg>");
    r = Arg_0(b, l + 1);
    r = r && Arg_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (ARG_TYPE? Flag) | (ARG_TYPE Argument)
  private static boolean Arg_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Arg_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Arg_0_0(b, l + 1);
    if (!r) r = Arg_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ARG_TYPE? Flag
  private static boolean Arg_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Arg_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Arg_0_0_0(b, l + 1);
    r = r && Flag(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ARG_TYPE?
  private static boolean Arg_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Arg_0_0_0")) return false;
    consumeToken(b, ARG_TYPE);
    return true;
  }

  // ARG_TYPE Argument
  private static boolean Arg_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Arg_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ARG_TYPE);
    r = r && Argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // newline | SPACE
  private static boolean Arg_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Arg_1")) return false;
    boolean r;
    r = consumeToken(b, NEWLINE);
    if (!r) r = consumeToken(b, SPACE);
    return r;
  }

  /* ********************************************************** */
  // Arg*
  public static boolean Args(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Args")) return false;
    Marker m = enter_section_(b, l, _NONE_, ARGS, "<args>");
    while (true) {
      int c = current_position_(b);
      if (!Arg(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Args", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // Arg* ConsumingArg (ARG_TYPE? Flag (newline | SPACE))*
  public static boolean Args_Consume(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Args_Consume")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARGS_CONSUME, "<args consume>");
    r = Args_Consume_0(b, l + 1);
    r = r && ConsumingArg(b, l + 1);
    r = r && Args_Consume_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Arg*
  private static boolean Args_Consume_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Args_Consume_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Arg(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Args_Consume_0", c)) break;
    }
    return true;
  }

  // (ARG_TYPE? Flag (newline | SPACE))*
  private static boolean Args_Consume_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Args_Consume_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Args_Consume_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Args_Consume_2", c)) break;
    }
    return true;
  }

  // ARG_TYPE? Flag (newline | SPACE)
  private static boolean Args_Consume_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Args_Consume_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Args_Consume_2_0_0(b, l + 1);
    r = r && Flag(b, l + 1);
    r = r && Args_Consume_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ARG_TYPE?
  private static boolean Args_Consume_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Args_Consume_2_0_0")) return false;
    consumeToken(b, ARG_TYPE);
    return true;
  }

  // newline | SPACE
  private static boolean Args_Consume_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Args_Consume_2_0_2")) return false;
    boolean r;
    r = consumeToken(b, NEWLINE);
    if (!r) r = consumeToken(b, SPACE);
    return r;
  }

  /* ********************************************************** */
  // ARG_NAME (noshowtype | ((notrequired | bothmodifiers) ( BRACKET_OPEN DEFAULT_VALUE BRACKET_CLOSE)? ))?
  public static boolean Argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Argument")) return false;
    if (!nextTokenIs(b, ARG_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ARG_NAME);
    r = r && Argument_1(b, l + 1);
    exit_section_(b, m, ARGUMENT, r);
    return r;
  }

  // (noshowtype | ((notrequired | bothmodifiers) ( BRACKET_OPEN DEFAULT_VALUE BRACKET_CLOSE)? ))?
  private static boolean Argument_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Argument_1")) return false;
    Argument_1_0(b, l + 1);
    return true;
  }

  // noshowtype | ((notrequired | bothmodifiers) ( BRACKET_OPEN DEFAULT_VALUE BRACKET_CLOSE)? )
  private static boolean Argument_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Argument_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOSHOWTYPE);
    if (!r) r = Argument_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (notrequired | bothmodifiers) ( BRACKET_OPEN DEFAULT_VALUE BRACKET_CLOSE)?
  private static boolean Argument_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Argument_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Argument_1_0_1_0(b, l + 1);
    r = r && Argument_1_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // notrequired | bothmodifiers
  private static boolean Argument_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Argument_1_0_1_0")) return false;
    boolean r;
    r = consumeToken(b, NOTREQUIRED);
    if (!r) r = consumeToken(b, BOTHMODIFIERS);
    return r;
  }

  // ( BRACKET_OPEN DEFAULT_VALUE BRACKET_CLOSE)?
  private static boolean Argument_1_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Argument_1_0_1_1")) return false;
    Argument_1_0_1_1_0(b, l + 1);
    return true;
  }

  // BRACKET_OPEN DEFAULT_VALUE BRACKET_CLOSE
  private static boolean Argument_1_0_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Argument_1_0_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, BRACKET_OPEN, DEFAULT_VALUE, BRACKET_CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // assert separator assertname (SPACE assertname)
  public static boolean AssertLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssertLine")) return false;
    if (!nextTokenIs(b, ASSERT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ASSERT_LINE, null);
    r = consumeTokens(b, 2, ASSERT, SEPARATOR, ASSERTNAME);
    p = r; // pin = 2
    r = r && AssertLine_3(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // SPACE assertname
  private static boolean AssertLine_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssertLine_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SPACE, ASSERTNAME);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // newline
  public static boolean Blank_Line(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Blank_Line")) return false;
    if (!nextTokenIs(b, NEWLINE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEWLINE);
    exit_section_(b, m, BLANK_LINE, r);
    return r;
  }

  /* ********************************************************** */
  // SPACE* '}' (newline|<<eof>>)
  public static boolean Close_Bracket(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Close_Bracket")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLOSE_BRACKET, "<close bracket>");
    r = Close_Bracket_0(b, l + 1);
    r = r && consumeToken(b, "}");
    r = r && Close_Bracket_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // SPACE*
  private static boolean Close_Bracket_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Close_Bracket_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "Close_Bracket_0", c)) break;
    }
    return true;
  }

  // newline|<<eof>>
  private static boolean Close_Bracket_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Close_Bracket_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEWLINE);
    if (!r) r = eof(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CommandDefinition | CommandDefinition_Consume
  public static boolean CommandDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDef")) return false;
    if (!nextTokenIs(b, "<command def>", COMMANDNAME, SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMAND_DEF, "<command def>");
    r = CommandDefinition(b, l + 1);
    if (!r) r = CommandDefinition_Consume(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SPACE* commandname (aliasseparator alias)* (SPACE Args)? newline? Open_Bracket (Line | Blank_Line)* Close_Bracket
  public static boolean CommandDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition")) return false;
    if (!nextTokenIs(b, "<command definition>", COMMANDNAME, SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMAND_DEFINITION, "<command definition>");
    r = CommandDefinition_0(b, l + 1);
    r = r && consumeToken(b, COMMANDNAME);
    r = r && CommandDefinition_2(b, l + 1);
    r = r && CommandDefinition_3(b, l + 1);
    r = r && CommandDefinition_4(b, l + 1);
    r = r && Open_Bracket(b, l + 1);
    r = r && CommandDefinition_6(b, l + 1);
    r = r && Close_Bracket(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // SPACE*
  private static boolean CommandDefinition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "CommandDefinition_0", c)) break;
    }
    return true;
  }

  // (aliasseparator alias)*
  private static boolean CommandDefinition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CommandDefinition_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CommandDefinition_2", c)) break;
    }
    return true;
  }

  // aliasseparator alias
  private static boolean CommandDefinition_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ALIASSEPARATOR, ALIAS);
    exit_section_(b, m, null, r);
    return r;
  }

  // (SPACE Args)?
  private static boolean CommandDefinition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_3")) return false;
    CommandDefinition_3_0(b, l + 1);
    return true;
  }

  // SPACE Args
  private static boolean CommandDefinition_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SPACE);
    r = r && Args(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // newline?
  private static boolean CommandDefinition_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_4")) return false;
    consumeToken(b, NEWLINE);
    return true;
  }

  // (Line | Blank_Line)*
  private static boolean CommandDefinition_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CommandDefinition_6_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CommandDefinition_6", c)) break;
    }
    return true;
  }

  // Line | Blank_Line
  private static boolean CommandDefinition_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_6_0")) return false;
    boolean r;
    r = Line(b, l + 1);
    if (!r) r = Blank_Line(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // SPACE* commandname (aliasseparator alias)* (SPACE Args_Consume)? newline? Open_Bracket (Line_Consume | Blank_Line)* Close_Bracket
  public static boolean CommandDefinition_Consume(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Consume")) return false;
    if (!nextTokenIs(b, "<command definition consume>", COMMANDNAME, SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMAND_DEFINITION_CONSUME, "<command definition consume>");
    r = CommandDefinition_Consume_0(b, l + 1);
    r = r && consumeToken(b, COMMANDNAME);
    r = r && CommandDefinition_Consume_2(b, l + 1);
    r = r && CommandDefinition_Consume_3(b, l + 1);
    r = r && CommandDefinition_Consume_4(b, l + 1);
    r = r && Open_Bracket(b, l + 1);
    r = r && CommandDefinition_Consume_6(b, l + 1);
    r = r && Close_Bracket(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // SPACE*
  private static boolean CommandDefinition_Consume_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Consume_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "CommandDefinition_Consume_0", c)) break;
    }
    return true;
  }

  // (aliasseparator alias)*
  private static boolean CommandDefinition_Consume_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Consume_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CommandDefinition_Consume_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CommandDefinition_Consume_2", c)) break;
    }
    return true;
  }

  // aliasseparator alias
  private static boolean CommandDefinition_Consume_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Consume_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ALIASSEPARATOR, ALIAS);
    exit_section_(b, m, null, r);
    return r;
  }

  // (SPACE Args_Consume)?
  private static boolean CommandDefinition_Consume_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Consume_3")) return false;
    CommandDefinition_Consume_3_0(b, l + 1);
    return true;
  }

  // SPACE Args_Consume
  private static boolean CommandDefinition_Consume_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Consume_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SPACE);
    r = r && Args_Consume(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // newline?
  private static boolean CommandDefinition_Consume_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Consume_4")) return false;
    consumeToken(b, NEWLINE);
    return true;
  }

  // (Line_Consume | Blank_Line)*
  private static boolean CommandDefinition_Consume_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Consume_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CommandDefinition_Consume_6_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CommandDefinition_Consume_6", c)) break;
    }
    return true;
  }

  // Line_Consume | Blank_Line
  private static boolean CommandDefinition_Consume_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Consume_6_0")) return false;
    boolean r;
    r = Line_Consume(b, l + 1);
    if (!r) r = Blank_Line(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // (SPACE)* (HelpLine|PermissionLine|UserLine|HookLine|ContextLine|AssertLine|NoHelpLine|NoTabLine|PostArgLine|HelpMsgLine) newline
  public static boolean CommandProperty(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandProperty")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMAND_PROPERTY, "<command property>");
    r = CommandProperty_0(b, l + 1);
    r = r && CommandProperty_1(b, l + 1);
    r = r && consumeToken(b, NEWLINE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (SPACE)*
  private static boolean CommandProperty_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandProperty_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "CommandProperty_0", c)) break;
    }
    return true;
  }

  // HelpLine|PermissionLine|UserLine|HookLine|ContextLine|AssertLine|NoHelpLine|NoTabLine|PostArgLine|HelpMsgLine
  private static boolean CommandProperty_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandProperty_1")) return false;
    boolean r;
    r = HelpLine(b, l + 1);
    if (!r) r = PermissionLine(b, l + 1);
    if (!r) r = UserLine(b, l + 1);
    if (!r) r = HookLine(b, l + 1);
    if (!r) r = ContextLine(b, l + 1);
    if (!r) r = AssertLine(b, l + 1);
    if (!r) r = NoHelpLine(b, l + 1);
    if (!r) r = NoTabLine(b, l + 1);
    if (!r) r = PostArgLine(b, l + 1);
    if (!r) r = HelpMsgLine(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // (SPACE)* (HelpLine|PermissionLine|UserLine|HookLine|ContextLine|AssertLine|NoHelpLine|NoTabLine|HelpMsgLine) newline
  public static boolean CommandProperty_Consume(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandProperty_Consume")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMAND_PROPERTY_CONSUME, "<command property consume>");
    r = CommandProperty_Consume_0(b, l + 1);
    r = r && CommandProperty_Consume_1(b, l + 1);
    r = r && consumeToken(b, NEWLINE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (SPACE)*
  private static boolean CommandProperty_Consume_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandProperty_Consume_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "CommandProperty_Consume_0", c)) break;
    }
    return true;
  }

  // HelpLine|PermissionLine|UserLine|HookLine|ContextLine|AssertLine|NoHelpLine|NoTabLine|HelpMsgLine
  private static boolean CommandProperty_Consume_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandProperty_Consume_1")) return false;
    boolean r;
    r = HelpLine(b, l + 1);
    if (!r) r = PermissionLine(b, l + 1);
    if (!r) r = UserLine(b, l + 1);
    if (!r) r = HookLine(b, l + 1);
    if (!r) r = ContextLine(b, l + 1);
    if (!r) r = AssertLine(b, l + 1);
    if (!r) r = NoHelpLine(b, l + 1);
    if (!r) r = NoTabLine(b, l + 1);
    if (!r) r = HelpMsgLine(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ARG_TYPE_CONSUME Argument (newline | SPACE)
  public static boolean ConsumingArg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConsumingArg")) return false;
    if (!nextTokenIs(b, ARG_TYPE_CONSUME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ARG_TYPE_CONSUME);
    r = r && Argument(b, l + 1);
    r = r && ConsumingArg_2(b, l + 1);
    exit_section_(b, m, CONSUMING_ARG, r);
    return r;
  }

  // newline | SPACE
  private static boolean ConsumingArg_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConsumingArg_2")) return false;
    boolean r;
    r = consumeToken(b, NEWLINE);
    if (!r) r = consumeToken(b, SPACE);
    return r;
  }

  /* ********************************************************** */
  // context separator contextname (SPACE contextname)
  public static boolean ContextLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ContextLine")) return false;
    if (!nextTokenIs(b, CONTEXT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CONTEXT_LINE, null);
    r = consumeTokens(b, 2, CONTEXT, SEPARATOR, CONTEXTNAME);
    p = r; // pin = 2
    r = r && ContextLine_3(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // SPACE contextname
  private static boolean ContextLine_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ContextLine_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SPACE, CONTEXTNAME);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DASHES FLAG_NAME (COMMA DASHES FLAG_NAME)* FLAG_MODIFIER? (BRACKET_OPEN DEFAULT_VALUE BRACKET_CLOSE)?
  public static boolean Flag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Flag")) return false;
    if (!nextTokenIs(b, DASHES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DASHES, FLAG_NAME);
    r = r && Flag_2(b, l + 1);
    r = r && Flag_3(b, l + 1);
    r = r && Flag_4(b, l + 1);
    exit_section_(b, m, FLAG, r);
    return r;
  }

  // (COMMA DASHES FLAG_NAME)*
  private static boolean Flag_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Flag_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Flag_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Flag_2", c)) break;
    }
    return true;
  }

  // COMMA DASHES FLAG_NAME
  private static boolean Flag_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Flag_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, DASHES, FLAG_NAME);
    exit_section_(b, m, null, r);
    return r;
  }

  // FLAG_MODIFIER?
  private static boolean Flag_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Flag_3")) return false;
    consumeToken(b, FLAG_MODIFIER);
    return true;
  }

  // (BRACKET_OPEN DEFAULT_VALUE BRACKET_CLOSE)?
  private static boolean Flag_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Flag_4")) return false;
    Flag_4_0(b, l + 1);
    return true;
  }

  // BRACKET_OPEN DEFAULT_VALUE BRACKET_CLOSE
  private static boolean Flag_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Flag_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, BRACKET_OPEN, DEFAULT_VALUE, BRACKET_CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // help separator helpmessage (SPACE helpmessage)*
  public static boolean HelpLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HelpLine")) return false;
    if (!nextTokenIs(b, HELP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, HELP_LINE, null);
    r = consumeTokens(b, 2, HELP, SEPARATOR, HELPMESSAGE);
    p = r; // pin = 2
    r = r && HelpLine_3(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (SPACE helpmessage)*
  private static boolean HelpLine_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HelpLine_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!HelpLine_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "HelpLine_3", c)) break;
    }
    return true;
  }

  // SPACE helpmessage
  private static boolean HelpLine_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HelpLine_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SPACE, HELPMESSAGE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // helpmsg separator helpmsgkey (SPACE helpmessagekey)*
  public static boolean HelpMsgLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HelpMsgLine")) return false;
    if (!nextTokenIs(b, HELPMSG)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, HELP_MSG_LINE, null);
    r = consumeTokens(b, 2, HELPMSG, SEPARATOR, HELPMSGKEY);
    p = r; // pin = 2
    r = r && HelpMsgLine_3(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (SPACE helpmessagekey)*
  private static boolean HelpMsgLine_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HelpMsgLine_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!HelpMsgLine_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "HelpMsgLine_3", c)) break;
    }
    return true;
  }

  // SPACE helpmessagekey
  private static boolean HelpMsgLine_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HelpMsgLine_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SPACE, HELPMESSAGEKEY);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // hook separator hookname
  public static boolean HookLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HookLine")) return false;
    if (!nextTokenIs(b, HOOK)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, HOOK_LINE, null);
    r = consumeTokens(b, 2, HOOK, SEPARATOR, HOOKNAME);
    p = r; // pin = 2
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // CommandProperty | CommandDef
  public static boolean Line(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Line")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LINE, "<line>");
    r = CommandProperty(b, l + 1);
    if (!r) r = CommandDef(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CommandProperty_Consume | CommandDef
  public static boolean Line_Consume(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Line_Consume")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LINE_CONSUME, "<line consume>");
    r = CommandProperty_Consume(b, l + 1);
    if (!r) r = CommandDef(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // nohelp
  public static boolean NoHelpLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NoHelpLine")) return false;
    if (!nextTokenIs(b, NOHELP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOHELP);
    exit_section_(b, m, NO_HELP_LINE, r);
    return r;
  }

  /* ********************************************************** */
  // notab
  public static boolean NoTabLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NoTabLine")) return false;
    if (!nextTokenIs(b, NOTAB)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOTAB);
    exit_section_(b, m, NO_TAB_LINE, r);
    return r;
  }

  /* ********************************************************** */
  // SPACE* OBRACKET newline
  public static boolean Open_Bracket(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Open_Bracket")) return false;
    if (!nextTokenIs(b, "<open bracket>", OBRACKET, SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPEN_BRACKET, "<open bracket>");
    r = Open_Bracket_0(b, l + 1);
    r = r && consumeTokens(b, 0, OBRACKET, NEWLINE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // SPACE*
  private static boolean Open_Bracket_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Open_Bracket_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "Open_Bracket_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // permission separator PERMISSION_VALUE (DOT PERMISSION_VALUE)*
  public static boolean PermissionLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PermissionLine")) return false;
    if (!nextTokenIs(b, PERMISSION)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PERMISSION_LINE, null);
    r = consumeTokens(b, 2, PERMISSION, SEPARATOR, PERMISSION_VALUE);
    p = r; // pin = 2
    r = r && PermissionLine_3(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (DOT PERMISSION_VALUE)*
  private static boolean PermissionLine_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PermissionLine_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!PermissionLine_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "PermissionLine_3", c)) break;
    }
    return true;
  }

  // DOT PERMISSION_VALUE
  private static boolean PermissionLine_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PermissionLine_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, PERMISSION_VALUE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // postarg
  public static boolean PostArgLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostArgLine")) return false;
    if (!nextTokenIs(b, POSTARG)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, POSTARG);
    exit_section_(b, m, POST_ARG_LINE, r);
    return r;
  }

  /* ********************************************************** */
  // user separator ('player' | 'console' | 'everyone')
  public static boolean UserLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UserLine")) return false;
    if (!nextTokenIs(b, USER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, USER_LINE, null);
    r = consumeTokens(b, 2, USER, SEPARATOR);
    p = r; // pin = 2
    r = r && UserLine_2(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // 'player' | 'console' | 'everyone'
  private static boolean UserLine_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UserLine_2")) return false;
    boolean r;
    r = consumeToken(b, "player");
    if (!r) r = consumeToken(b, "console");
    if (!r) r = consumeToken(b, "everyone");
    return r;
  }

  /* ********************************************************** */
  // root_item*
  static boolean root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root")) return false;
    while (true) {
      int c = current_position_(b);
      if (!root_item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (CommandDef)
  static boolean root_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_item")) return false;
    if (!nextTokenIs(b, "", COMMANDNAME, SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CommandDef(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

}
