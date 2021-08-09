// Generated by Dagger (https://dagger.dev).
package com.example.sandeep.ui;

import com.example.core.base.BaseViewModel_MembersInjector;
import com.example.core.util.AppLog;
import com.example.sandeep.repo.MainRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private final Provider<MainRepository> repositoryProvider;

  private final Provider<AppLog> applogProvider;

  public MainViewModel_Factory(Provider<MainRepository> repositoryProvider,
      Provider<AppLog> applogProvider) {
    this.repositoryProvider = repositoryProvider;
    this.applogProvider = applogProvider;
  }

  @Override
  public MainViewModel get() {
    MainViewModel instance = newInstance(repositoryProvider.get());
    BaseViewModel_MembersInjector.injectApplog(instance, applogProvider.get());
    return instance;
  }

  public static MainViewModel_Factory create(Provider<MainRepository> repositoryProvider,
      Provider<AppLog> applogProvider) {
    return new MainViewModel_Factory(repositoryProvider, applogProvider);
  }

  public static MainViewModel newInstance(MainRepository repository) {
    return new MainViewModel(repository);
  }
}
