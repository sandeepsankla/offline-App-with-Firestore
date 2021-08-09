package com.example.sandeep.ui;

import androidx.lifecycle.*;
import com.example.core.base.BaseViewModel;
import com.example.core.util.Resource;
import com.example.sandeep.User;
import com.example.sandeep.repo.MainRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\r\u001a\u00020\u0012R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n0\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR#\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n0\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e\u00a8\u0006\u0016"}, d2 = {"Lcom/example/sandeep/ui/MainViewModel;", "Lcom/example/core/base/BaseViewModel;", "repository", "Lcom/example/sandeep/repo/MainRepository;", "(Lcom/example/sandeep/repo/MainRepository;)V", "_user", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/core/util/Resource;", "Lcom/example/sandeep/User;", "_userList", "", "user", "Landroidx/lifecycle/LiveData;", "getUser", "()Landroidx/lifecycle/LiveData;", "userList", "getUserList", "addUser", "", "name", "", "city", "app_debug"})
public final class MainViewModel extends com.example.core.base.BaseViewModel {
    private androidx.lifecycle.MutableLiveData<com.example.core.util.Resource<com.example.sandeep.User>> _user;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.core.util.Resource<com.example.sandeep.User>> user = null;
    private androidx.lifecycle.MutableLiveData<com.example.core.util.Resource<java.util.List<com.example.sandeep.User>>> _userList;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.core.util.Resource<java.util.List<com.example.sandeep.User>>> userList = null;
    private final com.example.sandeep.repo.MainRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.core.util.Resource<com.example.sandeep.User>> getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.core.util.Resource<java.util.List<com.example.sandeep.User>>> getUserList() {
        return null;
    }
    
    public final void addUser(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String city) {
    }
    
    public final void getUser() {
    }
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.sandeep.repo.MainRepository repository) {
        super();
    }
}