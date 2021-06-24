// This is a generated file. Not intended for manual editing.
package com.github.shuaiouke.redlibcommandfile.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.shuaiouke.redlibcommandfile.language.psi.RedLibCommandTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.shuaiouke.redlibcommandfile.language.psi.*;

public class RedLibCommandCommandDefinitionImpl extends ASTWrapperPsiElement implements RedLibCommandCommandDefinition {

  public RedLibCommandCommandDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RedLibCommandVisitor visitor) {
    visitor.visitCommandDefinition(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RedLibCommandVisitor) accept((RedLibCommandVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public RedLibCommandCloseBracket getCloseBracket() {
    return findNotNullChildByClass(RedLibCommandCloseBracket.class);
  }

  @Override
  @NotNull
  public List<RedLibCommandCommandDefinition> getCommandDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RedLibCommandCommandDefinition.class);
  }

  @Override
  @NotNull
  public List<RedLibCommandCommandProperty> getCommandPropertyList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RedLibCommandCommandProperty.class);
  }

  @Override
  @NotNull
  public RedLibCommandOpenBracket getOpenBracket() {
    return findNotNullChildByClass(RedLibCommandOpenBracket.class);
  }

}