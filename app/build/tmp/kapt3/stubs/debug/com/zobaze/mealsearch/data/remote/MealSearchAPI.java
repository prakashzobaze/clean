package com.zobaze.mealsearch.data.remote;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00032\b\b\u0001\u0010\b\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/zobaze/mealsearch/data/remote/MealSearchAPI;", "", "getMealDetails", "Lcom/zobaze/mealsearch/data/model/MealsDTO;", "i", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSearchMealList", "query", "app_debug"})
public abstract interface MealSearchAPI {
    
    @retrofit2.http.GET(value = "api/json/v1/1/search.php")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getSearchMealList(@retrofit2.http.Query(value = "s")
    @org.jetbrains.annotations.NotNull
    java.lang.String query, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.zobaze.mealsearch.data.model.MealsDTO> $completion);
    
    @retrofit2.http.GET(value = "api/json/v1/1/lookup.php")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getMealDetails(@retrofit2.http.Query(value = "i")
    @org.jetbrains.annotations.NotNull
    java.lang.String i, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.zobaze.mealsearch.data.model.MealsDTO> $completion);
}