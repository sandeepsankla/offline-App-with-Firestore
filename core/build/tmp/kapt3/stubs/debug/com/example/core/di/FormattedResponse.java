package com.example.core.di;

import java.lang.System;

/**
 * Created by Sandeep Sankla
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J;\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\r0\f\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J1\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\r0\f\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015JG\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\r0\f\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J1\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\r0\f\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J<\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\r0\f\"\u0004\b\u0000\u0010\r2\u0014\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\r0\u001c\u0018\u00010\u001b2\u0010\b\u0002\u0010\u001d\u001a\n\u0018\u00010\u001ej\u0004\u0018\u0001`\u001fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006 "}, d2 = {"Lcom/example/core/di/FormattedResponse;", "", "apiInterface", "Lcom/example/core/di/ApiInterface;", "(Lcom/example/core/di/ApiInterface;)V", "appLog", "Lcom/example/core/util/AppLog;", "getAppLog", "()Lcom/example/core/util/AppLog;", "setAppLog", "(Lcom/example/core/util/AppLog;)V", "GetCall", "Lcom/example/core/util/Resource;", "T", "apiUrl", "", "queryMap", "", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PatchCall", "payload", "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PostCall", "(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PutCall", "getResult", "result", "Lretrofit2/Response;", "Lcom/example/core/util/GenericApiResponse;", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "core_debug"})
public final class FormattedResponse {
    @javax.inject.Inject()
    public com.example.core.util.AppLog appLog;
    private final com.example.core.di.ApiInterface apiInterface = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.core.util.AppLog getAppLog() {
        return null;
    }
    
    public final void setAppLog(@org.jetbrains.annotations.NotNull()
    com.example.core.util.AppLog p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final <T extends java.lang.Object>java.lang.Object GetCall(@org.jetbrains.annotations.NotNull()
    java.lang.String apiUrl, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, ? extends java.lang.Object> queryMap, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.core.util.Resource<? extends T>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final <T extends java.lang.Object>java.lang.Object PostCall(@org.jetbrains.annotations.NotNull()
    java.lang.String apiUrl, @org.jetbrains.annotations.Nullable()
    java.lang.Object payload, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, ? extends java.lang.Object> queryMap, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.core.util.Resource<? extends T>> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final <T extends java.lang.Object>java.lang.Object PutCall(@org.jetbrains.annotations.NotNull()
    java.lang.String apiUrl, @org.jetbrains.annotations.Nullable()
    java.lang.Object payload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.core.util.Resource<? extends T>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final <T extends java.lang.Object>java.lang.Object PatchCall(@org.jetbrains.annotations.NotNull()
    java.lang.String apiUrl, @org.jetbrains.annotations.Nullable()
    java.lang.Object payload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.core.util.Resource<? extends T>> p2) {
        return null;
    }
    
    private final <T extends java.lang.Object>com.example.core.util.Resource<T> getResult(retrofit2.Response<com.example.core.util.GenericApiResponse<T>> result, java.lang.Exception e) {
        return null;
    }
    
    @javax.inject.Inject()
    public FormattedResponse(@org.jetbrains.annotations.NotNull()
    com.example.core.di.ApiInterface apiInterface) {
        super();
    }
}