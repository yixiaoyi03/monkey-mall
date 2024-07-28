package com.lingyi.laboratory.spring.aop.transactional;

import com.lingyi.common.base.BaseEntity;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

/**
 * 说明描述
 *
 * @author Yixiaoyi03
 * @Date 2022/3/26 0026 19:40
 */
@Data
public class UmsMember extends BaseEntity {

    private Long id;

    private Integer gender;

    private String nickName;

    private String mobile;

    private LocalDate birthday;

    private String avatarUrl;

    private String openid;

    private String sessionKey;

    private String city;

    private String country;

    private String language;

    private String province;

    private Integer status;

    private Long balance;

    private Integer deleted;

    private List<UmsAddress> addressList;

    private Integer point;

}
