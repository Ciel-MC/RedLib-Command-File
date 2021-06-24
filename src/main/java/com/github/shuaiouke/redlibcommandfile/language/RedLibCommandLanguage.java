package com.github.shuaiouke.redlibcommandfile.language;

import com.intellij.lang.Language;

public class RedLibCommandLanguage extends Language {

    public static final RedLibCommandLanguage INSTANCE = new RedLibCommandLanguage();

    public RedLibCommandLanguage()
    {
        super("RLCF");
    }
}
