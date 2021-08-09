package com.example.core.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J-\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00040\u0003\"\u0004\b\u0000\u0010\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJJ\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00040\u0003\"\u0004\b\u0000\u0010\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u001b\b\u0003\u0010\n\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\t\u0012\u00070\u0001\u00a2\u0006\u0002\b\f\u0018\u00010\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ9\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00040\u0003\"\u0004\b\u0000\u0010\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J9\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00040\u0003\"\u0004\b\u0000\u0010\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014JV\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00040\u0003\"\u0004\b\u0000\u0010\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u001b\b\u0003\u0010\u0016\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\t\u0012\u00070\u0001\u00a2\u0006\u0002\b\f\u0018\u00010\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J9\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00040\u0003\"\u0004\b\u0000\u0010\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/example/core/di/ApiInterface;", "", "delete", "Lretrofit2/Response;", "Lcom/example/core/util/GenericApiResponse;", "T", "endPoint", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "queryParams", "", "Lkotlin/jvm/JvmSuppressWildcards;", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "multipart", "file", "Lokhttp3/MultipartBody$Part;", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "patch", "payload", "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "post", "queryMap", "(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "put", "core_debug"})
public abstract interface ApiInterface {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET()
    public abstract <T extends java.lang.Object>java.lang.Object get(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Url()
    java.lang.String endPoint, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.QueryMap(encoded = true)
    java.util.Map<java.lang.String, java.lang.Object> queryParams, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.core.util.GenericApiResponse<T>>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST()
    public abstract <T extends java.lang.Object>java.lang.Object post(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Url()
    java.lang.String endPoint, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Body()
    java.lang.Object payload, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.QueryMap()
    java.util.Map<java.lang.String, java.lang.Object> queryMap, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.core.util.GenericApiResponse<T>>> p3);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.PUT()
    public abstract <T extends java.lang.Object>java.lang.Object put(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Url()
    java.lang.String endPoint, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Body()
    java.lang.Object payload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.core.util.GenericApiResponse<T>>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.DELETE()
    public abstract <T extends java.lang.Object>java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Url()
    java.lang.String endPoint, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.core.util.GenericApiResponse<T>>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.PATCH()
    public abstract <T extends java.lang.Object>java.lang.Object patch(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Url()
    java.lang.String endPoint, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Body()
    java.lang.Object payload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.core.util.GenericApiResponse<T>>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST()
    @retrofit2.http.Multipart()
    public abstract <T extends java.lang.Object>java.lang.Object multipart(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Url()
    java.lang.String endPoint, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Part()
    okhttp3.MultipartBody.Part file, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.core.util.GenericApiResponse<T>>> p2);
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}