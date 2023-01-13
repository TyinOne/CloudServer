package com.tyin.core.utils;

import java.util.Locale;
import java.util.UUID;

/**
 * @author TyinZero
 * @date 2022/12/28
 * @description ...
 */
public class StringUtils extends org.springframework.util.StringUtils {
    public static boolean isBlank(String value) {
        return !isNotBlank(value);
    }

    public static boolean isNotBlank(String value) {
        return hasLength(value);
    }
    public static String uuid() {
        return UUID.randomUUID().toString().replaceAll("-", "").toUpperCase(Locale.ROOT);
    }

}
