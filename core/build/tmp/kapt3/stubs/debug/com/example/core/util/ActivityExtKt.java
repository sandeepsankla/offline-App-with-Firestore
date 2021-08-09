package com.example.core.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 2, d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a\f\u0010\t\u001a\u0004\u0018\u00010\u0004*\u00020\u0002\u001a)\u0010\n\u001a\u00020\u0001*\u00020\u000b2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\u0002\b\u000fH\u0086\b\u00f8\u0001\u0000\u001a\n\u0010\u0010\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0011\u001a\u00020\u0001*\u00020\u0002\u001a\u001a\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\"\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a*\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0014"}, d2 = {"addFragment", "", "Landroidx/appcompat/app/AppCompatActivity;", "fragment", "Landroidx/fragment/app/Fragment;", "frameId", "", "addToStack", "", "getCurrentFragment", "inTransaction", "Landroidx/fragment/app/FragmentManager;", "func", "Lkotlin/Function1;", "Landroidx/fragment/app/FragmentTransaction;", "Lkotlin/ExtensionFunctionType;", "popBackStack", "popBackStackInclusive", "replaceFragment", "clearBackStack", "core_debug"})
public final class ActivityExtKt {
    
    /**
     * Created by Sandeep Sankla
     */
    public static final void popBackStack(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$popBackStack) {
    }
    
    public static final void popBackStackInclusive(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$popBackStackInclusive) {
    }
    
    public static final void inTransaction(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager $this$inTransaction, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super androidx.fragment.app.FragmentTransaction, ? extends androidx.fragment.app.FragmentTransaction> func) {
    }
    
    public static final void addFragment(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$addFragment, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, int frameId) {
    }
    
    public static final void replaceFragment(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$replaceFragment, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, int frameId) {
    }
    
    public static final void replaceFragment(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$replaceFragment, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, int frameId, boolean addToStack) {
    }
    
    public static final void replaceFragment(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$replaceFragment, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, int frameId, boolean addToStack, boolean clearBackStack) {
    }
    
    public static final void addFragment(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$addFragment, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, int frameId, boolean addToStack) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final androidx.fragment.app.Fragment getCurrentFragment(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$getCurrentFragment) {
        return null;
    }
}