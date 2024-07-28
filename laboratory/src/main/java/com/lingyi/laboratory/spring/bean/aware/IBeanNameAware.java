package com.lingyi.laboratory.spring.bean.aware;

import org.springframework.beans.factory.BeanNameAware;

/**
 *  获取bean的名字
 * @author Yixiaoyi03
 * @Date 2022/3/20 0020 19:25
 */
public class IBeanNameAware implements BeanNameAware {

    private String name;

    @Override
    public void setBeanName(String name) {
        System.out.println("bean的名字:"+name);
        this.name = name;
    }
}
