package com.lingyi.mall.oms.service.admin.impl;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lingyi.common.redis.BusinessSnGenerator;
import com.lingyi.mall.oms.common.enums.OrderStatusEnum;
import com.lingyi.mall.oms.dto.SeataOrderDTO;
import com.lingyi.mall.oms.mapper.OrderMapper;
import com.lingyi.mall.oms.pojo.entity.OmsOrder;
import com.lingyi.mall.oms.pojo.query.OrderPageQuery;
import com.lingyi.mall.oms.service.admin.OmsOrderService;
import com.lingyi.mall.ums.api.MemberFeignClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 「管理端」订单业务实现类
 *
 * @author Yixiaoyi03
 * @date 2022/2/12
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class OmsOrderServiceImpl extends ServiceImpl<OrderMapper, OmsOrder> implements OmsOrderService {

    private final MemberFeignClient memberFeignClient;
    private final BusinessSnGenerator businessSnGenerator;

    /**
     * 订单分页列表
     *
     * @param queryParams
     * @return
     */
    @Override
    public IPage<OmsOrder> listOrderPages(OrderPageQuery queryParams) {
        Page<OmsOrder> page = new Page<>(queryParams.getPageNum(), queryParams.getPageSize());
        List<OmsOrder> list = this.baseMapper.listOrderPages(page, queryParams);
        page.setRecords(list);
        return page;
    }


    /**
     * 「实验室」订单支付
     *
     * @param orderDTO
     * @return
     */
    @Override
    public Boolean payOrder(Long orderId, SeataOrderDTO orderDTO) {

        Long memberId = orderDTO.getMemberId();
        Long amount = orderDTO.getAmount();

        // 扣减账户余额
        memberFeignClient.deductBalance(memberId, amount);

        // 是否开启异常
        Boolean openEx = orderDTO.getOpenEx();
        if (openEx) {
            int i = 1 / 0;
        }

        // 修改订单【已支付】
        String orderSn = businessSnGenerator.generateSerialNo("ORDER");

        boolean result = this.update(new LambdaUpdateWrapper<OmsOrder>()
                .eq(OmsOrder::getId, orderId)
                .set(OmsOrder::getOrderSn, orderSn)
                .set(OmsOrder::getStatus, OrderStatusEnum.PAID.getValue())
        );

        return result;
    }

}
