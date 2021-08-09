package com.example.sandeep.ui;

import android.os.Bundle;
import android.util.Log;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBinding;
import com.example.core.base.BaseActivity;
import com.example.core.exension.*;
import com.example.core.util.AppLog;
import com.example.core.util.Resource;
import com.example.core.util.Status;
import com.example.sandeep.User;
import com.example.sandeep.databinding.ActivityMainBinding;
import dagger.hilt.android.AndroidEntryPoint;
import kotlinx.android.synthetic.main.activity_main.*;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0016J\u001c\u0010\u0016\u001a\u00020\u00112\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0018H\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001b"}, d2 = {"Lcom/example/sandeep/ui/MainActivity;", "Lcom/example/core/base/BaseActivity;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "userAdapter", "Lcom/example/sandeep/ui/UserListAdapter;", "viewModel", "Lcom/example/sandeep/ui/MainViewModel;", "getViewModel", "()Lcom/example/sandeep/ui/MainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initViewBinding", "Landroidx/viewbinding/ViewBinding;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setUpAdapter", "setUpObserver", "userListListener", "resource", "Lcom/example/core/util/Resource;", "", "Lcom/example/sandeep/User;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends com.example.core.base.BaseActivity {
    private final java.lang.String TAG = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private final com.example.sandeep.ui.UserListAdapter userAdapter = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.example.sandeep.ui.MainViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.viewbinding.ViewBinding initViewBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void setUpObserver() {
    }
    
    private final void userListListener(com.example.core.util.Resource<? extends java.util.List<com.example.sandeep.User>> resource) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpAdapter() {
    }
    
    public MainActivity() {
        super();
    }
}