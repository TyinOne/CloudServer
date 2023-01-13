package com.tyin.core.config.mybatis;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.logging.Log;
@Slf4j
public class DatabaseMyBatisLog implements Log {
    public DatabaseMyBatisLog(String clazz) {
        // Do Nothing
    }

    @Override
    public boolean isDebugEnabled() {
        return true;
    }

    @Override
    public boolean isTraceEnabled() {
        return true;
    }

    @Override
    public void error(String s, Throwable throwable) {
        log.error(s);
        throwable.printStackTrace();
    }

    @Override
    public void error(String s) {
        log.error(s);
    }

    @Override
    public void debug(String s) {
        log.debug(s);
    }

    @Override
    public void trace(String s) {
        log.trace(s);
    }

    @Override
    public void warn(String s) {
        log.warn(s);
    }
}
