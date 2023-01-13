package com.tyin.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tyin.core.modules.entity.AdminUser;

/**
 * @author TyinZero
 * @date 2022/12/29
 * @description ...
 */
public interface IAdminUserService extends IService<AdminUser> {
    AdminUser getUserByUsername(String username);
}
