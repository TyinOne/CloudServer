package com.tyin.gateway.components;

import com.tyin.core.modules.entity.AdminGatewayLog;
import com.tyin.gateway.repository.AdminGatewayLogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RequestLogComponents {
    private final AdminGatewayLogRepository adminGatewayLogRepository;

    @Async
    public void saveLog(AdminGatewayLog log) {
        adminGatewayLogRepository.insert(log);
    }
}
