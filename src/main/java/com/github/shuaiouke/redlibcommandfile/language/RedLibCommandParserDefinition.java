package com.github.shuaiouke.redlibcommandfile.language;

import com.github.shuaiouke.redlibcommandfile.language.parser.RedLibCommandParser;
import com.github.shuaiouke.redlibcommandfile.language.psi.RedLibCommandFile;
import com.github.shuaiouke.redlibcommandfile.language.psi.RedLibCommandTypes;
import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;

public class RedLibCommandParserDefinition implements ParserDefinition {

    public static final TokenSet WHITE_SPACES = TokenSet.create();
    public static final TokenSet COMMENTS = TokenSet.create(RedLibCommandTypes.COMMENT);

    public static final IFileElementType FILE = new IFileElementType(RedLibCommandLanguage.INSTANCE);


    @Override
    public @NotNull Lexer createLexer(Project project) {
        return new RedLibCommandLexerAdapter();
    }

    @Override
    public PsiParser createParser(Project project) {
        return new RedLibCommandParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @Override
    public @NotNull TokenSet getWhitespaceTokens() {
        return WHITE_SPACES;
    }

    @Override
    public @NotNull TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @Override
    public @NotNull TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @Override
    public @NotNull PsiElement createElement(ASTNode node) {
        return null;
    }

    @Override
    public PsiFile createFile(FileViewProvider viewProvider) {
        return new RedLibCommandFile(viewProvider);
    }

    @Override
    public SpaceRequirements spaceExistenceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }
}
