package com.github.shuaiouke.redlibcommandfile.language;

import com.github.shuaiouke.redlibcommandfile.language.psi.RedLibCommandTokenType;
import com.github.shuaiouke.redlibcommandfile.language.psi.RedLibCommandTypes;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class RedLibCommandSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey COMMAND_NAME =
            createTextAttributesKey("REDLIB_COMMANDNAME", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey TAG =
            createTextAttributesKey("REDLIB_TAG", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey ARG_NAME =
            createTextAttributesKey("REDLIB_ARG_NAME",DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey ARG_TYPE =
            createTextAttributesKey("REDLIB_ARG_TYPE",DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey COMMENT_INVALID_LINE =
            createTextAttributesKey("REDLIB_INVALID",DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey IDENTIFIER =
            createTextAttributesKey("REDLIB_VALID",DefaultLanguageHighlighterColors.IDENTIFIER);

    private static final TextAttributesKey[] COMMAND_NAME_KEYS = new TextAttributesKey[]{COMMAND_NAME};
    private static final TextAttributesKey[] TAG_KEYS = new TextAttributesKey[]{TAG};
    private static final TextAttributesKey[] ARG_NAME_KEYS = new TextAttributesKey[]{ARG_NAME};
    private static final TextAttributesKey[] ARG_TYPE_KEYS = new TextAttributesKey[]{ARG_TYPE};
    private static final TextAttributesKey[] INVALID_KEYS = new TextAttributesKey[]{COMMENT_INVALID_LINE};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
    private static final TextAttributesKey[] IDENTIFIER_KEYS = new TextAttributesKey[]{IDENTIFIER};

    @Override
    public @NotNull Lexer getHighlightingLexer() {
        return new RedLibCommandLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(RedLibCommandTypes.COMMANDNAME)|
            tokenType.equals(RedLibCommandTypes.ALIAS)) {
            return COMMAND_NAME_KEYS;
        } else if (tokenType.equals(RedLibCommandTypes.HELP) |
                tokenType.equals(RedLibCommandTypes.HELPMSG) |
                tokenType.equals(RedLibCommandTypes.PERMISSION) |
                tokenType.equals(RedLibCommandTypes.USER) |
                tokenType.equals(RedLibCommandTypes.HOOK) |
                tokenType.equals(RedLibCommandTypes.NOHELP) |
                tokenType.equals(RedLibCommandTypes.NOTAB) |
                tokenType.equals(RedLibCommandTypes.POSTARG) |
                tokenType.equals(RedLibCommandTypes.CONTEXT) |
                tokenType.equals(RedLibCommandTypes.ASSERT) |
                tokenType.equals(RedLibCommandTypes.HIDESUB)
        ) {
            return TAG_KEYS;
        } else if (tokenType.equals(RedLibCommandTypes.DASHES) |
                tokenType.equals(RedLibCommandTypes.ARG_NAME) |
                tokenType.equals(RedLibCommandTypes.FLAG_NAME)){
            return ARG_NAME_KEYS;
        }else if(tokenType.equals(RedLibCommandTypes.ARG_TYPE))
        {
            return ARG_TYPE_KEYS;
        }else if(tokenType.equals(RedLibCommandTypes.COMMENT)) {
            return INVALID_KEYS;
        }else if(tokenType.equals(RedLibCommandTypes.CONSUME_TOKEN) |
               tokenType.equals(RedLibCommandTypes.CONSTRAINT)
        ){
            return IDENTIFIER_KEYS;
        }else {
            return EMPTY_KEYS;
        }
    }
}
