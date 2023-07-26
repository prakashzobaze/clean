package com.zobaze.mealsearch.hilt;

import com.zobaze.mealsearch.data.remote.MealSearchAPI;
import com.zobaze.mealsearch.domain.repository.MealSearchRepository;
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
public final class HIltModules_ProvideMealSearchRepositoryFactory implements Factory<MealSearchRepository> {
  private final Provider<MealSearchAPI> mealSearchAPIProvider;

  public HIltModules_ProvideMealSearchRepositoryFactory(
      Provider<MealSearchAPI> mealSearchAPIProvider) {
    this.mealSearchAPIProvider = mealSearchAPIProvider;
  }

  @Override
  public MealSearchRepository get() {
    return provideMealSearchRepository(mealSearchAPIProvider.get());
  }

  public static HIltModules_ProvideMealSearchRepositoryFactory create(
      Provider<MealSearchAPI> mealSearchAPIProvider) {
    return new HIltModules_ProvideMealSearchRepositoryFactory(mealSearchAPIProvider);
  }

  public static MealSearchRepository provideMealSearchRepository(MealSearchAPI mealSearchAPI) {
    return Preconditions.checkNotNullFromProvides(HIltModules.INSTANCE.provideMealSearchRepository(mealSearchAPI));
  }
}
