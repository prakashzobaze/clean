package com.zobaze.mealsearch.domain.use_case;

import com.zobaze.mealsearch.domain.repository.QuoteDisplayRepository;
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
public final class QuotesDisplayUseCase_Factory implements Factory<QuotesDisplayUseCase> {
  private final Provider<QuoteDisplayRepository> repositoryProvider;

  public QuotesDisplayUseCase_Factory(Provider<QuoteDisplayRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public QuotesDisplayUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static QuotesDisplayUseCase_Factory create(
      Provider<QuoteDisplayRepository> repositoryProvider) {
    return new QuotesDisplayUseCase_Factory(repositoryProvider);
  }

  public static QuotesDisplayUseCase newInstance(QuoteDisplayRepository repository) {
    return new QuotesDisplayUseCase(repository);
  }
}
