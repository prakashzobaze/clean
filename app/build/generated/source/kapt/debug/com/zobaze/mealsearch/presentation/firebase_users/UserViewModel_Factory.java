package com.zobaze.mealsearch.presentation.firebase_users;

import com.zobaze.mealsearch.domain.use_case.FirebaseUserUserCase;
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
public final class UserViewModel_Factory implements Factory<UserViewModel> {
  private final Provider<FirebaseUserUserCase> firebaseUserUserCaseProvider;

  public UserViewModel_Factory(Provider<FirebaseUserUserCase> firebaseUserUserCaseProvider) {
    this.firebaseUserUserCaseProvider = firebaseUserUserCaseProvider;
  }

  @Override
  public UserViewModel get() {
    return newInstance(firebaseUserUserCaseProvider.get());
  }

  public static UserViewModel_Factory create(
      Provider<FirebaseUserUserCase> firebaseUserUserCaseProvider) {
    return new UserViewModel_Factory(firebaseUserUserCaseProvider);
  }

  public static UserViewModel newInstance(FirebaseUserUserCase firebaseUserUserCase) {
    return new UserViewModel(firebaseUserUserCase);
  }
}
