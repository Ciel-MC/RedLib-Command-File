// This is a generated file. Not intended for manual editing.
package com.github.shuaiouke.redlibcommandfile.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RedLibCommandCommandDefinitionConsume extends PsiElement {

  @Nullable
  RedLibCommandArgsConsume getArgsConsume();

  @NotNull
  List<RedLibCommandBlankLine> getBlankLineList();

  @NotNull
  RedLibCommandCloseBracket getCloseBracket();

  @NotNull
  List<RedLibCommandLineConsume> getLineConsumeList();

  @NotNull
  RedLibCommandOpenBracket getOpenBracket();

}
