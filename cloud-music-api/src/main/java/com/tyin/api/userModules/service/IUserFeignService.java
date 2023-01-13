package com.tyin.api.userModules.service;

import com.tyin.api.userModules.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author TyinZero
 * @date 2022/12/29
 * @description ...
 */
@FeignClient(value = "cloud-user")
public interface IUserFeignService {
    @GetMapping("/remote/user/{username}")
    UserDTO remoteGetUserByUsername(@PathVariable String username);
}
