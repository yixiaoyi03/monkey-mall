package com.lingyi.mall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lingyi.mall.pms.pojo.form.PmsCategoryAttributeForm;
import com.lingyi.mall.pms.pojo.entity.PmsCategoryAttribute;

public interface AttributeService extends IService<PmsCategoryAttribute> {

    /**
     * 批量保存商品属性
     *
     * @param formData 属性表单数据
     * @return
     */
    boolean saveBatch(PmsCategoryAttributeForm formData);
}
