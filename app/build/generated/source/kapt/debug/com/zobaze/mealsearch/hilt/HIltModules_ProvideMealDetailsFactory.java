package com.zobaze.mealsearch.hilt;

import com.zobaze.mealsearch.data.remote.MealSearchAPI;
import com.zobaze.mealsearch.domain.repository.MealDetailsRepository;
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
public final class HIltModules_ProvideMealDetailsFactory implements Factory<MealDetailsRepository> {
  private final Provider<MealSearchAPI> searchMealSearchAPIProvider;

  public HIltModules_ProvideMealDetailsFactory(
      Provider<MealSearchAPI> searchMealSearchAPIProvider) {
    this.searchMealSearchAPIProvider = searchMealSearchAPIProvider;
  }

  @Override
  public MealDetailsRepository get() {
    return provideMealDetails(searchMealSearchAPIProvider.get());
  }

  public static HIltModules_ProvideMealDetailsFactory create(
      Provider<MealSearchAPI> searchMealSearchAPIProvider) {
    return new HIltModules_ProvideMealDetailsFactory(searchMealSearchAPIProvider);
  }

  public static MealDetailsRepository provideMealDetails(MealSearchAPI searchMealSearchAPI) {
    return Preconditions.checkNotNullFromProvides(HIltModules.INSTANCE.provideMealDetails(searchMealSearchAPI));
  }
}
