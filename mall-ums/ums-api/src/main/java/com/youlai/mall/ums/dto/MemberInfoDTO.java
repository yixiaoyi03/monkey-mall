package com.lingyi.mall.ums.dto;

import lombok.Data;

import java.time.LocalDate;


/**
 * 会员传输层对象
 *
 * @author Yixiaoyi03
 * @date 2022/2/12
 */
@Data
public class MemberInfoDTO {

    private String nickName;

    private String avatarUrl;

    private Long balance;

}
