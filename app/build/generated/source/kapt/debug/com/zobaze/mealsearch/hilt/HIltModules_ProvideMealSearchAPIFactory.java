package com.zobaze.mealsearch.hilt;

import com.zobaze.mealsearch.data.remote.MealSearchAPI;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
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
public final class HIltModules_ProvideMealSearchAPIFactory implements Factory<MealSearchAPI> {
  @Override
  public MealSearchAPI get() {
    return provideMealSearchAPI();
  }

  public static HIltModules_ProvideMealSearchAPIFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static MealSearchAPI provideMealSearchAPI() {
    return Preconditions.checkNotNullFromProvides(HIltModules.INSTANCE.provideMealSearchAPI());
  }

  private static final class InstanceHolder {
    private static final HIltModules_ProvideMealSearchAPIFactory INSTANCE = new HIltModules_ProvideMealSearchAPIFactory();
  }
}
