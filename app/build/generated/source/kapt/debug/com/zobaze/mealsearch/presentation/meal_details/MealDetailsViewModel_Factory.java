package com.zobaze.mealsearch.presentation.meal_details;

import com.zobaze.mealsearch.domain.use_case.GetMealDetailsUseCase;
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
public final class MealDetailsViewModel_Factory implements Factory<MealDetailsViewModel> {
  private final Provider<GetMealDetailsUseCase> mealDetailsUseCaseProvider;

  public MealDetailsViewModel_Factory(Provider<GetMealDetailsUseCase> mealDetailsUseCaseProvider) {
    this.mealDetailsUseCaseProvider = mealDetailsUseCaseProvider;
  }

  @Override
  public MealDetailsViewModel get() {
    return newInstance(mealDetailsUseCaseProvider.get());
  }

  public static MealDetailsViewModel_Factory create(
      Provider<GetMealDetailsUseCase> mealDetailsUseCaseProvider) {
    return new MealDetailsViewModel_Factory(mealDetailsUseCaseProvider);
  }

  public static MealDetailsViewModel newInstance(GetMealDetailsUseCase mealDetailsUseCase) {
    return new MealDetailsViewModel(mealDetailsUseCase);
  }
}
