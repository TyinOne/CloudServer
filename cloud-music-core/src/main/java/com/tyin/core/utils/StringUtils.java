package com.tyin.core.utils;

/**
 * @author TyinZero
 * @date 2022/12/28
 * @description ...
 */
public class StringUtils extends org.springframework.util.StringUtils {
    public static boolean isBlank(String value) {
        return hasLength(value);
    }

    public static boolean isNotBlank(String value) {
        return !isBlank(value);
    }
}
