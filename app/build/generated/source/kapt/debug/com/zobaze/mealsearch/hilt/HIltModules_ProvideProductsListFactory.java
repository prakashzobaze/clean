package com.zobaze.mealsearch.hilt;

import com.zobaze.mealsearch.data.remote.ProductDisplayAPI;
import com.zobaze.mealsearch.domain.repository.ProductDisplayRepository;
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
public final class HIltModules_ProvideProductsListFactory implements Factory<ProductDisplayRepository> {
  private final Provider<ProductDisplayAPI> quoteDisplayAPIProvider;

  public HIltModules_ProvideProductsListFactory(
      Provider<ProductDisplayAPI> quoteDisplayAPIProvider) {
    this.quoteDisplayAPIProvider = quoteDisplayAPIProvider;
  }

  @Override
  public ProductDisplayRepository get() {
    return provideProductsList(quoteDisplayAPIProvider.get());
  }

  public static HIltModules_ProvideProductsListFactory create(
      Provider<ProductDisplayAPI> quoteDisplayAPIProvider) {
    return new HIltModules_ProvideProductsListFactory(quoteDisplayAPIProvider);
  }

  public static ProductDisplayRepository provideProductsList(ProductDisplayAPI quoteDisplayAPI) {
    return Preconditions.checkNotNullFromProvides(HIltModules.INSTANCE.provideProductsList(quoteDisplayAPI));
  }
}
