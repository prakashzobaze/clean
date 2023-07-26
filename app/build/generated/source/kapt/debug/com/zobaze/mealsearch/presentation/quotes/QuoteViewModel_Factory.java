package com.zobaze.mealsearch.presentation.quotes;

import com.zobaze.mealsearch.domain.use_case.QuotesDisplayUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class QuoteViewModel_Factory implements Factory<QuoteViewModel> {
  private final Provider<QuotesDisplayUseCase> quotesDisplayUseCaseProvider;

  public QuoteViewModel_Factory(Provider<QuotesDisplayUseCase> quotesDisplayUseCaseProvider) {
    this.quotesDisplayUseCaseProvider = quotesDisplayUseCaseProvider;
  }

  @Override
  public QuoteViewModel get() {
    return newInstance(quotesDisplayUseCaseProvider.get());
  }

  public static QuoteViewModel_Factory create(
      Provider<QuotesDisplayUseCase> quotesDisplayUseCaseProvider) {
    return new QuoteViewModel_Factory(quotesDisplayUseCaseProvider);
  }

  public static QuoteViewModel newInstance(QuotesDisplayUseCase quotesDisplayUseCase) {
    return new QuoteViewModel(quotesDisplayUseCase);
  }
}
