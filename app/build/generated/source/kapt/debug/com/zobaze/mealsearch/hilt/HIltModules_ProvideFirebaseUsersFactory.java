package com.zobaze.mealsearch.hilt;

import com.google.firebase.firestore.CollectionReference;
import com.zobaze.mealsearch.domain.repository.FirebaseDataSourceRepository;
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
public final class HIltModules_ProvideFirebaseUsersFactory implements Factory<FirebaseDataSourceRepository> {
  private final Provider<CollectionReference> usersRefProvider;

  public HIltModules_ProvideFirebaseUsersFactory(Provider<CollectionReference> usersRefProvider) {
    this.usersRefProvider = usersRefProvider;
  }

  @Override
  public FirebaseDataSourceRepository get() {
    return provideFirebaseUsers(usersRefProvider.get());
  }

  public static HIltModules_ProvideFirebaseUsersFactory create(
      Provider<CollectionReference> usersRefProvider) {
    return new HIltModules_ProvideFirebaseUsersFactory(usersRefProvider);
  }

  public static FirebaseDataSourceRepository provideFirebaseUsers(CollectionReference usersRef) {
    return Preconditions.checkNotNullFromProvides(HIltModules.INSTANCE.provideFirebaseUsers(usersRef));
  }
}
