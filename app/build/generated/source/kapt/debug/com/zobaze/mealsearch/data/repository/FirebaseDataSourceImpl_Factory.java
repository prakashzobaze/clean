package com.zobaze.mealsearch.data.repository;

import com.google.firebase.firestore.CollectionReference;
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
public final class FirebaseDataSourceImpl_Factory implements Factory<FirebaseDataSourceImpl> {
  private final Provider<CollectionReference> usersRefProvider;

  public FirebaseDataSourceImpl_Factory(Provider<CollectionReference> usersRefProvider) {
    this.usersRefProvider = usersRefProvider;
  }

  @Override
  public FirebaseDataSourceImpl get() {
    return newInstance(usersRefProvider.get());
  }

  public static FirebaseDataSourceImpl_Factory create(
      Provider<CollectionReference> usersRefProvider) {
    return new FirebaseDataSourceImpl_Factory(usersRefProvider);
  }

  public static FirebaseDataSourceImpl newInstance(CollectionReference usersRef) {
    return new FirebaseDataSourceImpl(usersRef);
  }
}
