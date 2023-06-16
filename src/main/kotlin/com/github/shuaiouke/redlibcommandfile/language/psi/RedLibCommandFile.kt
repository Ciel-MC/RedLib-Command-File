package com.github.shuaiouke.redlibcommandfile.language.psi

import com.github.shuaiouke.redlibcommandfile.language.RedLibCommandFileType
import com.github.shuaiouke.redlibcommandfile.language.RedLibCommandLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class RedLibCommandFile(viewProvider: FileViewProvider): PsiFileBase(viewProvider, RedLibCommandLanguage) {
    override fun getFileType(): FileType {
        return RedLibCommandFileType
    }

    override fun toString(): String {
        return "RedLib Command File"
    }
}
