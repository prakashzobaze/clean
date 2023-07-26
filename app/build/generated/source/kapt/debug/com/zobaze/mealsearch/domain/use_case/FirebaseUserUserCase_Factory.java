package com.zobaze.mealsearch.domain.use_case;

import com.zobaze.mealsearch.domain.repository.FirebaseDataSourceRepository;
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
public final class FirebaseUserUserCase_Factory implements Factory<FirebaseUserUserCase> {
  private final Provider<FirebaseDataSourceRepository> repositoryProvider;

  public FirebaseUserUserCase_Factory(Provider<FirebaseDataSourceRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public FirebaseUserUserCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static FirebaseUserUserCase_Factory create(
      Provider<FirebaseDataSourceRepository> repositoryProvider) {
    return new FirebaseUserUserCase_Factory(repositoryProvider);
  }

  public static FirebaseUserUserCase newInstance(FirebaseDataSourceRepository repository) {
    return new FirebaseUserUserCase(repository);
  }
}
