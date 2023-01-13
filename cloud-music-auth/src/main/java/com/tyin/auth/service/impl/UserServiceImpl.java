package com.tyin.auth.service.impl;

import com.tyin.api.userModules.service.IUserFeignService;
import com.tyin.api.userModules.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author TyinZero
 * @date 2022/12/29
 * @description ...
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserDetailsService {
    private final IUserFeignService userFeignService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDTO userDTO = userFeignService.remoteGetUserByUsername(username);
        return null;
    }
}
