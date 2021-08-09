package com.example.sandeep.repo;

import android.util.Log;
import com.example.core.di.FormattedResponse;
import com.example.core.util.AppLog;
import com.example.core.util.Resource;
import com.example.sandeep.User;
import com.google.firebase.firestore.*;
import com.google.firebase.ktx.Firebase;
import kotlinx.coroutines.*;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

/**
 * Created by Sandeep Sankla
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\'\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ#\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00100\b0\u000fH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/example/sandeep/repo/MainRemoteSource;", "", "()V", "fireStoreDB", "Lcom/google/firebase/firestore/FirebaseFirestore;", "getFireStoreDB", "()Lcom/google/firebase/firestore/FirebaseFirestore;", "addNewUser", "Lcom/example/core/util/Resource;", "Lcom/example/sandeep/User;", "name", "", "city", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUser", "Lkotlinx/coroutines/flow/Flow;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class MainRemoteSource {
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.firestore.FirebaseFirestore fireStoreDB = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.firestore.FirebaseFirestore getFireStoreDB() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addNewUser(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.core.util.Resource<com.example.sandeep.User>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlinx.coroutines.ExperimentalCoroutinesApi()
    public final java.lang.Object getUser(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.core.util.Resource<? extends java.util.List<com.example.sandeep.User>>>> p0) {
        return null;
    }
    
    @javax.inject.Inject()
    public MainRemoteSource() {
        super();
    }
}