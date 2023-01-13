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
    private String avatar;
    private String token;
    private String account;
    private String phone;
    private String mail;
    private String password;
    private Boolean disabled;
    private Long lastLogin;
    private Date lastLoginTime;

    public UserDTO(Long id, String nickName, String avatar, String token, String account, String phone, String mail, String password, Boolean disabled, Long lastLogin, Date lastLoginTime) {
        this.id = id;
        this.nickName = nickName;
        this.avatar = avatar;
        this.token = token;
        this.account = account;
        this.phone = phone;
        this.mail = mail;
        this.password = password;
        this.disabled = disabled;
        this.lastLogin = lastLogin;
        this.lastLoginTime = lastLoginTime;
    }
}
