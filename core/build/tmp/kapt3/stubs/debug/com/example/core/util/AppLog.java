package com.example.core.util;

import java.lang.System;

/**
 * Created by Sandeep Sankla
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\t\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\u000b\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\r\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/core/util/AppLog;", "", "()V", "TAG", "", "d", "", "debugText", "tag", "e", "errorText", "i", "infoText", "init", "core_debug"})
public final class AppLog {
    private final java.lang.String TAG = "Logs-";
    
    public final void init() {
    }
    
    public final void i(@org.jetbrains.annotations.Nullable()
    java.lang.String tag, @org.jetbrains.annotations.Nullable()
    java.lang.String infoText) {
    }
    
    public final void i(@org.jetbrains.annotations.Nullable()
    java.lang.String infoText) {
    }
    
    public final void d(@org.jetbrains.annotations.Nullable()
    java.lang.String tag, @org.jetbrains.annotations.Nullable()
    java.lang.String debugText) {
    }
    
    public final void d(@org.jetbrains.annotations.Nullable()
    java.lang.String debugText) {
    }
    
    public final void e(@org.jetbrains.annotations.Nullable()
    java.lang.String tag, @org.jetbrains.annotations.Nullable()
    java.lang.String errorText) {
    }
    
    public final void e(@org.jetbrains.annotations.Nullable()
    java.lang.String errorText) {
    }
    
    @javax.inject.Inject()
    public AppLog() {
        super();
    }
}