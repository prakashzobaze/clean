package com.zobaze.mealsearch.presentation.meal_details;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/zobaze/mealsearch/presentation/meal_details/MealDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "mealDetailsUseCase", "Lcom/zobaze/mealsearch/domain/use_case/GetMealDetailsUseCase;", "(Lcom/zobaze/mealsearch/domain/use_case/GetMealDetailsUseCase;)V", "_mealDetails", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zobaze/mealsearch/presentation/meal_details/MealDetailsState;", "mealDetails", "Lkotlinx/coroutines/flow/StateFlow;", "getMealDetails", "()Lkotlinx/coroutines/flow/StateFlow;", "", "id", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class MealDetailsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.zobaze.mealsearch.domain.use_case.GetMealDetailsUseCase mealDetailsUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.zobaze.mealsearch.presentation.meal_details.MealDetailsState> _mealDetails = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.zobaze.mealsearch.presentation.meal_details.MealDetailsState> mealDetails = null;
    
    @javax.inject.Inject
    public MealDetailsViewModel(@org.jetbrains.annotations.NotNull
    com.zobaze.mealsearch.domain.use_case.GetMealDetailsUseCase mealDetailsUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.zobaze.mealsearch.presentation.meal_details.MealDetailsState> getMealDetails() {
        return null;
    }
    
    public final void getMealDetails(@org.jetbrains.annotations.NotNull
    java.lang.String id) {
    }
}