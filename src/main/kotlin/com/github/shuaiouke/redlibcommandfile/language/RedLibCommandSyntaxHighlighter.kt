package com.github.shuaiouke.redlibcommandfile.language

import com.github.shuaiouke.redlibcommandfile.language.psi.RedLibCommandTypes
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType

class RedLibCommandSyntaxHighlighter: SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer {
        return RedLibCommandLexerAdapter()
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        return when {
            (tokenType == RedLibCommandTypes.COMMANDNAME) or (tokenType == RedLibCommandTypes.ALIAS) -> {
                COMMAND_NAME_KEYS
            }

            (tokenType == RedLibCommandTypes.HELP) or (tokenType == RedLibCommandTypes.HELPMSG) or (tokenType == RedLibCommandTypes.PERMISSION) or (tokenType == RedLibCommandTypes.USER) or (tokenType == RedLibCommandTypes.HOOK) or (tokenType == RedLibCommandTypes.NOHELP) or (tokenType == RedLibCommandTypes.NOTAB) or (tokenType == RedLibCommandTypes.POSTARG) or (tokenType == RedLibCommandTypes.CONTEXT) or (tokenType == RedLibCommandTypes.ASSERT) or (tokenType == RedLibCommandTypes.HIDESUB) -> {
                TAG_KEYS
            }

            (tokenType == RedLibCommandTypes.DASHES) or (tokenType == RedLibCommandTypes.ARG_NAME) or (tokenType == RedLibCommandTypes.FLAG_NAME) -> {
                ARG_NAME_KEYS
            }

            tokenType == RedLibCommandTypes.ARG_TYPE -> {
                ARG_TYPE_KEYS
            }

            tokenType == RedLibCommandTypes.COMMENT -> {
                INVALID_KEYS
            }

            (tokenType == RedLibCommandTypes.CONSUME_TOKEN) or (tokenType == RedLibCommandTypes.CONSTRAINT) -> {
                IDENTIFIER_KEYS
            }

            else -> EMPTY_KEYS
        }
    }

    companion object {
        val COMMAND_NAME =
            TextAttributesKey.createTextAttributesKey("REDLIB_COMMANDNAME", DefaultLanguageHighlighterColors.KEYWORD)
        val TAG = TextAttributesKey.createTextAttributesKey("REDLIB_TAG", DefaultLanguageHighlighterColors.KEYWORD)
        val ARG_NAME =
            TextAttributesKey.createTextAttributesKey("REDLIB_ARG_NAME", DefaultLanguageHighlighterColors.STRING)
        val ARG_TYPE =
            TextAttributesKey.createTextAttributesKey("REDLIB_ARG_TYPE", DefaultLanguageHighlighterColors.KEYWORD)
        val COMMENT_INVALID_LINE =
            TextAttributesKey.createTextAttributesKey("REDLIB_INVALID", DefaultLanguageHighlighterColors.LINE_COMMENT)
        val IDENTIFIER =
            TextAttributesKey.createTextAttributesKey("REDLIB_VALID", DefaultLanguageHighlighterColors.IDENTIFIER)
        private val COMMAND_NAME_KEYS = arrayOf(COMMAND_NAME)
        private val TAG_KEYS = arrayOf(TAG)
        private val ARG_NAME_KEYS = arrayOf(ARG_NAME)
        private val ARG_TYPE_KEYS = arrayOf(ARG_TYPE)
        private val INVALID_KEYS = arrayOf(COMMENT_INVALID_LINE)
        private val EMPTY_KEYS = arrayOf<TextAttributesKey>()
        private val IDENTIFIER_KEYS = arrayOf(IDENTIFIER)
    }
}
