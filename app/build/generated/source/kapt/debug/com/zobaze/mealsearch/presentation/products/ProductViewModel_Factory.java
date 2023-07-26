package com.zobaze.mealsearch.presentation.products;

import com.zobaze.mealsearch.domain.use_case.ProductsDisplayUseCase;
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
public final class ProductViewModel_Factory implements Factory<ProductViewModel> {
  private final Provider<ProductsDisplayUseCase> productsDisplayUseCaseProvider;

  public ProductViewModel_Factory(Provider<ProductsDisplayUseCase> productsDisplayUseCaseProvider) {
    this.productsDisplayUseCaseProvider = productsDisplayUseCaseProvider;
  }

  @Override
  public ProductViewModel get() {
    return newInstance(productsDisplayUseCaseProvider.get());
  }

  public static ProductViewModel_Factory create(
      Provider<ProductsDisplayUseCase> productsDisplayUseCaseProvider) {
    return new ProductViewModel_Factory(productsDisplayUseCaseProvider);
  }

  public static ProductViewModel newInstance(ProductsDisplayUseCase productsDisplayUseCase) {
    return new ProductViewModel(productsDisplayUseCase);
  }
}
