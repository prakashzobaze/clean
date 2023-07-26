package com.zobaze.mealsearch.presentation.meal_search;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\fJ\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000fH\u0016J\u0014\u0010\u0019\u001a\u00020\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/zobaze/mealsearch/presentation/meal_search/MealSearchAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/zobaze/mealsearch/presentation/meal_search/MealSearchAdapter$MyViewHolder;", "()V", "list", "", "Lcom/zobaze/mealsearch/domain/model/Meal;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "listener", "Lkotlin/Function1;", "", "getItemCount", "", "itemClickListener", "l", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setContentList", "MyViewHolder", "app_debug"})
public final class MealSearchAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.zobaze.mealsearch.presentation.meal_search.MealSearchAdapter.MyViewHolder> {
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function1<? super com.zobaze.mealsearch.domain.model.Meal, kotlin.Unit> listener;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.zobaze.mealsearch.domain.model.Meal> list;
    
    public MealSearchAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.zobaze.mealsearch.domain.model.Meal> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull
    java.util.List<com.zobaze.mealsearch.domain.model.Meal> p0) {
    }
    
    public final void setContentList(@org.jetbrains.annotations.NotNull
    java.util.List<com.zobaze.mealsearch.domain.model.Meal> list) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.zobaze.mealsearch.presentation.meal_search.MealSearchAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public final void itemClickListener(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.zobaze.mealsearch.domain.model.Meal, kotlin.Unit> l) {
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.zobaze.mealsearch.presentation.meal_search.MealSearchAdapter.MyViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/zobaze/mealsearch/presentation/meal_search/MealSearchAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewHolder", "Lcom/zobaze/mealsearch/databinding/ViewHolderSearchListBinding;", "(Lcom/zobaze/mealsearch/databinding/ViewHolderSearchListBinding;)V", "getViewHolder", "()Lcom/zobaze/mealsearch/databinding/ViewHolderSearchListBinding;", "app_debug"})
    public static final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.zobaze.mealsearch.databinding.ViewHolderSearchListBinding viewHolder = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull
        com.zobaze.mealsearch.databinding.ViewHolderSearchListBinding viewHolder) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.zobaze.mealsearch.databinding.ViewHolderSearchListBinding getViewHolder() {
            return null;
        }
    }
}