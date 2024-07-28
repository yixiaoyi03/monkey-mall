package com.lingyi.mall.oms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lingyi.mall.oms.pojo.entity.OmsOrderItem;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单商品明细表
 *
 * @author Yixiaoyi03
 * @date 2020-12-30
 */
@Mapper
public interface OrderItemMapper extends BaseMapper<OmsOrderItem> {

}
