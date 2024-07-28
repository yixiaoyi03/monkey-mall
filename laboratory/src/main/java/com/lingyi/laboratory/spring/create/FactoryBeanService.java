package com.lingyi.laboratory.spring.create;

import com.lingyi.laboratory.spring.Bean;

/**
 * 说明描述
 * 实例工厂方法实例化bean
 * @author Yixiaoyi03
 * @Date 2022/2/19 0019 0:07
 */
public class FactoryBeanService {
    private static Bean bean = new Bean();
    private FactoryBeanService() {}

    public Bean createInstance() {
        System.out.println("实例工厂方法实例化bean");
        return bean;
    }
}
