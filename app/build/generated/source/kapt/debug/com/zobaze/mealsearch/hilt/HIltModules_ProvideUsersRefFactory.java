package com.zobaze.mealsearch.hilt;

import com.google.firebase.firestore.CollectionReference;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class HIltModules_ProvideUsersRefFactory implements Factory<CollectionReference> {
  @Override
  public CollectionReference get() {
    return provideUsersRef();
  }

  public static HIltModules_ProvideUsersRefFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CollectionReference provideUsersRef() {
    return Preconditions.checkNotNullFromProvides(HIltModules.INSTANCE.provideUsersRef());
  }

  private static final class InstanceHolder {
    private static final HIltModules_ProvideUsersRefFactory INSTANCE = new HIltModules_ProvideUsersRefFactory();
  }
}
