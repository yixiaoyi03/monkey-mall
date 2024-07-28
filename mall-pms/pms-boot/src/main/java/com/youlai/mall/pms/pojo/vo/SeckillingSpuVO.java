package com.lingyi.mall.pms.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 【应用端】秒杀商品视图对象
 *
 * @author Yixiaoyi03
 * @date 2021/8/8
 */
@ApiModel("商品分页对象")
@Data
public class SeckillingSpuVO {

    @ApiModelProperty("商品ID")
    private Long id;

    @ApiModelProperty("商品名称")
    private String name;

    @ApiModelProperty("商品价格(单位：分)")
    private Long price;

    @ApiModelProperty("图片地址")
    private String picUrl;

}
