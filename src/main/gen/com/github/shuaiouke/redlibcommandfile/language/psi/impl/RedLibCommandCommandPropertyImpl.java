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

public class RedLibCommandCommandPropertyImpl extends ASTWrapperPsiElement implements RedLibCommandCommandProperty {

  public RedLibCommandCommandPropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RedLibCommandVisitor visitor) {
    visitor.visitCommandProperty(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RedLibCommandVisitor) accept((RedLibCommandVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RedLibCommandHelpLine getHelpLine() {
    return findChildByClass(RedLibCommandHelpLine.class);
  }

  @Override
  @Nullable
  public RedLibCommandPermissionLine getPermissionLine() {
    return findChildByClass(RedLibCommandPermissionLine.class);
  }

  @Override
  @Nullable
  public RedLibCommandUserLine getUserLine() {
    return findChildByClass(RedLibCommandUserLine.class);
  }

}
