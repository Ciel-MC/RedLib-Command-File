/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package com.github.shuaiouke.redlibcommandfile.language;

import com.github.shuaiouke.redlibcommandfile.language.psi.RedLibCommandTypes;import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;import org.apache.xmlbeans.XmlCursor;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.github.shuaiouke.redlibcommandfile.language.psi.RedLibCommandTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>RedLibCommandLexer.flex</tt>
 */
public class RedLibCommandLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int COMMAND = 2;
  public static final int NOARG = 4;
  public static final int HELP = 6;
  public static final int HELPVALUE = 8;
  public static final int HELPMSG = 10;
  public static final int HELPMSGVALUE = 12;
  public static final int PERMISSION = 14;
  public static final int PERMISSIONVALUE = 16;
  public static final int USER = 18;
  public static final int USERVALUE = 20;
  public static final int HOOK = 22;
  public static final int HOOKVALUE = 24;
  public static final int CONTEXT = 26;
  public static final int CONTEXTVALUE = 28;
  public static final int ASSERT = 30;
  public static final int ASSERTVALUE = 32;
  public static final int ARGS = 34;
  public static final int FLAG = 36;
  public static final int ARG = 38;
  public static final int DEFAULTVALUE = 40;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8,  8,  9,  9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 
    16, 16, 17, 17, 18, 18, 19, 19, 20, 20
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [11, 6, 4]
   * Total runtime size is 15360 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>10]<<6)|((ch>>4)&0x3f)]<<4)|(ch&0xf)];
  }

  /* The ZZ_CMAP_Z table has 1088 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\6\15\1\16\23\15"+
    "\1\17\1\15\1\20\1\21\12\15\1\22\10\12\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1"+
    "\32\1\33\1\34\1\35\1\36\2\12\1\15\1\37\3\12\1\40\10\12\1\41\1\42\5\15\1\43"+
    "\1\44\11\12\1\45\2\12\1\46\4\12\1\47\1\50\1\51\1\12\1\52\1\12\1\53\1\54\1"+
    "\55\3\12\51\15\1\56\3\15\1\57\1\60\4\15\1\61\12\12\1\62\u02c1\12\1\63\277"+
    "\12");

  /* The ZZ_CMAP_Y table has 3328 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\1\1\11\1\12\1\13\1\14\1\13\1\14\34"+
    "\13\1\15\1\16\1\17\1\1\7\13\1\20\1\21\1\13\1\22\4\13\1\23\10\13\1\22\12\13"+
    "\1\4\1\13\1\24\1\4\1\13\1\25\1\4\1\13\1\26\1\27\1\13\1\30\1\31\1\1\1\30\4"+
    "\13\1\32\6\13\1\33\1\34\1\35\1\1\3\13\1\36\6\13\1\16\3\13\1\37\2\13\1\40\1"+
    "\1\1\13\1\41\4\1\1\13\1\42\1\1\1\43\1\22\7\13\1\44\1\4\1\33\1\45\1\34\1\46"+
    "\1\47\1\50\1\44\1\16\1\51\1\45\1\34\1\52\1\53\1\54\1\55\1\56\1\57\1\22\1\34"+
    "\1\60\1\61\1\62\1\44\1\63\1\64\1\45\1\34\1\60\1\65\1\66\1\44\1\67\1\70\1\71"+
    "\1\72\1\32\1\73\1\74\1\55\1\1\1\75\1\76\1\34\1\77\1\100\1\101\1\44\1\1\1\75"+
    "\1\76\1\34\1\102\1\100\1\103\1\44\1\104\1\105\1\76\1\13\1\36\1\106\1\107\1"+
    "\44\1\110\1\111\1\112\1\13\1\113\1\114\1\115\1\55\1\116\1\4\2\13\1\30\1\117"+
    "\1\120\2\1\1\121\1\122\1\123\1\124\1\125\1\126\2\1\1\62\1\127\1\120\1\130"+
    "\1\131\1\13\1\132\1\4\1\133\1\131\1\13\1\132\1\134\3\1\4\13\1\120\4\13\1\40"+
    "\2\13\1\135\2\13\1\136\24\13\1\137\1\140\2\13\1\137\2\13\1\141\1\142\1\14"+
    "\3\13\1\142\3\13\1\36\2\1\1\13\1\1\5\13\1\143\1\4\45\13\1\35\1\13\1\144\1"+
    "\30\4\13\1\145\1\146\1\147\1\150\1\13\1\150\1\13\1\151\1\147\1\152\5\13\1"+
    "\153\1\120\1\1\1\154\1\120\5\13\1\25\2\13\1\30\4\13\1\56\1\13\1\117\2\41\1"+
    "\55\1\13\1\40\1\150\2\13\1\41\1\13\2\120\2\1\1\13\1\41\3\13\1\117\1\13\1\35"+
    "\2\120\1\155\1\117\4\1\4\13\1\41\1\120\1\156\1\151\7\13\1\151\3\13\1\25\1"+
    "\77\2\13\1\40\1\146\4\1\1\157\1\13\1\160\17\13\1\161\21\13\1\143\2\13\1\143"+
    "\1\162\1\13\1\40\3\13\1\163\1\164\1\165\1\132\1\164\1\166\1\1\1\167\1\170"+
    "\1\62\1\171\1\1\1\172\1\1\1\132\3\1\2\13\1\62\1\173\1\174\1\175\1\126\1\176"+
    "\1\1\2\13\1\146\62\1\1\55\2\13\1\120\161\1\2\13\1\117\2\13\1\117\10\13\1\177"+
    "\1\151\2\13\1\135\3\13\1\200\1\170\1\13\1\201\4\202\2\13\2\1\1\170\35\1\1"+
    "\203\1\1\1\4\1\204\1\4\4\13\1\205\1\4\4\13\1\136\1\206\1\13\1\40\1\4\4\13"+
    "\1\117\1\1\1\13\1\30\3\1\1\13\40\1\133\13\1\56\4\1\135\13\1\56\2\1\10\13\1"+
    "\132\4\1\2\13\1\40\20\13\1\132\1\13\1\41\1\1\3\13\1\207\7\13\1\16\1\1\1\210"+
    "\1\211\5\13\1\212\1\13\1\117\1\25\3\1\1\210\2\13\1\25\1\1\3\13\1\151\4\13"+
    "\1\56\1\120\1\13\1\213\2\13\1\40\2\13\1\151\1\13\1\132\4\13\1\214\1\120\1"+
    "\13\1\117\3\13\1\201\1\40\1\120\1\13\1\112\4\13\1\31\1\154\1\13\1\215\1\216"+
    "\1\217\1\202\2\13\1\136\1\56\7\13\1\220\1\120\72\13\1\151\1\13\1\221\2\13"+
    "\1\41\20\1\26\13\1\40\6\13\1\120\2\1\1\201\1\222\1\34\1\223\1\224\6\13\1\16"+
    "\1\1\1\225\25\13\1\40\1\1\4\13\1\211\2\13\1\25\2\1\1\41\1\13\1\1\1\13\1\226"+
    "\1\227\2\1\1\133\7\13\1\132\1\1\1\120\1\4\1\230\1\4\1\30\1\55\4\13\1\117\1"+
    "\231\1\232\2\1\1\233\1\13\1\14\1\234\2\40\2\1\7\13\1\30\4\1\3\13\1\150\7\1"+
    "\1\235\10\1\1\13\1\132\3\13\2\62\1\1\2\13\1\1\1\13\1\30\2\13\1\30\1\13\1\40"+
    "\2\13\1\236\1\237\2\1\11\13\1\40\1\120\2\13\1\236\1\13\1\41\2\13\1\25\3\13"+
    "\1\151\11\1\23\13\1\201\1\13\1\56\1\25\11\1\1\240\2\13\1\241\1\13\1\56\1\13"+
    "\1\201\1\13\1\117\4\1\1\13\1\242\1\13\1\56\1\13\1\120\4\1\3\13\1\243\4\1\1"+
    "\244\1\245\1\13\1\246\2\1\1\13\1\132\1\13\1\132\2\1\1\131\1\13\1\201\1\1\3"+
    "\13\1\56\1\13\1\56\1\13\1\31\1\13\1\16\6\1\4\13\1\146\3\1\3\13\1\31\3\13\1"+
    "\31\60\1\4\13\1\201\1\1\1\55\1\170\3\13\1\30\1\1\1\13\1\146\1\120\3\13\1\133"+
    "\1\1\2\13\1\247\4\13\1\250\1\251\2\1\1\13\1\22\1\13\1\252\4\1\1\253\1\26\1"+
    "\146\3\13\1\30\1\120\1\33\1\45\1\34\1\60\1\65\1\254\1\255\1\150\10\1\4\13"+
    "\1\30\1\120\2\1\4\13\1\256\1\120\12\1\3\13\1\257\1\62\1\260\2\1\4\13\1\261"+
    "\1\120\2\1\3\13\1\25\1\120\3\1\1\13\1\77\1\41\1\120\26\1\4\13\1\120\1\170"+
    "\34\1\3\13\1\146\20\1\1\34\2\13\1\14\1\62\1\120\1\1\1\211\1\13\1\211\1\131"+
    "\1\201\64\1\71\13\1\120\6\1\6\13\1\117\1\1\14\13\1\151\53\1\2\13\1\117\75"+
    "\1\44\13\1\201\33\1\43\13\1\146\1\13\1\117\1\120\6\1\1\13\1\40\1\150\3\13"+
    "\1\201\1\151\1\120\1\225\1\262\1\13\67\1\4\13\1\150\2\13\1\117\1\170\1\13"+
    "\4\1\1\62\1\1\76\13\1\132\1\1\57\13\1\31\20\1\1\16\77\1\6\13\1\30\1\132\1"+
    "\146\1\263\114\1\1\264\1\265\1\266\1\1\1\267\11\1\1\270\33\1\5\13\1\133\3"+
    "\13\1\147\1\271\1\272\1\273\3\13\1\274\1\275\1\13\1\276\1\277\1\76\24\13\1"+
    "\257\1\13\1\76\1\136\1\13\1\136\1\13\1\133\1\13\1\133\1\117\1\13\1\117\1\13"+
    "\1\34\1\13\1\34\1\13\1\300\3\13\40\1\3\13\1\221\2\13\1\132\1\301\1\302\1\156"+
    "\1\4\25\1\1\14\1\212\1\303\75\1\14\13\1\150\1\201\2\1\4\13\1\30\1\120\112"+
    "\1\1\273\1\13\1\304\1\305\1\306\1\307\1\310\1\311\1\312\1\41\1\313\1\41\47"+
    "\1\1\13\1\120\1\13\1\120\1\13\1\120\47\1\55\13\1\201\2\1\103\13\1\150\15\13"+
    "\1\40\150\13\1\16\25\1\41\13\1\40\56\1\17\13\41\1");

  /* The ZZ_CMAP_A table has 3264 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\16\1\2\2\4\1\3\22\0\1\16\7\0\1\44\1\45\1\5\1\0\1\42\1\11\1\12\1\1"+
    "\12\10\1\15\4\0\1\6\1\0\32\10\1\13\1\7\1\14\1\0\1\10\1\0\1\35\1\36\1\37\1"+
    "\10\1\20\1\10\1\25\1\17\1\27\1\10\1\33\1\21\1\23\1\31\1\30\1\22\1\10\1\26"+
    "\1\24\1\34\1\32\1\47\1\10\1\40\1\46\1\10\1\43\1\0\1\41\7\0\1\4\12\0\1\16\11"+
    "\0\1\10\12\0\1\10\4\0\1\10\5\0\27\10\1\0\12\10\4\0\14\10\16\0\5\10\7\0\1\10"+
    "\1\0\1\10\1\0\5\10\1\0\2\10\2\0\4\10\1\0\1\10\6\0\1\10\1\0\3\10\1\0\1\10\1"+
    "\0\4\10\1\0\23\10\1\0\20\10\2\0\1\10\6\0\10\10\10\0\16\10\1\0\1\10\1\0\2\10"+
    "\1\0\2\10\1\0\1\10\10\0\13\10\5\0\3\10\15\0\12\10\4\0\6\10\1\0\10\10\2\0\12"+
    "\10\1\0\23\10\2\0\14\10\2\0\11\10\4\0\1\10\5\0\16\10\2\0\14\10\4\0\5\10\1"+
    "\0\10\10\6\0\20\10\2\0\13\10\2\0\16\10\1\0\1\10\3\0\4\10\2\0\11\10\2\0\2\10"+
    "\2\0\4\10\10\0\1\10\4\0\2\10\1\0\1\10\1\0\3\10\1\0\6\10\4\0\2\10\1\0\2\10"+
    "\1\0\2\10\1\0\2\10\2\0\1\10\1\0\5\10\4\0\2\10\2\0\3\10\3\0\1\10\7\0\4\10\1"+
    "\0\1\10\7\0\20\10\13\0\3\10\1\0\11\10\1\0\2\10\1\0\2\10\1\0\5\10\2\0\12\10"+
    "\1\0\3\10\1\0\3\10\2\0\1\10\30\0\1\10\7\0\3\10\1\0\10\10\2\0\6\10\2\0\2\10"+
    "\2\0\3\10\10\0\2\10\4\0\2\10\1\0\1\10\1\0\1\10\20\0\2\10\1\0\6\10\3\0\3\10"+
    "\1\0\4\10\3\0\2\10\1\0\1\10\1\0\2\10\3\0\2\10\3\0\3\10\3\0\5\10\3\0\3\10\1"+
    "\0\4\10\2\0\1\10\6\0\1\10\10\0\4\10\1\0\10\10\1\0\3\10\1\0\30\10\3\0\10\10"+
    "\1\0\3\10\1\0\4\10\7\0\2\10\1\0\3\10\5\0\4\10\1\0\5\10\2\0\4\10\5\0\2\10\7"+
    "\0\1\10\2\0\2\10\16\0\3\10\1\0\10\10\1\0\7\10\1\0\3\10\1\0\5\10\5\0\4\10\7"+
    "\0\1\10\12\0\6\10\2\0\2\10\1\0\22\10\3\0\10\10\1\0\11\10\1\0\1\10\2\0\7\10"+
    "\3\0\1\10\4\0\6\10\1\0\1\10\1\0\10\10\2\0\2\10\14\0\17\10\1\0\12\10\7\0\2"+
    "\10\1\0\1\10\2\0\2\10\1\0\1\10\2\0\1\10\6\0\4\10\1\0\7\10\1\0\3\10\1\0\1\10"+
    "\1\0\1\10\2\0\2\10\1\0\15\10\1\0\3\10\2\0\5\10\1\0\1\10\1\0\6\10\2\0\12\10"+
    "\2\0\4\10\10\0\2\10\13\0\1\10\1\0\1\10\1\0\1\10\4\0\12\10\1\0\24\10\3\0\5"+
    "\10\1\0\12\10\6\0\1\10\11\0\6\10\1\0\1\10\5\0\1\10\2\0\13\10\1\0\15\10\1\0"+
    "\4\10\2\0\7\10\1\0\1\10\1\0\4\10\2\0\1\10\1\0\4\10\2\0\7\10\1\0\1\10\1\0\4"+
    "\10\2\0\16\10\2\0\6\10\2\0\1\16\32\10\3\0\13\10\7\0\15\10\1\0\7\10\13\0\4"+
    "\10\14\0\1\10\1\0\2\10\14\0\4\10\3\0\1\10\4\0\2\10\15\0\3\10\11\0\1\10\23"+
    "\0\10\10\1\0\23\10\1\0\2\10\6\0\6\10\5\0\15\10\1\0\1\10\1\0\1\10\1\0\1\10"+
    "\1\0\6\10\1\0\7\10\1\0\1\10\3\0\3\10\1\0\7\10\3\0\4\10\2\0\6\10\4\0\13\16"+
    "\15\0\2\4\5\0\1\16\17\0\1\10\4\0\1\10\12\0\1\16\1\0\1\10\15\0\1\10\2\0\1\10"+
    "\4\0\1\10\2\0\12\10\1\0\1\10\3\0\5\10\6\0\1\10\1\0\1\10\1\0\1\10\1\0\4\10"+
    "\1\0\1\10\5\0\5\10\4\0\1\10\1\0\5\10\6\0\15\10\7\0\10\10\11\0\7\10\1\0\7\10"+
    "\1\0\1\16\4\0\3\10\11\0\5\10\2\0\5\10\3\0\7\10\2\0\2\10\2\0\3\10\5\0\16\10"+
    "\1\0\12\10\1\0\1\10\7\0\11\10\2\0\27\10\2\0\15\10\3\0\1\10\1\0\1\10\2\0\1"+
    "\10\16\0\1\10\2\0\5\10\12\0\6\10\2\0\6\10\2\0\6\10\11\0\13\10\1\0\2\10\2\0"+
    "\7\10\4\0\5\10\3\0\5\10\5\0\12\10\1\0\5\10\1\0\1\10\1\0\2\10\1\0\2\10\1\0"+
    "\12\10\3\0\15\10\3\0\2\10\30\0\16\10\4\0\1\10\2\0\6\10\2\0\6\10\2\0\6\10\2"+
    "\0\3\10\3\0\14\10\1\0\16\10\1\0\2\10\1\0\1\10\15\0\1\10\2\0\4\10\4\0\10\10"+
    "\1\0\5\10\12\0\6\10\2\0\1\10\1\0\14\10\1\0\2\10\3\0\1\10\2\0\4\10\1\0\2\10"+
    "\12\0\10\10\6\0\6\10\1\0\2\10\5\0\10\10\1\0\3\10\1\0\13\10\4\0\3\10\4\0\5"+
    "\10\2\0\1\10\11\0\5\10\5\0\3\10\3\0\13\10\1\0\1\10\3\0\10\10\6\0\1\10\1\0"+
    "\7\10\1\0\1\10\1\0\4\10\1\0\2\10\6\0\1\10\5\0\7\10\2\0\7\10\3\0\6\10\1\0\1"+
    "\10\10\0\6\10\2\0\10\10\10\0\6\10\2\0\1\10\3\0\1\10\13\0\10\10\5\0\15\10\3"+
    "\0\2\10\6\0\5\10\3\0\6\10\10\0\10\10\2\0\7\10\16\0\4\10\4\0\3\10\15\0\1\10"+
    "\2\0\2\10\2\0\4\10\1\0\14\10\1\0\1\10\1\0\7\10\1\0\21\10\1\0\4\10\2\0\10\10"+
    "\1\0\7\10\1\0\14\10\1\0\4\10\1\0\5\10\1\0\1\10\3\0\11\10\1\0\10\10\2\0\2\10"+
    "\5\0\1\10\16\0\1\10\13\0\2\10\1\0\2\10\1\0\5\10\6\0\2\10\1\0\1\10\2\0\1\10"+
    "\1\0\12\10\1\0\4\10\1\0\1\10\1\0\1\10\6\0\1\10\4\0\1\10\1\0\1\10\1\0\1\10"+
    "\1\0\3\10\1\0\2\10\1\0\1\10\2\0\1\10\1\0\1\10\1\0\1\10\1\0\1\10\1\0\1\10\1"+
    "\0\2\10\1\0\1\10\2\0\4\10\1\0\7\10\1\0\4\10\1\0\4\10\1\0\1\10\1\0\12\10\1"+
    "\0\5\10\1\0\3\10\1\0\5\10\1\0\5\10");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\4\0\1\1\1\0\1\2\15\0\1\3\2\4\1\5"+
    "\1\6\7\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\1\1\15\1\17\1\2\1\15\1\20\1\21"+
    "\1\22\1\23\3\4\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40"+
    "\1\41\1\42\1\43\1\3\1\44\1\4\10\7\3\0"+
    "\1\33\2\0\1\45\1\46\11\7\5\0\1\47\1\50"+
    "\4\7\1\51\2\7\3\0\1\52\4\7\1\53\2\7"+
    "\3\0\3\7\1\54\1\55\1\7\1\0\1\56\1\0"+
    "\1\57\1\7\1\60\1\61\1\0\1\62\1\7\1\63"+
    "\1\7\1\64";

  private static int [] zzUnpackAction() {
    int [] result = new int[142];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\50\0\120\0\170\0\240\0\310\0\360\0\u0118"+
    "\0\u0140\0\u0168\0\u0190\0\u01b8\0\u01e0\0\u0208\0\u0230\0\u0258"+
    "\0\u0280\0\u02a8\0\u02d0\0\u02f8\0\u0320\0\u0348\0\u0370\0\u0348"+
    "\0\u0348\0\u0398\0\u03c0\0\u03e8\0\u0410\0\u0438\0\u0460\0\u0488"+
    "\0\u0348\0\u0348\0\u04b0\0\u0348\0\u0348\0\u0348\0\u0348\0\u04d8"+
    "\0\u04d8\0\u0348\0\u0500\0\u0500\0\u0348\0\u0528\0\u0348\0\u0348"+
    "\0\u0550\0\u0578\0\u05a0\0\u0348\0\u05c8\0\u0348\0\u05f0\0\u0348"+
    "\0\u0618\0\u0348\0\u0640\0\u0668\0\u0348\0\u0690\0\u06b8\0\u0348"+
    "\0\u0348\0\u06e0\0\u0708\0\u0730\0\u0348\0\u0758\0\u0780\0\u07a8"+
    "\0\u07d0\0\u07f8\0\u0820\0\u0848\0\u0870\0\u0898\0\u08c0\0\u08e8"+
    "\0\u0910\0\u0938\0\u0960\0\u0988\0\u0348\0\u0348\0\u09b0\0\u09d8"+
    "\0\u0a00\0\u0a28\0\u0a50\0\u0a78\0\u0aa0\0\u0ac8\0\u0af0\0\u0b18"+
    "\0\u0b40\0\u0b68\0\u0b90\0\u0bb8\0\u0be0\0\u0398\0\u0c08\0\u0c30"+
    "\0\u0c58\0\u0c80\0\u0398\0\u0ca8\0\u0cd0\0\u0cf8\0\u0d20\0\u0d48"+
    "\0\u0348\0\u0d70\0\u0d98\0\u0dc0\0\u0de8\0\u0398\0\u0e10\0\u0e38"+
    "\0\u0e60\0\u0e88\0\u0eb0\0\u0ed8\0\u0f00\0\u0f28\0\u0398\0\u0398"+
    "\0\u0f50\0\u0f78\0\u0348\0\u0fa0\0\u0398\0\u0fc8\0\u0398\0\u0398"+
    "\0\u0ff0\0\u0348\0\u1018\0\u0348\0\u1040\0\u0398";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[142];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\26\1\27\2\30\1\31\3\26\1\32\5\26\1\31"+
    "\1\33\2\32\1\34\6\32\1\35\1\36\2\32\1\37"+
    "\1\32\1\40\1\32\1\41\4\26\2\32\2\26\2\30"+
    "\1\42\3\26\1\43\5\26\1\42\22\43\1\26\1\44"+
    "\1\45\2\26\2\43\2\26\2\46\46\26\2\46\1\47"+
    "\11\26\1\47\31\26\2\50\1\46\1\51\44\50\2\26"+
    "\2\46\1\52\11\26\1\52\31\26\2\53\1\46\1\54"+
    "\44\53\2\26\2\46\1\55\11\26\1\55\33\26\2\46"+
    "\4\26\1\56\1\26\1\57\4\26\22\56\5\26\2\56"+
    "\2\26\2\46\1\60\11\26\1\60\33\26\2\46\14\26"+
    "\1\61\1\26\1\62\14\26\1\63\12\26\2\46\1\64"+
    "\11\26\1\64\33\26\2\46\4\26\1\65\6\26\22\65"+
    "\5\26\2\65\2\26\2\46\1\66\11\26\1\66\33\26"+
    "\2\46\1\31\3\26\1\67\5\26\1\31\22\67\5\26"+
    "\2\67\2\26\2\46\1\70\11\26\1\70\33\26\2\46"+
    "\1\31\3\26\1\71\5\26\1\31\22\71\5\26\2\71"+
    "\2\26\2\72\1\31\3\26\1\73\1\74\4\26\1\31"+
    "\22\73\2\26\1\45\2\26\2\73\2\26\3\42\1\75"+
    "\2\26\1\76\1\77\4\26\1\42\22\76\1\26\1\100"+
    "\1\26\1\101\1\26\2\76\2\26\2\72\1\42\1\102"+
    "\1\103\7\26\1\42\25\26\1\101\3\26\7\104\1\26"+
    "\34\104\1\26\1\105\2\104\51\0\1\106\56\0\2\32"+
    "\5\0\22\32\5\0\2\32\10\0\2\32\5\0\1\32"+
    "\1\107\7\32\1\110\10\32\5\0\2\32\10\0\2\32"+
    "\5\0\1\32\1\111\7\32\1\112\10\32\5\0\2\32"+
    "\10\0\2\32\5\0\11\32\1\113\10\32\5\0\2\32"+
    "\10\0\2\32\5\0\5\32\1\114\14\32\5\0\2\32"+
    "\10\0\2\32\5\0\5\32\1\115\14\32\5\0\2\32"+
    "\10\0\2\32\5\0\11\32\1\116\10\32\5\0\2\32"+
    "\10\0\2\43\5\0\22\43\5\0\2\43\2\50\1\0"+
    "\45\50\2\53\1\0\45\53\10\0\2\56\5\0\22\56"+
    "\5\0\2\56\47\0\1\117\21\0\1\120\56\0\1\121"+
    "\27\0\2\65\5\0\22\65\5\0\2\65\10\0\2\67"+
    "\5\0\22\67\5\0\2\67\10\0\2\71\5\0\22\71"+
    "\5\0\2\71\10\0\1\73\1\122\1\123\1\124\1\0"+
    "\1\125\1\0\22\73\5\0\2\73\11\0\1\74\46\0"+
    "\2\76\5\0\22\76\5\0\2\76\11\0\1\77\44\0"+
    "\1\126\46\0\1\126\42\0\7\104\1\0\34\104\2\0"+
    "\2\104\2\106\3\0\43\106\10\0\2\32\5\0\2\32"+
    "\1\127\17\32\5\0\2\32\10\0\2\32\5\0\11\32"+
    "\1\130\10\32\5\0\2\32\10\0\2\32\5\0\7\32"+
    "\1\131\12\32\5\0\2\32\10\0\2\32\5\0\5\32"+
    "\1\132\14\32\5\0\2\32\10\0\2\32\5\0\1\133"+
    "\14\32\1\134\4\32\5\0\2\32\10\0\2\32\5\0"+
    "\1\32\1\135\20\32\5\0\2\32\10\0\2\32\5\0"+
    "\5\32\1\136\14\32\5\0\2\32\10\0\2\32\5\0"+
    "\12\32\1\137\7\32\5\0\2\32\20\0\1\140\64\0"+
    "\1\141\43\0\1\142\26\0\2\122\1\123\1\124\3\0"+
    "\22\122\5\0\2\122\12\0\1\143\51\0\1\144\43\0"+
    "\2\32\5\0\3\32\1\145\16\32\5\0\2\32\10\0"+
    "\2\32\5\0\14\32\1\146\5\32\5\0\2\32\10\0"+
    "\2\32\5\0\4\32\1\147\15\32\5\0\2\32\10\0"+
    "\2\32\5\0\15\32\1\150\4\32\5\0\2\32\10\0"+
    "\2\32\5\0\1\32\1\151\20\32\5\0\2\32\10\0"+
    "\2\32\5\0\16\32\1\152\3\32\5\0\2\32\10\0"+
    "\2\32\5\0\7\32\1\153\12\32\5\0\2\32\10\0"+
    "\2\32\5\0\1\32\1\154\20\32\5\0\2\32\10\0"+
    "\2\32\5\0\15\32\1\155\4\32\5\0\2\32\26\0"+
    "\1\156\67\0\1\157\25\0\1\160\35\0\1\144\52\0"+
    "\1\161\42\0\2\32\5\0\4\32\1\162\15\32\5\0"+
    "\2\32\10\0\2\32\5\0\10\32\1\163\11\32\5\0"+
    "\2\32\10\0\2\32\5\0\16\32\1\164\3\32\5\0"+
    "\2\32\10\0\2\32\5\0\2\32\1\165\17\32\5\0"+
    "\2\32\10\0\2\32\5\0\17\32\1\166\2\32\5\0"+
    "\2\32\10\0\2\32\5\0\7\32\1\167\12\32\5\0"+
    "\2\32\10\0\2\32\5\0\1\32\1\170\20\32\5\0"+
    "\2\32\46\0\1\171\21\0\1\172\57\0\1\173\27\0"+
    "\2\32\5\0\5\32\1\174\14\32\5\0\2\32\10\0"+
    "\2\32\5\0\5\32\1\175\14\32\5\0\2\32\10\0"+
    "\2\32\5\0\7\32\1\176\12\32\5\0\2\32\10\0"+
    "\2\32\5\0\3\32\1\177\16\32\5\0\2\32\10\0"+
    "\2\32\5\0\15\32\1\200\4\32\5\0\2\32\10\0"+
    "\2\32\5\0\21\32\1\201\5\0\2\32\30\0\1\202"+
    "\45\0\1\203\42\0\1\204\36\0\2\32\5\0\6\32"+
    "\1\205\13\32\5\0\2\32\10\0\2\32\5\0\5\32"+
    "\1\206\14\32\5\0\2\32\10\0\2\32\5\0\6\32"+
    "\1\207\13\32\5\0\2\32\10\0\2\32\5\0\15\32"+
    "\1\210\4\32\5\0\2\32\31\0\1\211\36\0\1\212"+
    "\37\0\2\32\5\0\10\32\1\213\11\32\5\0\2\32"+
    "\20\0\1\214\37\0\2\32\5\0\11\32\1\215\10\32"+
    "\5\0\2\32\10\0\2\32\5\0\12\32\1\216\7\32"+
    "\5\0\2\32";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4200];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\4\0\1\1\1\0\1\1\15\0\1\1\1\11\1\1"+
    "\2\11\7\1\2\11\1\1\4\11\2\1\1\11\2\1"+
    "\1\11\1\1\2\11\3\1\1\11\1\1\1\11\1\1"+
    "\1\11\1\1\1\11\2\1\1\11\2\1\2\11\3\1"+
    "\1\11\11\1\3\0\1\1\2\0\2\11\11\1\5\0"+
    "\11\1\3\0\1\11\7\1\3\0\6\1\1\0\1\11"+
    "\1\0\4\1\1\0\1\11\1\1\1\11\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[142];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public RedLibCommandLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public RedLibCommandLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return HELPMESSAGE;
            } 
            // fall through
          case 53: break;
          case 2: 
            { return HELPMSGKEY;
            } 
            // fall through
          case 54: break;
          case 3: 
            { return DEFAULT_VALUE;
            } 
            // fall through
          case 55: break;
          case 4: 
            { return COMMENT;
            } 
            // fall through
          case 56: break;
          case 5: 
            { return NEWLINE;
            } 
            // fall through
          case 57: break;
          case 6: 
            { return SPACE;
            } 
            // fall through
          case 58: break;
          case 7: 
            { yybegin(COMMAND);return COMMANDNAME;
            } 
            // fall through
          case 59: break;
          case 8: 
            { return CBRACKET;
            } 
            // fall through
          case 60: break;
          case 9: 
            { yybegin(ARGS);return SPACE;
            } 
            // fall through
          case 61: break;
          case 10: 
            { return ALIAS;
            } 
            // fall through
          case 62: break;
          case 11: 
            { return ALIASSEPARATOR;
            } 
            // fall through
          case 63: break;
          case 12: 
            { yybegin(YYINITIAL);return OBRACKET;
            } 
            // fall through
          case 64: break;
          case 13: 
            { yybegin(YYINITIAL);return NEWLINE;
            } 
            // fall through
          case 65: break;
          case 14: 
            { yybegin(HELPVALUE);return SEPARATOR;
            } 
            // fall through
          case 66: break;
          case 15: 
            { yybegin(HELPMSGVALUE);return SEPARATOR;
            } 
            // fall through
          case 67: break;
          case 16: 
            { yybegin(PERMISSIONVALUE);return SEPARATOR;
            } 
            // fall through
          case 68: break;
          case 17: 
            { return PERMISSION_VALUE;
            } 
            // fall through
          case 69: break;
          case 18: 
            { return DOT;
            } 
            // fall through
          case 70: break;
          case 19: 
            { yybegin(USERVALUE);return SEPARATOR;
            } 
            // fall through
          case 71: break;
          case 20: 
            { yybegin(HOOKVALUE);return SEPARATOR;
            } 
            // fall through
          case 72: break;
          case 21: 
            { return HOOKNAME;
            } 
            // fall through
          case 73: break;
          case 22: 
            { yybegin(CONTEXTVALUE);return SEPARATOR;
            } 
            // fall through
          case 74: break;
          case 23: 
            { return CONTEXTNAME;
            } 
            // fall through
          case 75: break;
          case 24: 
            { yybegin(ASSERTVALUE);return SEPARATOR;
            } 
            // fall through
          case 76: break;
          case 25: 
            { return ASSERTNAME;
            } 
            // fall through
          case 77: break;
          case 26: 
            { yybegin(COMMAND);return NEWLINE;
            } 
            // fall through
          case 78: break;
          case 27: 
            { yybegin(ARG);return ARG_NAME;
            } 
            // fall through
          case 79: break;
          case 28: 
            { yybegin(FLAG);return DASHES;
            } 
            // fall through
          case 80: break;
          case 29: 
            { return FLAG_MODIFIER;
            } 
            // fall through
          case 81: break;
          case 30: 
            { return FLAG_NAME;
            } 
            // fall through
          case 82: break;
          case 31: 
            { return DASHES;
            } 
            // fall through
          case 83: break;
          case 32: 
            { return COMMA;
            } 
            // fall through
          case 84: break;
          case 33: 
            { yybegin(DEFAULTVALUE);return BRACKET_OPEN;
            } 
            // fall through
          case 85: break;
          case 34: 
            { return NOSHOWTYPE;
            } 
            // fall through
          case 86: break;
          case 35: 
            { return NOTREQUIRED;
            } 
            // fall through
          case 87: break;
          case 36: 
            { yybegin(ARGS);return BRACKET_CLOSE;
            } 
            // fall through
          case 88: break;
          case 37: 
            { return ARG_TYPE;
            } 
            // fall through
          case 89: break;
          case 38: 
            { return BOTHMODIFIERS;
            } 
            // fall through
          case 90: break;
          case 39: 
            { yybegin(HELP);return RedLibCommandTypes.HELP;
            } 
            // fall through
          case 91: break;
          case 40: 
            { yybegin(HOOK);return RedLibCommandTypes.HOOK;
            } 
            // fall through
          case 92: break;
          case 41: 
            { yybegin(USER);return RedLibCommandTypes.USER;
            } 
            // fall through
          case 93: break;
          case 42: 
            { return ARG_TYPE_CONSUME;
            } 
            // fall through
          case 94: break;
          case 43: 
            { yybegin(NOARG);return NOTAB;
            } 
            // fall through
          case 95: break;
          case 44: 
            { yybegin(NOARG);return NOHELP;
            } 
            // fall through
          case 96: break;
          case 45: 
            { yybegin(ASSERT);return RedLibCommandTypes.ASSERT;
            } 
            // fall through
          case 97: break;
          case 46: 
            { return PLAYER;
            } 
            // fall through
          case 98: break;
          case 47: 
            { yybegin(HELPMSG);return RedLibCommandTypes.HELPMSG;
            } 
            // fall through
          case 99: break;
          case 48: 
            { yybegin(NOARG);return POSTARG;
            } 
            // fall through
          case 100: break;
          case 49: 
            { yybegin(CONTEXT);return RedLibCommandTypes.CONTEXT;
            } 
            // fall through
          case 101: break;
          case 50: 
            { return CONSOLE;
            } 
            // fall through
          case 102: break;
          case 51: 
            { return EVERYONE;
            } 
            // fall through
          case 103: break;
          case 52: 
            { yybegin(PERMISSION);return RedLibCommandTypes.PERMISSION;
            } 
            // fall through
          case 104: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
