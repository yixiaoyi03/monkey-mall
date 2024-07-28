package com.lingyi.mall.sms.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lingyi.mall.sms.pojo.entity.SmsCoupon;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lingyi.mall.sms.pojo.query.CouponPageQuery;
import com.lingyi.mall.sms.pojo.vo.CouponPageVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface SmsCouponMapper extends BaseMapper<SmsCoupon> {

    List<SmsCoupon> listCouponPages(Page<CouponPageVO> page, CouponPageQuery queryParams);
}




