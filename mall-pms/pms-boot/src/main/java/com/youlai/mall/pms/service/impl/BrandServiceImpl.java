package com.lingyi.mall.pms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lingyi.mall.pms.pojo.entity.PmsBrand;
import com.lingyi.mall.pms.mapper.PmsBrandMapper;
import com.lingyi.mall.pms.service.BrandService;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl extends ServiceImpl<PmsBrandMapper, PmsBrand> implements BrandService {
}
