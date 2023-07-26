// Generated by data binding compiler. Do not edit!
package com.zobaze.mealsearch.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zobaze.mealsearch.R;
import com.zobaze.mealsearch.domain.model.User;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemUserBinding extends ViewDataBinding {
  @NonNull
  public final TextView textViewAuthor;

  @NonNull
  public final TextView textViewQuote;

  @NonNull
  public final View view;

  @Bindable
  protected User mQuote;

  protected ItemUserBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView textViewAuthor, TextView textViewQuote, View view) {
    super(_bindingComponent, _root, _localFieldCount);
    this.textViewAuthor = textViewAuthor;
    this.textViewQuote = textViewQuote;
    this.view = view;
  }

  public abstract void setQuote(@Nullable User quote);

  @Nullable
  public User getQuote() {
    return mQuote;
  }

  @NonNull
  public static ItemUserBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_user, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemUserBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemUserBinding>inflateInternal(inflater, R.layout.item_user, root, attachToRoot, component);
  }

  @NonNull
  public static ItemUserBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_user, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemUserBinding>inflateInternal(inflater, R.layout.item_user, null, false, component);
  }

  public static ItemUserBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemUserBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemUserBinding)bind(component, view, R.layout.item_user);
  }
}