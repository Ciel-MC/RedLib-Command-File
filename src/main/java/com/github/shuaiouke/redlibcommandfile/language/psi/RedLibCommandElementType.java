package com.github.shuaiouke.redlibcommandfile.language.psi;

import com.github.shuaiouke.redlibcommandfile.language.RedLibCommandLanguage;
import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class RedLibCommandElementType extends IElementType {
    public RedLibCommandElementType(@NotNull String debugName) {
        super(debugName, RedLibCommandLanguage.INSTANCE);
    }
}
