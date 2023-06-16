package com.github.cielmc.redlibcommandfile.language

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object RedLibCommandFileType: LanguageFileType(RedLibCommandLanguage) {
    override fun getName(): String = "RedLib Command File"

    override fun getDescription(): String = "RedLib command file"

    override fun getDefaultExtension(): String = "rdcml"

    override fun getIcon(): Icon = RedLibCommandIcon.FILE
}
