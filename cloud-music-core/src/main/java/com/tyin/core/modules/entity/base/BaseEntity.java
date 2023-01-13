package com.tyin.core.modules.entity.base;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.util.Date;

/**
 * @author TyinZero
 * @date 2022/12/29
 * @description ...
 */
@Data
public class BaseEntity {
    @TableField(fill = FieldFill.INSERT)
    protected Date created;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    protected Date modified;
    @TableLogic
    protected Boolean deleted;
}
