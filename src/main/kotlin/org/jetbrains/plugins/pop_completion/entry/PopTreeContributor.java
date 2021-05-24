package org.jetbrains.plugins.pop_completion.entry;

import com.intellij.codeInsight.completion.CompletionContributor;
import com.intellij.codeInsight.completion.CompletionType;
import com.intellij.patterns.PlatformPatterns;
import com.jetbrains.python.psi.PyCallable;
import com.jetbrains.python.psi.PyNamedParameter;
import org.jetbrains.plugins.pop_completion.completion_providers.PopTreeProvider;

/**
 * provides associative array keys autocomplete
 * using declaration inside the initial function
 * that created this array
 */
public class PopTreeContributor extends CompletionContributor
{
    public PopTreeContributor()
    {
        this.extend(
                CompletionType.BASIC,
                PlatformPatterns.psiElement()
                        .withSuperParent(2, PyNamedParameter.class)
                        .withSuperParent(2, PyCallable.class)
                ,
                new PopTreeProvider()
        );

    }
}
