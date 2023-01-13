package com.tyin.core.modules.entity.base;

import lombok.Data;

import java.util.List;

/**
 * @author TyinZero
 * @date 2022/12/29
 * @description ...
 */
public record TreeBase(Long id, Long parentId, Integer sort, List<? extends TreeBase> children) {

}
