// Generated by Dagger (https://dagger.dev).
package com.example.sandeep.repo;

import dagger.internal.Factory;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainRemoteSource_Factory implements Factory<MainRemoteSource> {
  @Override
  public MainRemoteSource get() {
    return newInstance();
  }

  public static MainRemoteSource_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static MainRemoteSource newInstance() {
    return new MainRemoteSource();
  }

  private static final class InstanceHolder {
    private static final MainRemoteSource_Factory INSTANCE = new MainRemoteSource_Factory();
  }
}
