// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi.impl;

import com.ericsson.otp.erlang.OtpErlangObject;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiReference;
import com.intellij.psi.ResolveState;
import com.intellij.psi.scope.PsiScopeProcessor;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.util.PsiTreeUtil;
import org.apache.commons.lang.math.IntRange;
import org.elixir_lang.psi.*;
import org.elixir_lang.psi.stub.UnmatchedUnqualifiedNoParenthesesCall;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ElixirUnmatchedUnqualifiedNoParenthesesCallImpl extends NamedStubbedPsiElementBase<UnmatchedUnqualifiedNoParenthesesCall> implements ElixirUnmatchedUnqualifiedNoParenthesesCall {

  public ElixirUnmatchedUnqualifiedNoParenthesesCallImpl(UnmatchedUnqualifiedNoParenthesesCall stub, IStubElementType nodeType) {
    super(stub, nodeType);
  }

  public ElixirUnmatchedUnqualifiedNoParenthesesCallImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ElixirVisitor visitor) {
    visitor.visitUnmatchedUnqualifiedNoParenthesesCall(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ElixirVisitor) accept((ElixirVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ElixirDoBlock getDoBlock() {
    return PsiTreeUtil.getChildOfType(this, ElixirDoBlock.class);
  }

  @Override
  @NotNull
  public ElixirIdentifier getIdentifier() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, ElixirIdentifier.class));
  }

  @Override
  @NotNull
  public ElixirNoParenthesesOneArgument getNoParenthesesOneArgument() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, ElixirNoParenthesesOneArgument.class));
  }

  @Nullable
  public String functionName() {
    return ElixirPsiImplUtil.functionName(this);
  }

  @NotNull
  public PsiElement functionNameElement() {
    return ElixirPsiImplUtil.functionNameElement(this);
  }

  public boolean hasDoBlockOrKeyword() {
    return ElixirPsiImplUtil.hasDoBlockOrKeyword(this);
  }

  @Nullable
  public String getName() {
    return ElixirPsiImplUtil.getName(this);
  }

  public PsiElement getNameIdentifier() {
    return ElixirPsiImplUtil.getNameIdentifier(this);
  }

  @Nullable
  public PsiReference getReference() {
    return ElixirPsiImplUtil.getReference(this);
  }

  public boolean isCalling(String resolvedModuleName, String resolvedFunctionName) {
    return ElixirPsiImplUtil.isCalling(this, resolvedModuleName, resolvedFunctionName);
  }

  public boolean isCalling(String resolvedModuleName, String resolvedFunctionName, int resolvedFinalArity) {
    return ElixirPsiImplUtil.isCalling(this, resolvedModuleName, resolvedFunctionName, resolvedFinalArity);
  }

  public boolean isCallingMacro(String resolvedModuleName, String resolvedFunctionName) {
    return ElixirPsiImplUtil.isCallingMacro(this, resolvedModuleName, resolvedFunctionName);
  }

  public boolean isCallingMacro(String resolvedModuleName, String resolvedFunctionName, int resolvedFinalArity) {
    return ElixirPsiImplUtil.isCallingMacro(this, resolvedModuleName, resolvedFunctionName, resolvedFinalArity);
  }

  @Nullable
  public String moduleName() {
    return ElixirPsiImplUtil.moduleName(this);
  }

  @NotNull
  public PsiElement[] primaryArguments() {
    return ElixirPsiImplUtil.primaryArguments(this);
  }

  @Nullable
  public Integer primaryArity() {
    return ElixirPsiImplUtil.primaryArity(this);
  }

  public boolean processDeclarations(PsiScopeProcessor processor, ResolveState state, PsiElement lastParent, PsiElement place) {
    return ElixirPsiImplUtil.processDeclarations(this, processor, state, lastParent, place);
  }

  @NotNull
  public OtpErlangObject quote() {
    return ElixirPsiImplUtil.quote(this);
  }

  @NotNull
  public int resolvedFinalArity() {
    return ElixirPsiImplUtil.resolvedFinalArity(this);
  }

  @NotNull
  public IntRange resolvedFinalArityRange() {
    return ElixirPsiImplUtil.resolvedFinalArityRange(this);
  }

  @NotNull
  public String resolvedFunctionName() {
    return ElixirPsiImplUtil.resolvedFunctionName(this);
  }

  @NotNull
  public String resolvedModuleName() {
    return ElixirPsiImplUtil.resolvedModuleName(this);
  }

  @Nullable
  public Integer resolvedPrimaryArity() {
    return ElixirPsiImplUtil.resolvedPrimaryArity(this);
  }

  @Nullable
  public Integer resolvedSecondaryArity() {
    return ElixirPsiImplUtil.resolvedSecondaryArity(this);
  }

  @Nullable
  public PsiElement[] secondaryArguments() {
    return ElixirPsiImplUtil.secondaryArguments(this);
  }

  @Nullable
  public Integer secondaryArity() {
    return ElixirPsiImplUtil.secondaryArity(this);
  }

  @NotNull
  public PsiElement setName(String newName) {
    return ElixirPsiImplUtil.setName(this, newName);
  }

}
