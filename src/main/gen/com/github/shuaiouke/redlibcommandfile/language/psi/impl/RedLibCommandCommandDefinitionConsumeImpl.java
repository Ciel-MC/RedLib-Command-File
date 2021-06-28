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

public class RedLibCommandCommandDefinitionConsumeImpl extends ASTWrapperPsiElement implements RedLibCommandCommandDefinitionConsume {

  public RedLibCommandCommandDefinitionConsumeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RedLibCommandVisitor visitor) {
    visitor.visitCommandDefinitionConsume(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RedLibCommandVisitor) accept((RedLibCommandVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RedLibCommandArgsConsume getArgsConsume() {
    return findChildByClass(RedLibCommandArgsConsume.class);
  }

  @Override
  @NotNull
  public List<RedLibCommandBlankLine> getBlankLineList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RedLibCommandBlankLine.class);
  }

  @Override
  @NotNull
  public RedLibCommandCloseBracket getCloseBracket() {
    return findNotNullChildByClass(RedLibCommandCloseBracket.class);
  }

  @Override
  @NotNull
  public List<RedLibCommandLineConsume> getLineConsumeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RedLibCommandLineConsume.class);
  }

  @Override
  @NotNull
  public RedLibCommandOpenBracket getOpenBracket() {
    return findNotNullChildByClass(RedLibCommandOpenBracket.class);
  }

}
