package com.example.core.base;

import java.lang.System;

/**
 * Created by Sandeep Sankla
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\nH&J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0011H&J\u0014\u0010\u0015\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lcom/example/core/base/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "applog", "Lcom/example/core/util/AppLog;", "getApplog", "()Lcom/example/core/util/AppLog;", "setApplog", "(Lcom/example/core/util/AppLog;)V", "binding", "Landroidx/viewbinding/ViewBinding;", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "setBinding", "(Landroidx/viewbinding/ViewBinding;)V", "initViewBinding", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setUpObserver", "showErrorMessage", "message", "Lcom/example/core/util/SingleEvent;", "", "core_debug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    protected androidx.viewbinding.ViewBinding binding;
    @javax.inject.Inject()
    public com.example.core.util.AppLog applog;
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.viewbinding.ViewBinding getBinding() {
        return null;
    }
    
    protected final void setBinding(@org.jetbrains.annotations.NotNull()
    androidx.viewbinding.ViewBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.core.util.AppLog getApplog() {
        return null;
    }
    
    public final void setApplog(@org.jetbrains.annotations.NotNull()
    com.example.core.util.AppLog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.viewbinding.ViewBinding initViewBinding();
    
    public abstract void setUpObserver();
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void showErrorMessage(@org.jetbrains.annotations.NotNull()
    com.example.core.util.SingleEvent<? extends java.lang.Object> message) {
    }
    
    public BaseActivity() {
        super();
    }
}