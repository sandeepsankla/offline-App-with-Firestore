package com.example.core.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0013\u001a\u00020\nH\u0007J\b\u0010\u0014\u001a\u00020\u0015H\u0007J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\b\u0010\u0018\u001a\u00020\u0019H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/core/di/RemoteApiModule;", "", "()V", "BASE_URL", "", "provideCoroutineCallAdapterFactory", "Lcom/jakewharton/retrofit2/adapter/kotlin/coroutines/CoroutineCallAdapterFactory;", "provideGsonConverterFactory", "Lretrofit2/converter/gson/GsonConverterFactory;", "provideHeaderInterceptor", "Lokhttp3/Interceptor;", "provideLiveDataCallAdapterFactory", "Lcom/github/leonardoxh/livedatacalladapter/LiveDataCallAdapterFactory;", "provideLiveDataResponseBodyConverterFactory", "Lcom/github/leonardoxh/livedatacalladapter/LiveDataResponseBodyConverterFactory;", "provideLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "provideRetrofit", "Lretrofit2/Retrofit;", "provideTimeoutInterceptor", "providesAppLog", "Lcom/example/core/util/AppLog;", "providesNetworkService", "Lcom/example/core/di/ApiInterface;", "providesOkHttpClient", "Lokhttp3/OkHttpClient;", "HeaderInterceptor", "TimeOutInterceptor", "core_debug"})
@dagger.Module()
public final class RemoteApiModule {
    private final java.lang.String BASE_URL = "https://your.api.url/";
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.converter.gson.GsonConverterFactory provideGsonConverterFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory provideCoroutineCallAdapterFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.github.leonardoxh.livedatacalladapter.LiveDataCallAdapterFactory provideLiveDataCallAdapterFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.github.leonardoxh.livedatacalladapter.LiveDataResponseBodyConverterFactory provideLiveDataResponseBodyConverterFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient providesOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.logging.HttpLoggingInterceptor provideLoggingInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.example.core.di.RemoteApiModule.HeaderInterceptor()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.Interceptor provideHeaderInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.example.core.di.RemoteApiModule.TimeOutInterceptor()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.Interceptor provideTimeoutInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.core.di.ApiInterface providesNetworkService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.core.util.AppLog providesAppLog() {
        return null;
    }
    
    public RemoteApiModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/example/core/di/RemoteApiModule$HeaderInterceptor;", "", "core_debug"})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.BINARY)
    @javax.inject.Qualifier()
    public static abstract @interface HeaderInterceptor {
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/example/core/di/RemoteApiModule$TimeOutInterceptor;", "", "core_debug"})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.BINARY)
    @javax.inject.Qualifier()
    public static abstract @interface TimeOutInterceptor {
    }
}