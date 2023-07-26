package com.zobaze.mealsearch.presentation.products;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016R4\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/zobaze/mealsearch/presentation/products/ProductsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/zobaze/mealsearch/presentation/products/ProductsAdapter$QuoteViewHolder;", "()V", "value", "", "Lcom/zobaze/mealsearch/domain/model/Product;", "products", "getProducts", "()Ljava/util/List;", "setProducts", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "QuoteViewHolder", "app_debug"})
public final class ProductsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.zobaze.mealsearch.presentation.products.ProductsAdapter.QuoteViewHolder> {
    @org.jetbrains.annotations.Nullable
    private java.util.List<com.zobaze.mealsearch.domain.model.Product> products;
    
    public ProductsAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.zobaze.mealsearch.domain.model.Product> getProducts() {
        return null;
    }
    
    public final void setProducts(@org.jetbrains.annotations.Nullable
    java.util.List<com.zobaze.mealsearch.domain.model.Product> value) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.zobaze.mealsearch.presentation.products.ProductsAdapter.QuoteViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.zobaze.mealsearch.presentation.products.ProductsAdapter.QuoteViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/zobaze/mealsearch/presentation/products/ProductsAdapter$QuoteViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/zobaze/mealsearch/databinding/ItemProductBinding;", "(Lcom/zobaze/mealsearch/presentation/products/ProductsAdapter;Lcom/zobaze/mealsearch/databinding/ItemProductBinding;)V", "getBinding", "()Lcom/zobaze/mealsearch/databinding/ItemProductBinding;", "app_debug"})
    public final class QuoteViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.zobaze.mealsearch.databinding.ItemProductBinding binding = null;
        
        public QuoteViewHolder(@org.jetbrains.annotations.NotNull
        com.zobaze.mealsearch.databinding.ItemProductBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.zobaze.mealsearch.databinding.ItemProductBinding getBinding() {
            return null;
        }
    }
}