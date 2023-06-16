package com.github.cielmc.redlibcommandfile.language

import com.github.cielmc.redlibcommandfile.language.psi.RedLibCommandTypes
import com.intellij.lang.BracePair
import com.intellij.lang.PairedBraceMatcher
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IElementType

class RedLibCommandBraceMatcher: PairedBraceMatcher {
    override fun getPairs(): Array<BracePair> = PAIRS

    override fun isPairedBracesAllowedBeforeType(lbraceType: IElementType, contextType: IElementType?): Boolean = true

    override fun getCodeConstructStart(file: PsiFile, openingBraceOffset: Int): Int {
        return openingBraceOffset
    }

    companion object {
        private val PAIRS = arrayOf(
            BracePair(RedLibCommandTypes.OBRACKET, RedLibCommandTypes.CBRACKET, true)
        )
        // private fun getElementType(s: String): IElementType {
        //     return IElementType(s, RedLibCommandLanguage)
        // }
    }
}
