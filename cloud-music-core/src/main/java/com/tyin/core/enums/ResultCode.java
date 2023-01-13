package com.tyin.core.enums;

import com.tyin.core.exception.BaseErrorInfoInterface;

/**
 * @author TyinZero
 * @date 2022/12/27
 * @description ...
 */
public enum ResultCode implements BaseErrorInfoInterface {
    // 数据操作错误定义
    SUCCESS(200, "success"),
    FAIL(400, "fail"),
    PERMISSION_DENIED(402, "Permission Denied..."),
    SIGNATURE_NOT_MATCH(403, "Signature Not Match..."),
    NOT_FOUND(404, "Not Found Resource..."),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error..."),
    SERVER_BUSY(503, "Internal Server Busy");
    /**
     * 错误码
     */
    private final Integer resultCode;

    /**
     * 错误描述
     */
    private final String resultMsg;

    ResultCode(Integer resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    @Override
    public Integer getCode() {
        return this.resultCode;
    }

    @Override
    public String getMessage() {
        return this.resultMsg;
    }
}
