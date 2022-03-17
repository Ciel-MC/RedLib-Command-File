package com.github.shuaiouke.redlibcommandfile.language.psi;

import com.github.shuaiouke.redlibcommandfile.language.RedLibCommandFileType;
import com.github.shuaiouke.redlibcommandfile.language.RedLibCommandLanguage;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

import static com.github.shuaiouke.redlibcommandfile.language.RedLibCommandLanguage.*;

public class RedLibCommandFile extends PsiFileBase {
    public RedLibCommandFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, INSTANCE);
    }

    @Override
    public @NotNull FileType getFileType() {
        return RedLibCommandFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "RedLib Command File";
    }
}
