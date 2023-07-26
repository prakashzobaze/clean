package com.zobaze.mealsearch.domain.use_case;

import com.zobaze.mealsearch.domain.repository.MealSearchRepository;
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
public final class SearchMealsUseCase_Factory implements Factory<SearchMealsUseCase> {
  private final Provider<MealSearchRepository> repositoryProvider;

  public SearchMealsUseCase_Factory(Provider<MealSearchRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public SearchMealsUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static SearchMealsUseCase_Factory create(
      Provider<MealSearchRepository> repositoryProvider) {
    return new SearchMealsUseCase_Factory(repositoryProvider);
  }

  public static SearchMealsUseCase newInstance(MealSearchRepository repository) {
    return new SearchMealsUseCase(repository);
  }
}
