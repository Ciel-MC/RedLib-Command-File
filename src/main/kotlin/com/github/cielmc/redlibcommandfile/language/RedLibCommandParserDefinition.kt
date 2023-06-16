package com.github.cielmc.redlibcommandfile.language

import com.github.cielmc.redlibcommandfile.language.parser.RedLibCommandParser
import com.github.cielmc.redlibcommandfile.language.psi.RedLibCommandFile
import com.github.cielmc.redlibcommandfile.language.psi.RedLibCommandTypes
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet

class RedLibCommandParserDefinition: ParserDefinition {
    override fun createLexer(project: Project): Lexer {
        return RedLibCommandLexerAdapter()
    }

    override fun createParser(project: Project): PsiParser {
        return RedLibCommandParser()
    }

    override fun getFileNodeType(): IFileElementType {
        return FILE
    }

    override fun getWhitespaceTokens(): TokenSet {
        return WHITE_SPACES
    }

    override fun getCommentTokens(): TokenSet {
        return COMMENTS
    }

    override fun getStringLiteralElements(): TokenSet {
        return TokenSet.EMPTY
    }

    override fun createElement(node: ASTNode): PsiElement = null!!

    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return RedLibCommandFile(viewProvider)
    }

    override fun spaceExistenceTypeBetweenTokens(left: ASTNode, right: ASTNode): ParserDefinition.SpaceRequirements {
        return ParserDefinition.SpaceRequirements.MAY
    }

    companion object {
        val WHITE_SPACES = TokenSet.create()
        val COMMENTS = TokenSet.create(RedLibCommandTypes.COMMENT)
        val FILE = IFileElementType(RedLibCommandLanguage)
    }
}
