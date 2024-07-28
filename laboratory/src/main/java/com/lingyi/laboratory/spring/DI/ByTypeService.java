package com.lingyi.laboratory.spring.DI;

import com.lingyi.laboratory.spring.Bean;

/**
 *
 * 通过属性类型装配
 * @author Yixiaoyi03
 * @Date 2022/2/19 0019 17:50
 */
public class ByTypeService {

    public Bean bean;

    @Override
    public String toString() {
        return "ByDefaultService{" +
                "bean=" + bean +
                '}';
    }

    //需要提供set方法，且命名为setXxx
    public void setBean(Bean bean) {
        this.bean = bean;
    }

}
