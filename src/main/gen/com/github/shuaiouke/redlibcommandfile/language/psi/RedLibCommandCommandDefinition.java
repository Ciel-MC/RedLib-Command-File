// This is a generated file. Not intended for manual editing.
package com.github.shuaiouke.redlibcommandfile.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RedLibCommandCommandDefinition extends PsiElement {

  @NotNull
  RedLibCommandCloseBracket getCloseBracket();

  @NotNull
  List<RedLibCommandCommandDefinition> getCommandDefinitionList();

  @NotNull
  List<RedLibCommandCommandProperty> getCommandPropertyList();

  @NotNull
  RedLibCommandOpenBracket getOpenBracket();

}
