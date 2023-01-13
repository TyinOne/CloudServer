package com.tyin.core.exception;

import com.tyin.core.enums.ResultCode;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author TyinZero
 * @date 2022/12/27
 * @description ...
 */
public class ApiException extends RuntimeException implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 错误码
     */
    protected Integer errorCode;
    /**
     * 错误信息
     */
    protected String errorMsg;

    public ApiException() {
        super();
    }

    public ApiException(BaseErrorInfoInterface errorInfoInterface) {
        super(errorInfoInterface.getCode().toString());
        this.errorCode = errorInfoInterface.getCode();
        this.errorMsg = errorInfoInterface.getMessage();
    }

    public ApiException(BaseErrorInfoInterface errorInfoInterface, Throwable cause) {
        super(errorInfoInterface.getCode().toString(), cause);
        this.errorCode = errorInfoInterface.getCode();
        this.errorMsg = errorInfoInterface.getMessage();
    }

    public ApiException(String errorMsg) {
        super(errorMsg);
        this.errorCode = ResultCode.FAIL.getCode();
        this.errorMsg = errorMsg;
    }

    public ApiException(Integer errorCode, String errorMsg) {
        super(errorCode.toString());
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public ApiException(Integer errorCode, String errorMsg, Throwable cause) {
        super(errorCode.toString(), cause);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }


    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public String getMessage() {
        return errorMsg;
    }

    @Override
    public Throwable fillInStackTrace() {
        return this;
    }
}
