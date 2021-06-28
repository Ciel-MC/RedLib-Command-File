// This is a generated file. Not intended for manual editing.
package com.github.shuaiouke.redlibcommandfile.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RedLibCommandArgsConsume extends PsiElement {

  @NotNull
  List<RedLibCommandArg> getArgList();

  @NotNull
  RedLibCommandConsumingArg getConsumingArg();

  @NotNull
  List<RedLibCommandFlag> getFlagList();

}
