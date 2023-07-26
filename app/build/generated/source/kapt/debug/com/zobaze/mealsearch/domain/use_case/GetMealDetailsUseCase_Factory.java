package com.zobaze.mealsearch.domain.use_case;

import com.zobaze.mealsearch.domain.repository.MealDetailsRepository;
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
public final class GetMealDetailsUseCase_Factory implements Factory<GetMealDetailsUseCase> {
  private final Provider<MealDetailsRepository> repositoryProvider;

  public GetMealDetailsUseCase_Factory(Provider<MealDetailsRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetMealDetailsUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetMealDetailsUseCase_Factory create(
      Provider<MealDetailsRepository> repositoryProvider) {
    return new GetMealDetailsUseCase_Factory(repositoryProvider);
  }

  public static GetMealDetailsUseCase newInstance(MealDetailsRepository repository) {
    return new GetMealDetailsUseCase(repository);
  }
}
