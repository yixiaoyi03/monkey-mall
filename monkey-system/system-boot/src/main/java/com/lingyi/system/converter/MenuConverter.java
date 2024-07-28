package com.lingyi.system.converter;

import com.lingyi.system.pojo.entity.SysMenu;
import com.lingyi.system.pojo.vo.menu.MenuVO;
import org.mapstruct.Mapper;

/**
 * 菜单对象转换器
 *
 * @author Yixiaoyi03
 * @date 2022/7/29
 */
@Mapper(componentModel = "spring")
public interface MenuConverter {

    MenuVO entity2VO(SysMenu entity);

}