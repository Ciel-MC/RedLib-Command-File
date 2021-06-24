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
  // CBRACKET
  public static boolean Close_Bracket(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Close_Bracket")) return false;
    if (!nextTokenIs(b, CBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CBRACKET);
    exit_section_(b, m, CLOSE_BRACKET, r);
    return r;
  }

  /* ********************************************************** */
  // (HelpLine|PermissionLine|UserLine|HookLine|ContextLine|AssertLine|NoHelp|NoTab|PostArgLine|HelpMsgLine) ENDLINE
  public static boolean CommandProperty(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandProperty")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMAND_PROPERTY, "<command property>");
    r = CommandProperty_0(b, l + 1);
    r = r && consumeToken(b, ENDLINE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // HelpLine|PermissionLine|UserLine|HookLine|ContextLine|AssertLine|NoHelp|NoTab|PostArgLine|HelpMsgLine
  private static boolean CommandProperty_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommandProperty_0")) return false;
    boolean r;
    r = HelpLine(b, l + 1);
    if (!r) r = PermissionLine(b, l + 1);
    if (!r) r = consumeToken(b, USERLINE);
    if (!r) r = consumeToken(b, HOOKLINE);
    if (!r) r = consumeToken(b, CONTEXTLINE);
    if (!r) r = consumeToken(b, ASSERTLINE);
    if (!r) r = consumeToken(b, NOHELP);
    if (!r) r = consumeToken(b, NOTAB);
    if (!r) r = consumeToken(b, POSTARGLINE);
    if (!r) r = consumeToken(b, HELPMSGLINE);
    return r;
  }

  /* ********************************************************** */
  // CommandName (Alias_Separator alias)* Open_Bracket (Properties | SubCommand) Close_Bracket newline
  public static boolean FirstCommand(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FirstCommand")) return false;
    if (!nextTokenIs(b, COMMANDNAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMANDNAME);
    r = r && FirstCommand_1(b, l + 1);
    r = r && Open_Bracket(b, l + 1);
    r = r && FirstCommand_3(b, l + 1);
    r = r && Close_Bracket(b, l + 1);
    r = r && consumeToken(b, NEWLINE);
    exit_section_(b, m, FIRST_COMMAND, r);
    return r;
  }

  // (Alias_Separator alias)*
  private static boolean FirstCommand_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FirstCommand_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FirstCommand_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FirstCommand_1", c)) break;
    }
    return true;
  }

  // Alias_Separator alias
  private static boolean FirstCommand_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FirstCommand_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ALIAS_SEPARATOR, ALIAS);
    exit_section_(b, m, null, r);
    return r;
  }

  // Properties | SubCommand
  private static boolean FirstCommand_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FirstCommand_3")) return false;
    boolean r;
    r = Properties(b, l + 1);
    if (!r) r = SubCommand(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // help Separator HelpMessage (SPACE HelpMessage)*
  public static boolean HelpLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HelpLine")) return false;
    if (!nextTokenIs(b, HELP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, HELP, SEPARATOR, HELPMESSAGE);
    r = r && HelpLine_3(b, l + 1);
    exit_section_(b, m, HELP_LINE, r);
    return r;
  }

  // (SPACE HelpMessage)*
  private static boolean HelpLine_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HelpLine_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!HelpLine_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "HelpLine_3", c)) break;
    }
    return true;
  }

  // SPACE HelpMessage
  private static boolean HelpLine_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HelpLine_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SPACE, HELPMESSAGE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OBRACKET newline
  public static boolean Open_Bracket(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Open_Bracket")) return false;
    if (!nextTokenIs(b, OBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OBRACKET, NEWLINE);
    exit_section_(b, m, OPEN_BRACKET, r);
    return r;
  }

  /* ********************************************************** */
  // permission Separator PERMISSION_VALUE (DOT PERMISSION_VALUE)*
  public static boolean PermissionLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PermissionLine")) return false;
    if (!nextTokenIs(b, PERMISSION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PERMISSION, SEPARATOR, PERMISSION_VALUE);
    r = r && PermissionLine_3(b, l + 1);
    exit_section_(b, m, PERMISSION_LINE, r);
    return r;
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
  // CommandProperty*
  public static boolean Properties(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Properties")) return false;
    Marker m = enter_section_(b, l, _NONE_, PROPERTIES, "<properties>");
    while (true) {
      int c = current_position_(b);
      if (!CommandProperty(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Properties", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // CommandDefinition newline
  public static boolean SubCommand(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubCommand")) return false;
    if (!nextTokenIs(b, COMMANDDEFINITION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMANDDEFINITION, NEWLINE);
    exit_section_(b, m, SUB_COMMAND, r);
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
  // (FirstCommand)
  static boolean root_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_item")) return false;
    if (!nextTokenIs(b, COMMANDNAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FirstCommand(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

}
