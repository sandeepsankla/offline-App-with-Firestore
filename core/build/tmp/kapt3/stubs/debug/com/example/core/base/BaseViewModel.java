package com.example.core.base;

import java.lang.System;

/**
 * Created by Sandeep Sankla
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/core/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "applog", "Lcom/example/core/util/AppLog;", "getApplog", "()Lcom/example/core/util/AppLog;", "setApplog", "(Lcom/example/core/util/AppLog;)V", "showSnackBar", "Landroidx/lifecycle/LiveData;", "Lcom/example/core/util/SingleEvent;", "", "getShowSnackBar", "()Landroidx/lifecycle/LiveData;", "showSnackBarPrivate", "Landroidx/lifecycle/MutableLiveData;", "showToast", "getShowToast", "showToastPrivate", "showSnackBarMessage", "", "errorMessage", "", "showToastMessage", "core_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    @javax.inject.Inject()
    public com.example.core.util.AppLog applog;
    private final androidx.lifecycle.MutableLiveData<com.example.core.util.SingleEvent<java.lang.Object>> showSnackBarPrivate = null;
    private final androidx.lifecycle.MutableLiveData<com.example.core.util.SingleEvent<java.lang.Object>> showToastPrivate = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.core.util.AppLog getApplog() {
        return null;
    }
    
    public final void setApplog(@org.jetbrains.annotations.NotNull()
    com.example.core.util.AppLog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.core.util.SingleEvent<java.lang.Object>> getShowSnackBar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.core.util.SingleEvent<java.lang.Object>> getShowToast() {
        return null;
    }
    
    public final void showToastMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
    }
    
    public final void showSnackBarMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
    }
    
    public BaseViewModel() {
        super();
    }
}