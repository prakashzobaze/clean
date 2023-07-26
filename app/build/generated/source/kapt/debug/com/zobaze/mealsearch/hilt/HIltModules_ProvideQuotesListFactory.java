package com.zobaze.mealsearch.hilt;

import com.zobaze.mealsearch.data.remote.QuoteDisplayAPI;
import com.zobaze.mealsearch.domain.repository.QuoteDisplayRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class HIltModules_ProvideQuotesListFactory implements Factory<QuoteDisplayRepository> {
  private final Provider<QuoteDisplayAPI> quoteDisplayAPIProvider;

  public HIltModules_ProvideQuotesListFactory(Provider<QuoteDisplayAPI> quoteDisplayAPIProvider) {
    this.quoteDisplayAPIProvider = quoteDisplayAPIProvider;
  }

  @Override
  public QuoteDisplayRepository get() {
    return provideQuotesList(quoteDisplayAPIProvider.get());
  }

  public static HIltModules_ProvideQuotesListFactory create(
      Provider<QuoteDisplayAPI> quoteDisplayAPIProvider) {
    return new HIltModules_ProvideQuotesListFactory(quoteDisplayAPIProvider);
  }

  public static QuoteDisplayRepository provideQuotesList(QuoteDisplayAPI quoteDisplayAPI) {
    return Preconditions.checkNotNullFromProvides(HIltModules.INSTANCE.provideQuotesList(quoteDisplayAPI));
  }
}
