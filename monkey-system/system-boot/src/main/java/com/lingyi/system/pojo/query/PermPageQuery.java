package com.lingyi.system.pojo.query;

import com.lingyi.common.base.BasePageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 权限分页查询对象
 *
 * @author Yixiaoyi03
 * @date 2022/1/14 22:22
 */
@Data
@ApiModel
public class PermPageQuery extends BasePageQuery {

    @ApiModelProperty("权限名称")
    private String name;

    @ApiModelProperty("菜单ID")
    private Long menuId;

}
