// Generated by Dagger (https://dagger.dev).
package com.example.sandeep.repo;

import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainRepository_Factory implements Factory<MainRepository> {
  private final Provider<MainRemoteSource> mainRemoteSourceProvider;

  public MainRepository_Factory(Provider<MainRemoteSource> mainRemoteSourceProvider) {
    this.mainRemoteSourceProvider = mainRemoteSourceProvider;
  }

  @Override
  public MainRepository get() {
    return newInstance(mainRemoteSourceProvider.get());
  }

  public static MainRepository_Factory create(Provider<MainRemoteSource> mainRemoteSourceProvider) {
    return new MainRepository_Factory(mainRemoteSourceProvider);
  }

  public static MainRepository newInstance(MainRemoteSource mainRemoteSource) {
    return new MainRepository(mainRemoteSource);
  }
}
