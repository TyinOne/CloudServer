package com.tyin.core.exception;

import java.io.Serial;
import java.io.Serializable;

public class RequestException extends ApiException implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private final String requestId;
    private final String uuid;

    public String getRequestId() {
        return requestId;
    }

    public String getUuid() {
        return uuid;
    }
    public RequestException(String requestId, String uuid, ApiException apiException) {
        super(apiException.errorCode, apiException.errorMsg);
        this.requestId = requestId;
        this.uuid = uuid;
    }
}
