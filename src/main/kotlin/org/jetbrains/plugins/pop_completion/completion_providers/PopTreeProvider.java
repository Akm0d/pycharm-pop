package org.jetbrains.plugins.pop_completion.completion_providers;

import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionProvider;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;


public class PopTreeProvider extends CompletionProvider<CompletionParameters>
{
    protected void addCompletions(
            @NotNull CompletionParameters parameters,
            ProcessingContext processingContext,
            @NotNull CompletionResultSet result
    ) {

        Set<String> suggested = new HashSet<>();

        result.runRemainingContributors(parameters, otherSourceResult -> {
            // remove dupe built-in suggestions
            LookupElement lookup = otherSourceResult.getLookupElement();
            if (!suggested.contains(lookup.getLookupString())) {
                result.addElement(lookup);
            }
        });
    }
}