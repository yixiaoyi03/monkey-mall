package com.lingyi.system.converter;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lingyi.system.pojo.entity.SysUser;
import com.lingyi.system.pojo.form.UserForm;
import com.lingyi.system.pojo.bo.UserFormBO;
import com.lingyi.system.pojo.bo.UserBO;
import com.lingyi.system.pojo.vo.user.UserLoginVO;
import com.lingyi.system.pojo.vo.user.UserVO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * 用户对象转换器
 *
 * @author Yixiaoyi03
 * @date 2022/6/8
 */
@Mapper(componentModel = "spring")
public interface UserConverter {

    @Mappings({
            @Mapping(target = "genderLabel", expression = "java(com.lingyi.common.base.IBaseEnum.getLabelByValue(bo.getGender(), com.lingyi.common.enums.GenderEnum.class))")
    })
    UserVO bo2Vo(UserBO bo);

    Page<UserVO> bo2Vo(Page<UserBO> po);

    UserForm bo2Form(UserFormBO po);

    @InheritInverseConfiguration(name = "entity2Form")
    SysUser form2Entity(UserForm entity);

    @Mappings({
            @Mapping(target = "userId", source = "id")
    })
    UserLoginVO entity2LoginUser(SysUser entity);
}
