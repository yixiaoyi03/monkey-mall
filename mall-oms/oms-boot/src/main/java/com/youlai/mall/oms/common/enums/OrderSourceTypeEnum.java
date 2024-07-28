package com.lingyi.mall.oms.common.enums;

import com.lingyi.common.base.IBaseEnum;
import lombok.Getter;

/**
 * 订单来源类型枚举
 *
 * @author Yixiaoyi03
 * @email huawei_code@163.com
 * @date 2021/1/16
 */

public enum OrderSourceTypeEnum implements IBaseEnum<Integer> {

    APP(1, "APP"), // APP订单
    PC(2, "PC"), // PC订单
    ;

    OrderSourceTypeEnum(Integer value, String label) {
        this.value = value;
        this.label = label;
    }


    @Getter
    private Integer value;

    @Getter
    private String label;
}
