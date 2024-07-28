package com.lingyi.laboratory.spring.DI;

import com.lingyi.laboratory.spring.Bean;

/**
 *
 *通过属性名称装配，需要提供set方法，且符合命名规范
 * @author Yixiaoyi03
 * @Date 2022/2/19 0019 17:50
 */
public class ByNameService {


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
