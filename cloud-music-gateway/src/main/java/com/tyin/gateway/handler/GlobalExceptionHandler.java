package com.tyin.gateway.handler;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tyin.core.api.Result;
import com.tyin.gateway.components.RequestLogComponents;
import com.tyin.core.exception.RequestException;
import com.tyin.core.logs.RequestLog;
import com.tyin.core.modules.entity.AdminGatewayLog;
import com.tyin.core.utils.JsonUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.core.annotation.Order;
import org.springframework.core.io.buffer.DataBufferFactory;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebExceptionHandler;
import reactor.core.publisher.Mono;

@Order(-1)
@Component
@RequiredArgsConstructor
public class GlobalExceptionHandler implements WebExceptionHandler {
    private final RequestLogComponents requestLogComponents;
    private static final RequestLog log = new RequestLog();

    @Override
    public Mono<Void> handle(ServerWebExchange exchange, Throwable ex) {
        ServerHttpResponse response = exchange.getResponse();
        if (response.isCommitted()) {
            return Mono.error(ex);
        }
        response.getHeaders().setContentType(MediaType.APPLICATION_JSON);
        response.setStatusCode(HttpStatusCode.valueOf(200));
        Result<Object> result = Result.build(500, ex.getMessage());
        if (ex instanceof RequestException e) {
            String resultStr = JsonUtils.toJSONString(result);
            log.info("-RESULT   " + e.getRequestId() + "   ===:  " + resultStr);
            requestLogComponents.saveLog(AdminGatewayLog.builder().requestId(e.getUuid() + ":" + e.getRequestId()).field("DATA").value(resultStr).sort(99).build());
            log.info("-E N D    " + e.getRequestId() + "   ================]");
        }
        return response.writeWith(Mono.fromSupplier(() -> {
            DataBufferFactory bufferFactory = response.bufferFactory();
            try {
                return bufferFactory.wrap(JsonUtils.getMapper().writeValueAsBytes(result));
            } catch (JsonProcessingException e) {
                return bufferFactory.wrap(new byte[0]);
            }
        }));
    }
}
