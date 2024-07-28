package com.lingyi.mall.pms.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.lingyi.common.base.BaseEntity;
import lombok.Data;

import javax.validation.constraints.NotBlank;


@Data
public class PmsBrand extends BaseEntity {

    @TableId(type= IdType.AUTO)
    private Long id;

    @NotBlank
    private String name;

    private String logoUrl;

    private Integer sort;
}
