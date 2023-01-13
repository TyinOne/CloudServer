package com.tyin.api.userModules.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author TyinZero
 * @date 2022/12/29
 * @description ...
 */
@Data
public class UserDTO {
    private Long id;
    private String nickName;
    /**
     * 头像
     */
    private String avatar;
    /**
     * 登录验证
     */
    private String token;
    /**
     * 用户名
     */
    private String account;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 邮箱
     */
    private String mail;
    /**
     * password
     */
    private String password;

    private Boolean disabled;

    private Long lastLogin;

    private Date lastLoginTime;
}
