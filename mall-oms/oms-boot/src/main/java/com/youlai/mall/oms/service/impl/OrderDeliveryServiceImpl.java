package com.lingyi.mall.oms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lingyi.mall.oms.mapper.OrderDeliveryMapper;
import com.lingyi.mall.oms.pojo.entity.OmsOrderDelivery;
import com.lingyi.mall.oms.service.OrderDeliveryService;
import org.springframework.stereotype.Service;

@Service("orderDeliveryService")
public class OrderDeliveryServiceImpl extends ServiceImpl<OrderDeliveryMapper, OmsOrderDelivery> implements OrderDeliveryService {

}
