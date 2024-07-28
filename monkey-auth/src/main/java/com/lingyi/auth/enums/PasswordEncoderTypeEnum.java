package com.lingyi.auth.enums;

import lombok.Getter;

/**
 * 密码编码类型枚举
 *
 * @author Yixiaoyi03
 * @createTime 2021/6/5 17:57
 */

public enum PasswordEncoderTypeEnum {

    BCRYPT("{bcrypt}","BCRYPT加密"),
    NOOP("{noop}","无加密明文");

    @Getter
    private String prefix;

    PasswordEncoderTypeEnum(String prefix, String desc){
        this.prefix=prefix;
    }

}
