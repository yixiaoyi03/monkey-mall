package com.lingyi.mall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lingyi.common.web.model.Option;
import com.lingyi.mall.pms.pojo.entity.PmsCategory;
import com.lingyi.mall.pms.pojo.vo.CategoryVO;

import java.util.List;


/**
 * 商品分类
 *
 * @author Yixiaoyi03
 */
public interface CategoryService extends IService<PmsCategory> {


    /**
     * 分类列表（树形）
     *
     * @param parentId
     * @return
     */
    List<CategoryVO> listCategory(Long parentId);

    /**
     * 分类列表（级联）
     * @return
     */
    List<Option> listCategoryOptions();


    /**
     *
     * 保存（新增/修改）分类
     *
     *
     * @param category
     * @return
     */
    Long saveCategory(PmsCategory category);

}
