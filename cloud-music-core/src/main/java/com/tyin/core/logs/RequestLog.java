package com.tyin.core.logs;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RequestLog {
    public void info(String message) {
        log.info(message);
    }
}
