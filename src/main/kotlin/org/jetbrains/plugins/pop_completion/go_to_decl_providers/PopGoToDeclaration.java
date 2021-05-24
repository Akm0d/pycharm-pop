package org.jetbrains.plugins.pop_completion.go_to_decl_providers;

import com.intellij.codeInsight.navigation.actions.GotoDeclarationHandler;
import com.intellij.openapi.editor.Editor;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.lang.pop.Hub;

/**
 * go to declaration functionality for associative array keys
 */
public class PopGoToDeclaration extends Hub implements GotoDeclarationHandler
{
    @Nullable
    @Override
    public PsiElement[] getGotoDeclarationTargets(PsiElement psiElement, int i, Editor editor)
    {
        /*
        SearchContext search = new SearchContext().setDepth(35);
        IFuncCtx funcCtx = new FuncCtx(search, L());

        L<PsiElement> psiTargets = opt(psiElement.getParent())
                .fap(toCast(PyStringLiteralExpression.class))
                .fap(literal -> Lang.opt(literal.getParent())
                        .fap(toCast(PySubscriptionExpression.class))
                        .map(sub -> sub.getOperand())
                        .map(var -> funcCtx.findExprType(var))
                        .map(mt -> mt.getKeyPsi(literal.getStringValue())))
                .def(list());

        return psiTargets
                .map(psi -> truncateOnLineBreak(psi))
                .toArray(new PsiElement[psiTargets.size()]);

         */
        return new PsiElement[0];
    }
}