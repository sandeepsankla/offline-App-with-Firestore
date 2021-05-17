package com.example.core.util

import android.provider.SyncStateContract
import com.example.core.PLATFORM_NAME
import com.example.core.USER_CLIENT_ID
import com.example.core.USER_CLIENT_SECRET
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import javax.inject.Inject

/**
 * Created by Sandeep Sankla
 */
class HeaderInceptor @Inject constructor():Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val headers = mapOf(
            "Authorization" to "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJleHAiOjE2MzQ4MDIyNzIsInN1YiI6IjIzMTM1MSIsImh0dHBzOi8vcGFya3doZWVscy5jby5pbi8iOnsidXNlcl9pZCI6MjMxMzUxLCJuYW1lIjoiVGVzdCBTdXBlcnZpc29yIiwiZW1haWwiOiJkZWVwYWt2ZXJ0QGdtYWlsLmNvbSIsInBob25lX251bWJlciI6IjU1NTU1NTU1NTUiLCJyb2xlIjoic3VwZXJ2aXNvciIsImRldmljZV9pZCI6bnVsbH19.QtRonGB4FiPROFEx72xX-2OpWbPglXx6_Fz1IXrcgw0",
            "client-id" to USER_CLIENT_ID,
            "client-secret" to USER_CLIENT_SECRET,
            "platform" to PLATFORM_NAME
        )
        val orignal: Request = chain.request()
        val requestBuilder: Request.Builder = orignal.newBuilder()
        for (item: Map.Entry<String, String> in headers.entries) {
            requestBuilder.addHeader(item.key, item.value)
        }
        val request: Request = requestBuilder.build()
       return chain.proceed(request)
    }
}