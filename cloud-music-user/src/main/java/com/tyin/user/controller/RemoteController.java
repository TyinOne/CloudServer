package com.tyin.user.controller;

import com.tyin.api.userModules.dto.UserDTO;
import com.tyin.core.modules.entity.AdminUser;
import com.tyin.user.service.IAdminUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TyinZero
 * @date 2022/12/29
 * @description ...
 */
@RestController
@RequestMapping("/remote")
@RequiredArgsConstructor
public class RemoteController {
    private final IAdminUserService adminUserService;

    @GetMapping("/user/{account}")
    public UserDTO remoteGetUserByUsername(@PathVariable String account) {
        AdminUser user = adminUserService.getUserByUsername(account);
        return new UserDTO(
                user.getId(),
                user.getNickName(),
                user.getAvatar(),
                user.getToken(),
                user.getAccount(),
                user.getPhone(),
                user.getMail(),
                user.getPassword(),
                user.getDisabled(),
                user.getLastLogin(),
                user.getLastLoginTime()
        );
    }
}
