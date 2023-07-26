package com.zobaze.mealsearch.databinding;
import com.zobaze.mealsearch.R;
import com.zobaze.mealsearch.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemProductBindingImpl extends ItemProductBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 3);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemProductBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemProductBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.view.View) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textViewAuthor.setTag(null);
        this.textViewQuote.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.quote == variableId) {
            setQuote((com.zobaze.mealsearch.domain.model.Product) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setQuote(@Nullable com.zobaze.mealsearch.domain.model.Product Quote) {
        this.mQuote = Quote;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.quote);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.zobaze.mealsearch.domain.model.Product quote = mQuote;
        java.lang.String quoteDescription = null;
        java.lang.String quoteTitle = null;
        java.lang.String javaLangStringQuoteDescription = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (quote != null) {
                    // read quote.description
                    quoteDescription = quote.getDescription();
                    // read quote.title
                    quoteTitle = quote.getTitle();
                }


                // read ("- ") + (quote.description)
                javaLangStringQuoteDescription = ("- ") + (quoteDescription);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewAuthor, javaLangStringQuoteDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewQuote, quoteTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): quote
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}