package com.tyin.core.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tyin.core.exception.BaseErrorInfoInterface;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;
import static com.tyin.core.enums.ResultCode.FAIL;
import static com.tyin.core.enums.ResultCode.SUCCESS;

/**
 * @author TyinZero
 * @date 2022/12/27
 * @description ...
 */
@JsonInclude(value = NON_EMPTY)
public record Result<T>(Integer code, String message, T result) {

    public static <T> Result<T> success() {
        return result(SUCCESS.getCode(), SUCCESS.getMessage(), null);
    }

    public static <T> Result<T> success(String message) {
        return result(SUCCESS.getCode(), message, null);
    }

    public static <T> Result<T> success(T result) {
        return result(SUCCESS.getCode(), SUCCESS.getMessage(), result);
    }

    public static <T> Result<T> success(String message, T result) {
        return result(SUCCESS.getCode(), message, result);
    }

    public static <T> Result<T> fail() {
        return result(FAIL.getCode(), FAIL.getMessage(), null);
    }

    public static <T> Result<T> fail(String message) {
        return result(FAIL.getCode(), message, null);
    }

    public static <T> Result<T> fail(BaseErrorInfoInterface errorInfoInterface) {
        return result(errorInfoInterface.getCode(), errorInfoInterface.getMessage(), null);
    }

    private static <T> Result<T> result(Integer code, String message, T result) {
        return new Result<>(code, message, result);
    }
    public static <T> Result<T> build(Integer code, String message) {
        return new Result<>(code, message, null);
    }
    public static <T> Result<T> build(Integer code, String message, T result) {
        return new Result<>(code, message, result);
    }
}
