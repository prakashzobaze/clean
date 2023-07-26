package com.zobaze.mealsearch.presentation.meal_search;

import com.zobaze.mealsearch.domain.use_case.SearchMealsUseCase;
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
public final class MealSearchViewModel_Factory implements Factory<MealSearchViewModel> {
  private final Provider<SearchMealsUseCase> mealSearchMealsUseCaseProvider;

  public MealSearchViewModel_Factory(Provider<SearchMealsUseCase> mealSearchMealsUseCaseProvider) {
    this.mealSearchMealsUseCaseProvider = mealSearchMealsUseCaseProvider;
  }

  @Override
  public MealSearchViewModel get() {
    return newInstance(mealSearchMealsUseCaseProvider.get());
  }

  public static MealSearchViewModel_Factory create(
      Provider<SearchMealsUseCase> mealSearchMealsUseCaseProvider) {
    return new MealSearchViewModel_Factory(mealSearchMealsUseCaseProvider);
  }

  public static MealSearchViewModel newInstance(SearchMealsUseCase mealSearchMealsUseCase) {
    return new MealSearchViewModel(mealSearchMealsUseCase);
  }
}
