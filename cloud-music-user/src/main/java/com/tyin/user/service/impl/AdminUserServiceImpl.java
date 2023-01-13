package com.tyin.user.service.impl;

import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tyin.core.modules.entity.AdminUser;
import com.tyin.user.repository.AdminUserRepository;
import com.tyin.user.service.IAdminUserService;
import org.springframework.stereotype.Service;

/**
 * @author TyinZero
 * @date 2022/12/29
 * @description ...
 */
@Service
public class AdminUserServiceImpl extends ServiceImpl<AdminUserRepository, AdminUser> implements IAdminUserService {
    @Override
    public AdminUser getUserByUsername(String username) {
        LambdaQueryChainWrapper<AdminUser> wrapper = lambdaQuery().eq(AdminUser::getAccount, username);
        return getOne(wrapper);
    }
}
