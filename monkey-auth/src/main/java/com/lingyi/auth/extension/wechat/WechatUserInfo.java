package com.lingyi.auth.extension.wechat;

import lombok.Data;

/**
 * 微信用户信息
 *
 * @author Yixiaoyi03
 * @date 2021/10/4
 */
@Data
public class WechatUserInfo {
    private String avatarUrl;

    private String city;

    private String country;

    private Integer gender;

    private String language;

    private String nickName;

    private String province;

}
