package com.lingyi.mall.pms.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.lingyi.common.base.BaseEntity;
import lombok.Data;

/**
 * 商品规格/属性实体
 *
 * @author Yixiaoyi03
 * @date 2020/11/06
 */
@Data
public class PmsSpuAttribute extends BaseEntity {

    /**
     * 主键ID
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 商品ID
     */
    private Long spuId;
    /**
     * 属性ID
     */
    private Long attributeId;
    /**
     * 属性名称
     */
    private String name;

    /**
     * 属性值
     */
    private String value;
    /**
     * 属性类型(1:规格;2:属性;)
     */
    private Integer type;

    /**
     * 规格图片地址
     */
    private String picUrl;

}
