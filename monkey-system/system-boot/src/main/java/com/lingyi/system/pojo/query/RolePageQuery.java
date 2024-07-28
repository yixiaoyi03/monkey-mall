package com.lingyi.system.pojo.query;

import com.lingyi.common.base.BasePageQuery;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 角色分页查询实体
 *
 * @author Yixiaoyi03
 * @date 2022/6/3
 *
 */
@Data
public class RolePageQuery extends BasePageQuery {

    @ApiModelProperty("关键字(角色名称/角色编码)")
    private String keywords;
}
