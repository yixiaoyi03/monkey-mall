package com.lingyi.mall.pms.converter;

import com.lingyi.mall.pms.pojo.entity.PmsSpuAttribute;
import com.lingyi.mall.pms.pojo.form.PmsSpuAttributeForm;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * 商品属性对象转换器
 *
 * @author Yixiaoyi03
 * @date 2022/6/11
 */
@Mapper(componentModel = "spring")
public interface SpuAttributeConverter {

    @Mappings({
            @Mapping(target = "id",ignore = true)
    })
    PmsSpuAttribute form2Entity(PmsSpuAttributeForm form);

}
