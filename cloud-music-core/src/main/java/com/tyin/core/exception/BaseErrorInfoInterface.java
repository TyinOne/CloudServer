package com.tyin.core.exception;

/**
 * @author TyinZero
 * @date 2022/12/27
 * @description ...
 */
public interface BaseErrorInfoInterface {
    /**
     * 错误代码
     *
     * @return
     */
    Integer getCode();

    /**
     * 错误描述
     */
    String getMessage();
}
