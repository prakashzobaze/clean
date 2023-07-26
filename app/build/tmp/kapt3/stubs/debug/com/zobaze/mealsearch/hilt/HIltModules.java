package com.zobaze.mealsearch.hilt;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nH\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0007J\b\u0010\u0014\u001a\u00020\u0006H\u0007\u00a8\u0006\u0015"}, d2 = {"Lcom/zobaze/mealsearch/hilt/HIltModules;", "", "()V", "provideFirebaseUsers", "Lcom/zobaze/mealsearch/domain/repository/FirebaseDataSourceRepository;", "usersRef", "Lcom/google/firebase/firestore/CollectionReference;", "provideMealDetails", "Lcom/zobaze/mealsearch/domain/repository/MealDetailsRepository;", "searchMealSearchAPI", "Lcom/zobaze/mealsearch/data/remote/MealSearchAPI;", "provideMealSearchAPI", "provideMealSearchRepository", "Lcom/zobaze/mealsearch/domain/repository/MealSearchRepository;", "mealSearchAPI", "provideProductsDisplayAPI", "Lcom/zobaze/mealsearch/data/remote/ProductDisplayAPI;", "provideProductsList", "Lcom/zobaze/mealsearch/domain/repository/ProductDisplayRepository;", "quoteDisplayAPI", "provideUsersRef", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class HIltModules {
    @org.jetbrains.annotations.NotNull
    public static final com.zobaze.mealsearch.hilt.HIltModules INSTANCE = null;
    
    private HIltModules() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.zobaze.mealsearch.data.remote.MealSearchAPI provideMealSearchAPI() {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.zobaze.mealsearch.domain.repository.MealSearchRepository provideMealSearchRepository(@org.jetbrains.annotations.NotNull
    com.zobaze.mealsearch.data.remote.MealSearchAPI mealSearchAPI) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.zobaze.mealsearch.domain.repository.MealDetailsRepository provideMealDetails(@org.jetbrains.annotations.NotNull
    com.zobaze.mealsearch.data.remote.MealSearchAPI searchMealSearchAPI) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.zobaze.mealsearch.data.remote.ProductDisplayAPI provideProductsDisplayAPI() {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.zobaze.mealsearch.domain.repository.ProductDisplayRepository provideProductsList(@org.jetbrains.annotations.NotNull
    com.zobaze.mealsearch.data.remote.ProductDisplayAPI quoteDisplayAPI) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.google.firebase.firestore.CollectionReference provideUsersRef() {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.zobaze.mealsearch.domain.repository.FirebaseDataSourceRepository provideFirebaseUsers(@org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.CollectionReference usersRef) {
        return null;
    }
}