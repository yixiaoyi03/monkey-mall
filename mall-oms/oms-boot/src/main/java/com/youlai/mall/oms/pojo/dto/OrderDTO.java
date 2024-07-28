package com.lingyi.mall.oms.pojo.dto;

import com.lingyi.mall.oms.pojo.entity.OmsOrder;
import com.lingyi.mall.oms.pojo.entity.OmsOrderItem;
import com.lingyi.mall.ums.dto.MemberDTO;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author Yixiaoyi03
 * @desc
 * @email huawei_code@163.com
 * @date 2021/1/19
 */
@Data
@Accessors(chain = true)
public class OrderDTO {

    private OmsOrder order;

    private List<OmsOrderItem> orderItems;

    private MemberDTO member;

}
