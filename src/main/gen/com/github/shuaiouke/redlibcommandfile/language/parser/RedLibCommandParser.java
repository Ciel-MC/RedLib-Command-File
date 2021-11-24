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
  // (((ARG_TYPE CONSTRAINT? COLON)? Flag) | (ARG_TYPE CONSTRAINT? COLON Argument)) (newline | SPACE)
  static boolean Arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Arg")) return false;
    if (!nextTokenIs(b, "", ARG_TYPE, DASHES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Arg_0(b, l + 1);
    r = r && Arg_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((ARG_TYPE CONSTRAINT? COLON)? Flag) | (ARG_TYPE CONSTRAINT? COLON Argument)
  private static boolean Arg_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Arg_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Arg_0_0(b, l + 1);
    if (!r) r = Arg_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ARG_TYPE CONSTRAINT? COLON)? Flag
  private static boolean Arg_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Arg_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Arg_0_0_0(b, l + 1);
    r = r && Flag(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ARG_TYPE CONSTRAINT? COLON)?
  private static boolean Arg_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Arg_0_0_0")) return false;
    Arg_0_0_0_0(b, l + 1);
    return true;
  }

  // ARG_TYPE CONSTRAINT? COLON
  private static boolean Arg_0_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Arg_0_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ARG_TYPE);
    r = r && Arg_0_0_0_0_1(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // CONSTRAINT?
  private static boolean Arg_0_0_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Arg_0_0_0_0_1")) return false;
    consumeToken(b, CONSTRAINT);
    return true;
  }

  // ARG_TYPE CONSTRAINT? COLON Argument
  private static boolean Arg_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Arg_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ARG_TYPE);
    r = r && Arg_0_1_1(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && Argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CONSTRAINT?
  private static boolean Arg_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Arg_0_1_1")) return false;
    consumeToken(b, CONSTRAINT);
    return true;
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
  static boolean Args(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Args")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Arg(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Args", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ConsumingArg*
  static boolean Args_Can_Consume(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Args_Can_Consume")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ConsumingArg(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Args_Can_Consume", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ARG_NAME (noshowtype | ((noshowtype) ( BRACKET_OPEN DEFAULT_VALUE? BRACKET_CLOSE)? ))?
  static boolean Argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Argument")) return false;
    if (!nextTokenIs(b, ARG_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ARG_NAME);
    r = r && Argument_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (noshowtype | ((noshowtype) ( BRACKET_OPEN DEFAULT_VALUE? BRACKET_CLOSE)? ))?
  private static boolean Argument_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Argument_1")) return false;
    Argument_1_0(b, l + 1);
    return true;
  }

  // noshowtype | ((noshowtype) ( BRACKET_OPEN DEFAULT_VALUE? BRACKET_CLOSE)? )
  private static boolean Argument_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Argument_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOSHOWTYPE);
    if (!r) r = Argument_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (noshowtype) ( BRACKET_OPEN DEFAULT_VALUE? BRACKET_CLOSE)?
  private static boolean Argument_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Argument_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOSHOWTYPE);
    r = r && Argument_1_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( BRACKET_OPEN DEFAULT_VALUE? BRACKET_CLOSE)?
  private static boolean Argument_1_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Argument_1_0_1_1")) return false;
    Argument_1_0_1_1_0(b, l + 1);
    return true;
  }

  // BRACKET_OPEN DEFAULT_VALUE? BRACKET_CLOSE
  private static boolean Argument_1_0_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Argument_1_0_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACKET_OPEN);
    r = r && Argument_1_0_1_1_0_1(b, l + 1);
    r = r && consumeToken(b, BRACKET_CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  // DEFAULT_VALUE?
  private static boolean Argument_1_0_1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Argument_1_0_1_1_0_1")) return false;
    consumeToken(b, DEFAULT_VALUE);
    return true;
  }

  /* ********************************************************** */
  // assert separator assertname (SPACE assertname)*
  static boolean AssertLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssertLine")) return false;
    if (!nextTokenIs(b, ASSERT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 2, ASSERT, SEPARATOR, ASSERTNAME);
    p = r; // pin = 2
    r = r && AssertLine_3(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (SPACE assertname)*
  private static boolean AssertLine_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssertLine_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!AssertLine_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AssertLine_3", c)) break;
    }
    return true;
  }

  // SPACE assertname
  private static boolean AssertLine_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssertLine_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SPACE, ASSERTNAME);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (SPACE* newline) | COMMENT
  static boolean Blank_Line(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Blank_Line")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Blank_Line_0(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE* newline
  private static boolean Blank_Line_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Blank_Line_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Blank_Line_0_0(b, l + 1);
    r = r && consumeToken(b, NEWLINE);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean Blank_Line_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Blank_Line_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "Blank_Line_0_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // SPACE* CBRACKET (newline|<<eof>>)
  static boolean Close_Bracket(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Close_Bracket")) return false;
    if (!nextTokenIs(b, "", CBRACKET, SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Close_Bracket_0(b, l + 1);
    r = r && consumeToken(b, CBRACKET);
    r = r && Close_Bracket_2(b, l + 1);
    exit_section_(b, m, null, r);
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
  // CommandDefinition | CommandDefinition_Consuming | newline
  static boolean CommandDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDef")) return false;
    boolean r;
    r = CommandDefinition(b, l + 1);
    if (!r) r = CommandDefinition_Consuming(b, l + 1);
    if (!r) r = consumeToken(b, NEWLINE);
    return r;
  }

  /* ********************************************************** */
  // CommandDefinition_Base | CommandDefinition_Consuming_Base
  static boolean CommandDef_Base(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDef_Base")) return false;
    if (!nextTokenIs(b, "", COMMANDNAME, SPACE)) return false;
    boolean r;
    r = CommandDefinition_Base(b, l + 1);
    if (!r) r = CommandDefinition_Consuming_Base(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // CommandDefinition_Consumed | newline
  static boolean CommandDef_Consumed(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDef_Consumed")) return false;
    boolean r;
    r = CommandDefinition_Consumed(b, l + 1);
    if (!r) r = consumeToken(b, NEWLINE);
    return r;
  }

  /* ********************************************************** */
  // SPACE* commandname (aliasseparator alias)* (SPACE Args)? newline? Open_Bracket (Line | Blank_Line)* Close_Bracket
  static boolean CommandDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition")) return false;
    if (!nextTokenIs(b, "", COMMANDNAME, SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CommandDefinition_0(b, l + 1);
    r = r && consumeToken(b, COMMANDNAME);
    r = r && CommandDefinition_2(b, l + 1);
    r = r && CommandDefinition_3(b, l + 1);
    r = r && CommandDefinition_4(b, l + 1);
    r = r && Open_Bracket(b, l + 1);
    r = r && CommandDefinition_6(b, l + 1);
    r = r && Close_Bracket(b, l + 1);
    exit_section_(b, m, null, r);
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
  // SPACE* commandname (aliasseparator alias)* (SPACE Args)? newline? Open_Bracket (Line_Base | Blank_Line)* Close_Bracket
  static boolean CommandDefinition_Base(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Base")) return false;
    if (!nextTokenIs(b, "", COMMANDNAME, SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CommandDefinition_Base_0(b, l + 1);
    r = r && consumeToken(b, COMMANDNAME);
    r = r && CommandDefinition_Base_2(b, l + 1);
    r = r && CommandDefinition_Base_3(b, l + 1);
    r = r && CommandDefinition_Base_4(b, l + 1);
    r = r && Open_Bracket(b, l + 1);
    r = r && CommandDefinition_Base_6(b, l + 1);
    r = r && Close_Bracket(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean CommandDefinition_Base_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Base_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "CommandDefinition_Base_0", c)) break;
    }
    return true;
  }

  // (aliasseparator alias)*
  private static boolean CommandDefinition_Base_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Base_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CommandDefinition_Base_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CommandDefinition_Base_2", c)) break;
    }
    return true;
  }

  // aliasseparator alias
  private static boolean CommandDefinition_Base_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Base_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ALIASSEPARATOR, ALIAS);
    exit_section_(b, m, null, r);
    return r;
  }

  // (SPACE Args)?
  private static boolean CommandDefinition_Base_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Base_3")) return false;
    CommandDefinition_Base_3_0(b, l + 1);
    return true;
  }

  // SPACE Args
  private static boolean CommandDefinition_Base_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Base_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SPACE);
    r = r && Args(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // newline?
  private static boolean CommandDefinition_Base_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Base_4")) return false;
    consumeToken(b, NEWLINE);
    return true;
  }

  // (Line_Base | Blank_Line)*
  private static boolean CommandDefinition_Base_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Base_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CommandDefinition_Base_6_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CommandDefinition_Base_6", c)) break;
    }
    return true;
  }

  // Line_Base | Blank_Line
  private static boolean CommandDefinition_Base_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Base_6_0")) return false;
    boolean r;
    r = Line_Base(b, l + 1);
    if (!r) r = Blank_Line(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // SPACE* commandname (aliasseparator alias)* (SPACE Args_Can_Consume)? newline? Open_Bracket (Line_Consumed_Recovering | Blank_Line)* Close_Bracket
  static boolean CommandDefinition_Consumed(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Consumed")) return false;
    if (!nextTokenIs(b, "", COMMANDNAME, SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CommandDefinition_Consumed_0(b, l + 1);
    r = r && consumeToken(b, COMMANDNAME);
    r = r && CommandDefinition_Consumed_2(b, l + 1);
    r = r && CommandDefinition_Consumed_3(b, l + 1);
    r = r && CommandDefinition_Consumed_4(b, l + 1);
    r = r && Open_Bracket(b, l + 1);
    r = r && CommandDefinition_Consumed_6(b, l + 1);
    r = r && Close_Bracket(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean CommandDefinition_Consumed_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Consumed_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "CommandDefinition_Consumed_0", c)) break;
    }
    return true;
  }

  // (aliasseparator alias)*
  private static boolean CommandDefinition_Consumed_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Consumed_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CommandDefinition_Consumed_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CommandDefinition_Consumed_2", c)) break;
    }
    return true;
  }

  // aliasseparator alias
  private static boolean CommandDefinition_Consumed_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Consumed_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ALIASSEPARATOR, ALIAS);
    exit_section_(b, m, null, r);
    return r;
  }

  // (SPACE Args_Can_Consume)?
  private static boolean CommandDefinition_Consumed_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Consumed_3")) return false;
    CommandDefinition_Consumed_3_0(b, l + 1);
    return true;
  }

  // SPACE Args_Can_Consume
  private static boolean CommandDefinition_Consumed_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Consumed_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SPACE);
    r = r && Args_Can_Consume(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // newline?
  private static boolean CommandDefinition_Consumed_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Consumed_4")) return false;
    consumeToken(b, NEWLINE);
    return true;
  }

  // (Line_Consumed_Recovering | Blank_Line)*
  private static boolean CommandDefinition_Consumed_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Consumed_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CommandDefinition_Consumed_6_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CommandDefinition_Consumed_6", c)) break;
    }
    return true;
  }

  // Line_Consumed_Recovering | Blank_Line
  private static boolean CommandDefinition_Consumed_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Consumed_6_0")) return false;
    boolean r;
    r = Line_Consumed_Recovering(b, l + 1);
    if (!r) r = Blank_Line(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // SPACE* commandname (aliasseparator alias)* (SPACE Args_Can_Consume)? newline? Open_Bracket (Line_Consumed | Blank_Line)* Close_Bracket
  static boolean CommandDefinition_Consuming(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Consuming")) return false;
    if (!nextTokenIs(b, "", COMMANDNAME, SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CommandDefinition_Consuming_0(b, l + 1);
    r = r && consumeToken(b, COMMANDNAME);
    r = r && CommandDefinition_Consuming_2(b, l + 1);
    r = r && CommandDefinition_Consuming_3(b, l + 1);
    r = r && CommandDefinition_Consuming_4(b, l + 1);
    r = r && Open_Bracket(b, l + 1);
    r = r && CommandDefinition_Consuming_6(b, l + 1);
    r = r && Close_Bracket(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean CommandDefinition_Consuming_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Consuming_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "CommandDefinition_Consuming_0", c)) break;
    }
    return true;
  }

  // (aliasseparator alias)*
  private static boolean CommandDefinition_Consuming_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Consuming_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CommandDefinition_Consuming_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CommandDefinition_Consuming_2", c)) break;
    }
    return true;
  }

  // aliasseparator alias
  private static boolean CommandDefinition_Consuming_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Consuming_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ALIASSEPARATOR, ALIAS);
    exit_section_(b, m, null, r);
    return r;
  }

  // (SPACE Args_Can_Consume)?
  private static boolean CommandDefinition_Consuming_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Consuming_3")) return false;
    CommandDefinition_Consuming_3_0(b, l + 1);
    return true;
  }

  // SPACE Args_Can_Consume
  private static boolean CommandDefinition_Consuming_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Consuming_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SPACE);
    r = r && Args_Can_Consume(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // newline?
  private static boolean CommandDefinition_Consuming_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Consuming_4")) return false;
    consumeToken(b, NEWLINE);
    return true;
  }

  // (Line_Consumed | Blank_Line)*
  private static boolean CommandDefinition_Consuming_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Consuming_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CommandDefinition_Consuming_6_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CommandDefinition_Consuming_6", c)) break;
    }
    return true;
  }

  // Line_Consumed | Blank_Line
  private static boolean CommandDefinition_Consuming_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Consuming_6_0")) return false;
    boolean r;
    r = Line_Consumed(b, l + 1);
    if (!r) r = Blank_Line(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // SPACE* commandname (aliasseparator alias)* (SPACE Args_Can_Consume)? newline? Open_Bracket (Line_Base_Consuming | Blank_Line)* Close_Bracket
  static boolean CommandDefinition_Consuming_Base(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Consuming_Base")) return false;
    if (!nextTokenIs(b, "", COMMANDNAME, SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CommandDefinition_Consuming_Base_0(b, l + 1);
    r = r && consumeToken(b, COMMANDNAME);
    r = r && CommandDefinition_Consuming_Base_2(b, l + 1);
    r = r && CommandDefinition_Consuming_Base_3(b, l + 1);
    r = r && CommandDefinition_Consuming_Base_4(b, l + 1);
    r = r && Open_Bracket(b, l + 1);
    r = r && CommandDefinition_Consuming_Base_6(b, l + 1);
    r = r && Close_Bracket(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean CommandDefinition_Consuming_Base_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Consuming_Base_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "CommandDefinition_Consuming_Base_0", c)) break;
    }
    return true;
  }

  // (aliasseparator alias)*
  private static boolean CommandDefinition_Consuming_Base_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Consuming_Base_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CommandDefinition_Consuming_Base_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CommandDefinition_Consuming_Base_2", c)) break;
    }
    return true;
  }

  // aliasseparator alias
  private static boolean CommandDefinition_Consuming_Base_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Consuming_Base_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ALIASSEPARATOR, ALIAS);
    exit_section_(b, m, null, r);
    return r;
  }

  // (SPACE Args_Can_Consume)?
  private static boolean CommandDefinition_Consuming_Base_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Consuming_Base_3")) return false;
    CommandDefinition_Consuming_Base_3_0(b, l + 1);
    return true;
  }

  // SPACE Args_Can_Consume
  private static boolean CommandDefinition_Consuming_Base_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Consuming_Base_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SPACE);
    r = r && Args_Can_Consume(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // newline?
  private static boolean CommandDefinition_Consuming_Base_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Consuming_Base_4")) return false;
    consumeToken(b, NEWLINE);
    return true;
  }

  // (Line_Base_Consuming | Blank_Line)*
  private static boolean CommandDefinition_Consuming_Base_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Consuming_Base_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CommandDefinition_Consuming_Base_6_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CommandDefinition_Consuming_Base_6", c)) break;
    }
    return true;
  }

  // Line_Base_Consuming | Blank_Line
  private static boolean CommandDefinition_Consuming_Base_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandDefinition_Consuming_Base_6_0")) return false;
    boolean r;
    r = Line_Base_Consuming(b, l + 1);
    if (!r) r = Blank_Line(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // (SPACE)* (HelpLine|PermissionLine|UserLine|HookLine|ContextLine|AssertLine|NoHelpLine|NoTabLine|PostArgLine|HideSubLine|HelpMsgLine) newline
  static boolean CommandProperty(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandProperty")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CommandProperty_0(b, l + 1);
    r = r && CommandProperty_1(b, l + 1);
    r = r && consumeToken(b, NEWLINE);
    exit_section_(b, m, null, r);
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

  // HelpLine|PermissionLine|UserLine|HookLine|ContextLine|AssertLine|NoHelpLine|NoTabLine|PostArgLine|HideSubLine|HelpMsgLine
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
    if (!r) r = HideSubLine(b, l + 1);
    if (!r) r = HelpMsgLine(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // (SPACE)* (HelpLine|PermissionLine|UserLine|HookLine|ContextLine|AssertLine|NoHelpLine|NoTabLine|HideSubLine|HelpMsgLine) newline
  static boolean CommandProperty_Base(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandProperty_Base")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CommandProperty_Base_0(b, l + 1);
    r = r && CommandProperty_Base_1(b, l + 1);
    r = r && consumeToken(b, NEWLINE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (SPACE)*
  private static boolean CommandProperty_Base_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandProperty_Base_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "CommandProperty_Base_0", c)) break;
    }
    return true;
  }

  // HelpLine|PermissionLine|UserLine|HookLine|ContextLine|AssertLine|NoHelpLine|NoTabLine|HideSubLine|HelpMsgLine
  private static boolean CommandProperty_Base_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandProperty_Base_1")) return false;
    boolean r;
    r = HelpLine(b, l + 1);
    if (!r) r = PermissionLine(b, l + 1);
    if (!r) r = UserLine(b, l + 1);
    if (!r) r = HookLine(b, l + 1);
    if (!r) r = ContextLine(b, l + 1);
    if (!r) r = AssertLine(b, l + 1);
    if (!r) r = NoHelpLine(b, l + 1);
    if (!r) r = NoTabLine(b, l + 1);
    if (!r) r = HideSubLine(b, l + 1);
    if (!r) r = HelpMsgLine(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // (SPACE)* (HelpLine|PermissionLine|UserLine|HookLine|ContextLine|AssertLine|NoHelpLine|NoTabLine|HideSubLine|HelpMsgLine) newline
  static boolean CommandProperty_Consumed(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandProperty_Consumed")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CommandProperty_Consumed_0(b, l + 1);
    r = r && CommandProperty_Consumed_1(b, l + 1);
    r = r && consumeToken(b, NEWLINE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (SPACE)*
  private static boolean CommandProperty_Consumed_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandProperty_Consumed_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "CommandProperty_Consumed_0", c)) break;
    }
    return true;
  }

  // HelpLine|PermissionLine|UserLine|HookLine|ContextLine|AssertLine|NoHelpLine|NoTabLine|HideSubLine|HelpMsgLine
  private static boolean CommandProperty_Consumed_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandProperty_Consumed_1")) return false;
    boolean r;
    r = HelpLine(b, l + 1);
    if (!r) r = PermissionLine(b, l + 1);
    if (!r) r = UserLine(b, l + 1);
    if (!r) r = HookLine(b, l + 1);
    if (!r) r = ContextLine(b, l + 1);
    if (!r) r = AssertLine(b, l + 1);
    if (!r) r = NoHelpLine(b, l + 1);
    if (!r) r = NoTabLine(b, l + 1);
    if (!r) r = HideSubLine(b, l + 1);
    if (!r) r = HelpMsgLine(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ARG_TYPE CONSTRAINT? CONSUME_TOKEN? COLON Consuming_Argument (newline | SPACE)
  static boolean ConsumingArg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConsumingArg")) return false;
    if (!nextTokenIs(b, ARG_TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ARG_TYPE);
    r = r && ConsumingArg_1(b, l + 1);
    r = r && ConsumingArg_2(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && Consuming_Argument(b, l + 1);
    r = r && ConsumingArg_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CONSTRAINT?
  private static boolean ConsumingArg_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConsumingArg_1")) return false;
    consumeToken(b, CONSTRAINT);
    return true;
  }

  // CONSUME_TOKEN?
  private static boolean ConsumingArg_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConsumingArg_2")) return false;
    consumeToken(b, CONSUME_TOKEN);
    return true;
  }

  // newline | SPACE
  private static boolean ConsumingArg_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConsumingArg_5")) return false;
    boolean r;
    r = consumeToken(b, NEWLINE);
    if (!r) r = consumeToken(b, SPACE);
    return r;
  }

  /* ********************************************************** */
  // ARG_NAME (noshowtype | ((notrequired | bothmodifiers) ( BRACKET_OPEN DEFAULT_VALUE? BRACKET_CLOSE)? ))?
  static boolean Consuming_Argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Consuming_Argument")) return false;
    if (!nextTokenIs(b, ARG_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ARG_NAME);
    r = r && Consuming_Argument_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (noshowtype | ((notrequired | bothmodifiers) ( BRACKET_OPEN DEFAULT_VALUE? BRACKET_CLOSE)? ))?
  private static boolean Consuming_Argument_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Consuming_Argument_1")) return false;
    Consuming_Argument_1_0(b, l + 1);
    return true;
  }

  // noshowtype | ((notrequired | bothmodifiers) ( BRACKET_OPEN DEFAULT_VALUE? BRACKET_CLOSE)? )
  private static boolean Consuming_Argument_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Consuming_Argument_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOSHOWTYPE);
    if (!r) r = Consuming_Argument_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (notrequired | bothmodifiers) ( BRACKET_OPEN DEFAULT_VALUE? BRACKET_CLOSE)?
  private static boolean Consuming_Argument_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Consuming_Argument_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Consuming_Argument_1_0_1_0(b, l + 1);
    r = r && Consuming_Argument_1_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // notrequired | bothmodifiers
  private static boolean Consuming_Argument_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Consuming_Argument_1_0_1_0")) return false;
    boolean r;
    r = consumeToken(b, NOTREQUIRED);
    if (!r) r = consumeToken(b, BOTHMODIFIERS);
    return r;
  }

  // ( BRACKET_OPEN DEFAULT_VALUE? BRACKET_CLOSE)?
  private static boolean Consuming_Argument_1_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Consuming_Argument_1_0_1_1")) return false;
    Consuming_Argument_1_0_1_1_0(b, l + 1);
    return true;
  }

  // BRACKET_OPEN DEFAULT_VALUE? BRACKET_CLOSE
  private static boolean Consuming_Argument_1_0_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Consuming_Argument_1_0_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACKET_OPEN);
    r = r && Consuming_Argument_1_0_1_1_0_1(b, l + 1);
    r = r && consumeToken(b, BRACKET_CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  // DEFAULT_VALUE?
  private static boolean Consuming_Argument_1_0_1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Consuming_Argument_1_0_1_1_0_1")) return false;
    consumeToken(b, DEFAULT_VALUE);
    return true;
  }

  /* ********************************************************** */
  // context separator contextname (SPACE contextname)*
  static boolean ContextLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ContextLine")) return false;
    if (!nextTokenIs(b, CONTEXT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 2, CONTEXT, SEPARATOR, CONTEXTNAME);
    p = r; // pin = 2
    r = r && ContextLine_3(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (SPACE contextname)*
  private static boolean ContextLine_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ContextLine_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ContextLine_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ContextLine_3", c)) break;
    }
    return true;
  }

  // SPACE contextname
  private static boolean ContextLine_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ContextLine_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SPACE, CONTEXTNAME);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DASHES FLAG_NAME (COMMA DASHES FLAG_NAME)* FLAG_MODIFIER? (BRACKET_OPEN DEFAULT_VALUE? BRACKET_CLOSE)?
  static boolean Flag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Flag")) return false;
    if (!nextTokenIs(b, DASHES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DASHES, FLAG_NAME);
    r = r && Flag_2(b, l + 1);
    r = r && Flag_3(b, l + 1);
    r = r && Flag_4(b, l + 1);
    exit_section_(b, m, null, r);
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

  // (BRACKET_OPEN DEFAULT_VALUE? BRACKET_CLOSE)?
  private static boolean Flag_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Flag_4")) return false;
    Flag_4_0(b, l + 1);
    return true;
  }

  // BRACKET_OPEN DEFAULT_VALUE? BRACKET_CLOSE
  private static boolean Flag_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Flag_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACKET_OPEN);
    r = r && Flag_4_0_1(b, l + 1);
    r = r && consumeToken(b, BRACKET_CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  // DEFAULT_VALUE?
  private static boolean Flag_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Flag_4_0_1")) return false;
    consumeToken(b, DEFAULT_VALUE);
    return true;
  }

  /* ********************************************************** */
  // help separator helpmessage (SPACE helpmessage)*
  static boolean HelpLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HelpLine")) return false;
    if (!nextTokenIs(b, HELP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
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
  static boolean HelpMsgLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HelpMsgLine")) return false;
    if (!nextTokenIs(b, HELPMSG)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
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
  // hidesub
  static boolean HideSubLine(PsiBuilder b, int l) {
    return consumeToken(b, HIDESUB);
  }

  /* ********************************************************** */
  // hook separator hookname
  static boolean HookLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HookLine")) return false;
    if (!nextTokenIs(b, HOOK)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 2, HOOK, SEPARATOR, HOOKNAME);
    p = r; // pin = 2
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // CommandProperty | CommandDef
  static boolean Line(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Line")) return false;
    boolean r;
    r = CommandProperty(b, l + 1);
    if (!r) r = CommandDef(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // CommandProperty_Base | CommandDef
  static boolean Line_Base(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Line_Base")) return false;
    boolean r;
    r = CommandProperty_Base(b, l + 1);
    if (!r) r = CommandDef(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // CommandProperty_Base | CommandDefinition_Consumed
  static boolean Line_Base_Consuming(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Line_Base_Consuming")) return false;
    boolean r;
    r = CommandProperty_Base(b, l + 1);
    if (!r) r = CommandDefinition_Consumed(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // CommandProperty | CommandDef_Consumed
  static boolean Line_Consumed(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Line_Consumed")) return false;
    boolean r;
    r = CommandProperty(b, l + 1);
    if (!r) r = CommandDef_Consumed(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // CommandProperty_Consumed | CommandDef
  static boolean Line_Consumed_Recovering(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Line_Consumed_Recovering")) return false;
    boolean r;
    r = CommandProperty_Consumed(b, l + 1);
    if (!r) r = CommandDef(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // nohelp
  static boolean NoHelpLine(PsiBuilder b, int l) {
    return consumeToken(b, NOHELP);
  }

  /* ********************************************************** */
  // notab
  static boolean NoTabLine(PsiBuilder b, int l) {
    return consumeToken(b, NOTAB);
  }

  /* ********************************************************** */
  // SPACE* OBRACKET newline
  static boolean Open_Bracket(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Open_Bracket")) return false;
    if (!nextTokenIs(b, "", OBRACKET, SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Open_Bracket_0(b, l + 1);
    r = r && consumeTokens(b, 0, OBRACKET, NEWLINE);
    exit_section_(b, m, null, r);
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
  static boolean PermissionLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PermissionLine")) return false;
    if (!nextTokenIs(b, PERMISSION)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
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
  static boolean PostArgLine(PsiBuilder b, int l) {
    return consumeToken(b, POSTARG);
  }

  /* ********************************************************** */
  // user separator (player | console | everyone)
  static boolean UserLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UserLine")) return false;
    if (!nextTokenIs(b, USER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 2, USER, SEPARATOR);
    p = r; // pin = 2
    r = r && UserLine_2(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // player | console | everyone
  private static boolean UserLine_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UserLine_2")) return false;
    boolean r;
    r = consumeToken(b, PLAYER);
    if (!r) r = consumeToken(b, CONSOLE);
    if (!r) r = consumeToken(b, EVERYONE);
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
  // (CommandDef_Base) | COMMENT
  static boolean root_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_item")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = root_item_0(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // (CommandDef_Base)
  private static boolean root_item_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_item_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CommandDef_Base(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

}
