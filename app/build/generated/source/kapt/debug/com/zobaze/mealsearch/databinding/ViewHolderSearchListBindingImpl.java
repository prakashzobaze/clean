package com.zobaze.mealsearch.databinding;
import com.zobaze.mealsearch.R;
import com.zobaze.mealsearch.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ViewHolderSearchListBindingImpl extends ViewHolderSearchListBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.appcompat.widget.LinearLayoutCompat mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ViewHolderSearchListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ViewHolderSearchListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (androidx.appcompat.widget.LinearLayoutCompat) bindings[0];
        this.mboundView0.setTag(null);
        this.viewHolderImage.setTag(null);
        this.viewHolderItemName.setTag(null);
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
        if (BR.meal == variableId) {
            setMeal((com.zobaze.mealsearch.domain.model.Meal) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMeal(@Nullable com.zobaze.mealsearch.domain.model.Meal Meal) {
        this.mMeal = Meal;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.meal);
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
        java.lang.String mealImage = null;
        com.zobaze.mealsearch.domain.model.Meal meal = mMeal;
        java.lang.String mealName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (meal != null) {
                    // read meal.image
                    mealImage = meal.getImage();
                    // read meal.name
                    mealName = meal.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.zobaze.mealsearch.common.BindingAdaptersKt.urlToImage(this.viewHolderImage, mealImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.viewHolderItemName, mealName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): meal
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}