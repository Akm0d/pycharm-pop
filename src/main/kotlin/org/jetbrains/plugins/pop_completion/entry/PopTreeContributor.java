package org.jetbrains.plugins.pop_completion.entry;

import com.intellij.codeInsight.completion.CompletionContributor;
import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionResultSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.lang.PopTree;

/**
 * Provides completion based on information returned by "pop-tree" in the current interpreter's context
 */
public class PopTreeContributor extends CompletionContributor
{
    @Override
    public void fillCompletionVariants(@NotNull CompletionParameters parameters, @NotNull CompletionResultSet result) {
        PopTree hub = new PopTree();
        // TODO add completion results based on pop-tree matching with the current parameters
        super.fillCompletionVariants(parameters, result);
    }

}
