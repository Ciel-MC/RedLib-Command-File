package com.github.shuaiouke.redlibcommandfile.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.NlsContexts;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class RedLibCommandFileType extends LanguageFileType {

    public static final RedLibCommandFileType INSTANCE = new RedLibCommandFileType();

    private RedLibCommandFileType()
    {
        super(RedLibCommandLanguage.INSTANCE);
    }


    @Override
    public @NotNull String getName() {
        return "RedLib Command File";
    }

    @Override
    public @NotNull @NlsContexts.Label String getDescription() {
        return "RedLib's Command File";
    }

    @Override
    public @NotNull String getDefaultExtension() {
        return "rdcml";
    }

    @Override
    public @Nullable Icon getIcon() {
        return RedLibCommandIcon.FILE;
    }
}
