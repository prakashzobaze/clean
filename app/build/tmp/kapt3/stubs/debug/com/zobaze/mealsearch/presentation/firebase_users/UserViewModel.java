package com.zobaze.mealsearch.presentation.firebase_users;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Lcom/zobaze/mealsearch/presentation/firebase_users/UserViewModel;", "Landroidx/lifecycle/ViewModel;", "firebaseUserUserCase", "Lcom/zobaze/mealsearch/domain/use_case/FirebaseUserUserCase;", "(Lcom/zobaze/mealsearch/domain/use_case/FirebaseUserUserCase;)V", "_usersList", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zobaze/mealsearch/presentation/firebase_users/UserDetailState;", "usersList", "Lkotlinx/coroutines/flow/StateFlow;", "getUsersList", "()Lkotlinx/coroutines/flow/StateFlow;", "getQuotesList", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class UserViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.zobaze.mealsearch.domain.use_case.FirebaseUserUserCase firebaseUserUserCase = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.zobaze.mealsearch.presentation.firebase_users.UserDetailState> _usersList = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.zobaze.mealsearch.presentation.firebase_users.UserDetailState> usersList = null;
    
    @javax.inject.Inject
    public UserViewModel(@org.jetbrains.annotations.NotNull
    com.zobaze.mealsearch.domain.use_case.FirebaseUserUserCase firebaseUserUserCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.zobaze.mealsearch.presentation.firebase_users.UserDetailState> getUsersList() {
        return null;
    }
    
    private final void getQuotesList() {
    }
}