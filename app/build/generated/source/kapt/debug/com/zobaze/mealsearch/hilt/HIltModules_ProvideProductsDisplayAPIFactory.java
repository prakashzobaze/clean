package com.zobaze.mealsearch.hilt;

import com.zobaze.mealsearch.data.remote.ProductDisplayAPI;
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
public final class HIltModules_ProvideProductsDisplayAPIFactory implements Factory<ProductDisplayAPI> {
  @Override
  public ProductDisplayAPI get() {
    return provideProductsDisplayAPI();
  }

  public static HIltModules_ProvideProductsDisplayAPIFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ProductDisplayAPI provideProductsDisplayAPI() {
    return Preconditions.checkNotNullFromProvides(HIltModules.INSTANCE.provideProductsDisplayAPI());
  }

  private static final class InstanceHolder {
    private static final HIltModules_ProvideProductsDisplayAPIFactory INSTANCE = new HIltModules_ProvideProductsDisplayAPIFactory();
  }
}
