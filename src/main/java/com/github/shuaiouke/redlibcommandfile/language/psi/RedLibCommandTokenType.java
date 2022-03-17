package com.github.shuaiouke.redlibcommandfile.language.psi;

import com.github.shuaiouke.redlibcommandfile.language.RedLibCommandLanguage;
import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class RedLibCommandTokenType extends IElementType {
    public RedLibCommandTokenType(@NotNull String debugName) {
        super(debugName, RedLibCommandLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
