package com.lingyi.mall.sms.pojo.query;

import com.lingyi.common.base.BasePageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 广告分页列表查询对象
 *
 * @author Yixiaoyi03
 * @date 2021/7/11
 */
@ApiModel("广告分页查询对象")
@Data
public class AdvertPageQuery extends BasePageQuery {

    @ApiModelProperty("关键字")
    private String keywords;

}