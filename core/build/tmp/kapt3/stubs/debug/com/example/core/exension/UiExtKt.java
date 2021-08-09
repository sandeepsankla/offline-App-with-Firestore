package com.example.core.exension;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 2, d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0006\u001a.\u0010\t\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u0011\u001a\n\u0010\u0012\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\u0013\u001a\u00020\u0001*\u00020\u0006\u001a\u001a\u0010\u0014\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011\u001a.\u0010\u0016\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u0011\u00a8\u0006\u0018"}, d2 = {"afterTextChanged", "", "Landroid/widget/EditText;", "Lkotlin/Function1;", "", "hide", "Landroid/view/View;", "hideKeyboard", "inVisible", "setupSnackbar", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "snackbarEvent", "Landroidx/lifecycle/LiveData;", "Lcom/example/core/util/SingleEvent;", "", "timeLength", "", "show", "showKeyboard", "showSnackbar", "snackbarText", "showToast", "ToastEvent", "core_debug"})
public final class UiExtKt {
    
    /**
     * Created by Sandeep Sankla
     */
    public static final void showKeyboard(@org.jetbrains.annotations.NotNull()
    android.view.View $this$showKeyboard) {
    }
    
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.view.View $this$hideKeyboard) {
    }
    
    public static final void show(@org.jetbrains.annotations.NotNull()
    android.view.View $this$show) {
    }
    
    public static final void hide(@org.jetbrains.annotations.NotNull()
    android.view.View $this$hide) {
    }
    
    public static final void inVisible(@org.jetbrains.annotations.NotNull()
    android.view.View $this$inVisible) {
    }
    
    /**
     * Transforms static java function Snackbar.make() to an extension function on View.
     */
    public static final void showSnackbar(@org.jetbrains.annotations.NotNull()
    android.view.View $this$showSnackbar, @org.jetbrains.annotations.NotNull()
    java.lang.String snackbarText, int timeLength) {
    }
    
    /**
     * Triggers a snackbar message when the value contained by snackbarTaskMessageLiveEvent is modified.
     */
    public static final void setupSnackbar(@org.jetbrains.annotations.NotNull()
    android.view.View $this$setupSnackbar, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.example.core.util.SingleEvent<java.lang.Object>> snackbarEvent, int timeLength) {
    }
    
    public static final void showToast(@org.jetbrains.annotations.NotNull()
    android.view.View $this$showToast, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.example.core.util.SingleEvent<java.lang.Object>> ToastEvent, int timeLength) {
    }
    
    /**
     * Extension function to simplify setting an afterTextChanged action to EditText components.
     */
    public static final void afterTextChanged(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$afterTextChanged, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> afterTextChanged) {
    }
}