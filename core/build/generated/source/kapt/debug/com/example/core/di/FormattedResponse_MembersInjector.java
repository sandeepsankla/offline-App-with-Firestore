// Generated by Dagger (https://dagger.dev).
package com.example.core.di;

import com.example.core.util.AppLog;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FormattedResponse_MembersInjector implements MembersInjector<FormattedResponse> {
  private final Provider<AppLog> appLogProvider;

  public FormattedResponse_MembersInjector(Provider<AppLog> appLogProvider) {
    this.appLogProvider = appLogProvider;
  }

  public static MembersInjector<FormattedResponse> create(Provider<AppLog> appLogProvider) {
    return new FormattedResponse_MembersInjector(appLogProvider);
  }

  @Override
  public void injectMembers(FormattedResponse instance) {
    injectAppLog(instance, appLogProvider.get());
  }

  @InjectedFieldSignature("com.example.core.di.FormattedResponse.appLog")
  public static void injectAppLog(FormattedResponse instance, AppLog appLog) {
    instance.appLog = appLog;
  }
}