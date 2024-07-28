package com.lingyi.system.mapper;

/**
 * 菜单持久层
 *
 * @author Yixiaoyi03
 * @date 2022/1/24
 */

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lingyi.system.pojo.bo.RouteBO;
import com.lingyi.system.pojo.entity.SysMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Set;

@Mapper
public interface SysMenuMapper extends BaseMapper<SysMenu> {

    /**
     * 获取路由列表
     *
     * @return
     */
    List<RouteBO> listRoutes();

    /**
     * 获取角色权限集合
     *
     * @param roles
     * @return
     */
    Set<String> listRolePerms(Set<String> roles);
}