package com.zobaze.mealsearch.hilt;

import com.zobaze.mealsearch.data.remote.QuoteDisplayAPI;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
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
public final class HIltModules_ProvideQuoteDisplayAPIFactory implements Factory<QuoteDisplayAPI> {
  @Override
  public QuoteDisplayAPI get() {
    return provideQuoteDisplayAPI();
  }

  public static HIltModules_ProvideQuoteDisplayAPIFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static QuoteDisplayAPI provideQuoteDisplayAPI() {
    return Preconditions.checkNotNullFromProvides(HIltModules.INSTANCE.provideQuoteDisplayAPI());
  }

  private static final class InstanceHolder {
    private static final HIltModules_ProvideQuoteDisplayAPIFactory INSTANCE = new HIltModules_ProvideQuoteDisplayAPIFactory();
  }
}
