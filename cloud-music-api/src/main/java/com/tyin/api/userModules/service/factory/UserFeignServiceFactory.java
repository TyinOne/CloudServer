package com.tyin.api.userModules.service.factory;

import com.tyin.api.userModules.dto.UserDTO;
import com.tyin.api.userModules.service.IUserFeignService;
import org.springframework.cloud.openfeign.FallbackFactory;

/**
 * @author TyinZero
 * @date 2022/12/29
 * @description ...
 */
public class UserFeignServiceFactory implements FallbackFactory<IUserFeignService> {
    @Override
    public IUserFeignService create(Throwable cause) {
        return new IUserFeignService() {
            @Override
            public UserDTO remoteGetUserByAccount(String account) {
                return null;
            }
        };
    }
}
