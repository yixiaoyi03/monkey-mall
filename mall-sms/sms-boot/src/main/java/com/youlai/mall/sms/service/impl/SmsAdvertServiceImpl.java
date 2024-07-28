package com.lingyi.mall.sms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lingyi.common.enums.StatusEnum;
import com.lingyi.mall.sms.converter.AdvertConverter;
import com.lingyi.mall.sms.pojo.entity.SmsAdvert;
import com.lingyi.mall.sms.mapper.SmsAdvertMapper;
import com.lingyi.mall.sms.pojo.query.AdvertPageQuery;
import com.lingyi.mall.sms.pojo.vo.AdBannerVO;
import com.lingyi.mall.sms.pojo.vo.AdvertPageVO;
import com.lingyi.mall.sms.service.SmsAdvertService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 广告业务实现类
 *
 * @author Yixiaoyi03
 * @date 2022/5/28
 */
@Service
@RequiredArgsConstructor
public class SmsAdvertServiceImpl extends ServiceImpl<SmsAdvertMapper, SmsAdvert> implements SmsAdvertService {

    private final AdvertConverter advertConverter;

    /**
     * 广告分页列表
     *
     * @param queryParams
     * @return
     */
    @Override
    public Page<AdvertPageVO> listAdvertPages(AdvertPageQuery queryParams) {
        Page<SmsAdvert> entities = this.baseMapper.listAdvertPages(new Page<>(queryParams.getPageNum(),
                        queryParams.getPageSize()),
                queryParams);

        Page<AdvertPageVO> advertVOPage = advertConverter.entity2PageVo(entities);

        return advertVOPage;
    }

    /**
     * 广告横幅列表对象
     *
     * @return
     */
    @Override
    public List<AdBannerVO> listAdBanners() {

        List<SmsAdvert> entities = this.list(new LambdaQueryWrapper<SmsAdvert>().
                eq(SmsAdvert::getStatus, StatusEnum.ENABLE.getValue())
                .select(SmsAdvert::getTitle, SmsAdvert::getPicUrl, SmsAdvert::getRedirectUrl)
        );
        List<AdBannerVO> list = advertConverter.entity2BannerVo(entities);
        return list;
    }
}