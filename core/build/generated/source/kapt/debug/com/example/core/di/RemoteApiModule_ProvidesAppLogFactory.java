// Generated by Dagger (https://dagger.dev).
package com.example.core.di;

import com.example.core.util.AppLog;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RemoteApiModule_ProvidesAppLogFactory implements Factory<AppLog> {
  private final RemoteApiModule module;

  public RemoteApiModule_ProvidesAppLogFactory(RemoteApiModule module) {
    this.module = module;
  }

  @Override
  public AppLog get() {
    return providesAppLog(module);
  }

  public static RemoteApiModule_ProvidesAppLogFactory create(RemoteApiModule module) {
    return new RemoteApiModule_ProvidesAppLogFactory(module);
  }

  public static AppLog providesAppLog(RemoteApiModule instance) {
    return Preconditions.checkNotNull(instance.providesAppLog(), "Cannot return null from a non-@Nullable @Provides method");
  }
}