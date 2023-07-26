package com.zobaze.mealsearch.domain.use_case;

import com.zobaze.mealsearch.domain.repository.ProductDisplayRepository;
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
public final class ProductsDisplayUseCase_Factory implements Factory<ProductsDisplayUseCase> {
  private final Provider<ProductDisplayRepository> repositoryProvider;

  public ProductsDisplayUseCase_Factory(Provider<ProductDisplayRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public ProductsDisplayUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static ProductsDisplayUseCase_Factory create(
      Provider<ProductDisplayRepository> repositoryProvider) {
    return new ProductsDisplayUseCase_Factory(repositoryProvider);
  }

  public static ProductsDisplayUseCase newInstance(ProductDisplayRepository repository) {
    return new ProductsDisplayUseCase(repository);
  }
}
