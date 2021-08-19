package com.github.shuaiouke.redlibcommandfile.language;

import com.intellij.codeInsight.highlighting.BraceMatcher;
import com.intellij.codeInsight.highlighting.PairedBraceMatcherAdapter;
import com.intellij.ide.highlighter.custom.impl.CustomFileTypeBraceMatcher;
import com.intellij.lang.BracePair;
import com.intellij.lang.PairedBraceMatcher;
import com.intellij.openapi.editor.highlighter.HighlighterIterator;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static com.github.shuaiouke.redlibcommandfile.language.psi.RedLibCommandTypes.*;
import static com.intellij.psi.CustomHighlighterTokenType.*;

public class RedLibCommandBraceMatcher implements PairedBraceMatcher {
    private static final BracePair[] PAIRS = new BracePair[]{
            new BracePair(BRACKET_OPEN, new IElementType("}", null), false),
            new BracePair(OBRACKET, CBRACKET, true),
    };

    private static IElementType getElementType(String s) {
        return new IElementType(s, RedLibCommandLanguage.INSTANCE);
    }

    @Override
    public BracePair @NotNull [] getPairs() {
        return PAIRS;
    }

    @Override
    public boolean isPairedBracesAllowedBeforeType(@NotNull final IElementType lbraceType, @Nullable final IElementType contextType) {
        return true;
    }

    @Override
    public int getCodeConstructStart(final PsiFile file, final int openingBraceOffset) {
        return openingBraceOffset;
    }
}
