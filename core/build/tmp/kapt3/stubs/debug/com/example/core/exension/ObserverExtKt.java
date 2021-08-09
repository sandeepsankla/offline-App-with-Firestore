package com.example.core.exension;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001aA\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u0011H\u0002\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u0007\u001aM\u0010\u000b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\f0\u00052\'\u0010\u0006\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u00020\f\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u0007\u00a8\u0006\r"}, d2 = {"observe", "", "T", "Landroidx/lifecycle/LifecycleOwner;", "liveData", "Landroidx/lifecycle/LiveData;", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "t", "observeEvent", "Lcom/example/core/util/SingleEvent;", "core_debug"})
public final class ObserverExtKt {
    
    /**
     * Created by Sandeep Sankla
     */
    public static final <T extends java.lang.Object>void observe(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner $this$observe, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<T> liveData, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> action) {
    }
    
    public static final <T extends java.lang.Object>void observeEvent(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner $this$observeEvent, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.example.core.util.SingleEvent<T>> liveData, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.core.util.SingleEvent<? extends T>, kotlin.Unit> action) {
    }
}