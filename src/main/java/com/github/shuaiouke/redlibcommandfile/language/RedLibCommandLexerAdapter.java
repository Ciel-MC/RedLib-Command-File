package com.github.shuaiouke.redlibcommandfile.language;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.FlexLexer;
import org.jetbrains.annotations.NotNull;

public class RedLibCommandLexerAdapter extends FlexAdapter {
    public RedLibCommandLexerAdapter() {
        super(new RedLibCommandLexer(null));
    }
}
