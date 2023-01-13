package com.tyin.user.controller;

import com.tyin.core.api.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TyinZero
 * @date 2022/12/28
 * @description ...
 */
@RestController
public class UserController {
    @GetMapping("/test")
    public Result<?> getTest() {
        return Result.success("8888");
    }
}
