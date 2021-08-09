package com.example.core.util;

import java.lang.System;

/**
 * Created by Sandeep Sankla
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/core/util/ApiResponseCodes;", "", "()V", "ACCESS_FORBIDDEN", "", "API_CONNECTION_ERROR", "BAD_REQUEST", "CLIENT_ERROR_MAX", "CLIENT_ERROR_MIN", "INFORMATIONAL_RESPONSE_MAX", "INFORMATIONAL_RESPONSE_MIN", "METHOD_NOT_ALLOWED", "NOT_FOUND", "REDIRECTION_RESPONSE_MAX", "REDIRECTION_RESPONSE_MIN", "REQUEST_PARSING_ERROR", "RESPONSE_PARSING_ERROR", "SERVER_ERROR", "SERVER_ERROR_MAX", "SERVER_ERROR_MIN", "SUCCESS", "SUCCESS_MAX", "SUCCESS_MIN", "UNAUTHORIZED_ACCESS", "core_debug"})
public final class ApiResponseCodes {
    public static final int API_CONNECTION_ERROR = 1;
    public static final int REQUEST_PARSING_ERROR = 2;
    public static final int RESPONSE_PARSING_ERROR = 3;
    public static final int SUCCESS = 200;
    public static final int NOT_FOUND = 404;
    public static final int SERVER_ERROR = 500;
    public static final int BAD_REQUEST = 400;
    public static final int UNAUTHORIZED_ACCESS = 401;
    public static final int ACCESS_FORBIDDEN = 403;
    public static final int METHOD_NOT_ALLOWED = 405;
    public static final int INFORMATIONAL_RESPONSE_MIN = 100;
    public static final int INFORMATIONAL_RESPONSE_MAX = 199;
    public static final int SUCCESS_MIN = 200;
    public static final int SUCCESS_MAX = 299;
    public static final int REDIRECTION_RESPONSE_MIN = 300;
    public static final int REDIRECTION_RESPONSE_MAX = 399;
    public static final int CLIENT_ERROR_MIN = 400;
    public static final int CLIENT_ERROR_MAX = 499;
    public static final int SERVER_ERROR_MIN = 500;
    public static final int SERVER_ERROR_MAX = 599;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.core.util.ApiResponseCodes INSTANCE = null;
    
    private ApiResponseCodes() {
        super();
    }
}