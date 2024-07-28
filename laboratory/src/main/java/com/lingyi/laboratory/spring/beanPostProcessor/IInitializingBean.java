package com.lingyi.laboratory.spring.beanPostProcessor;

import org.springframework.beans.factory.InitializingBean;

/**
 *  初始化bean的回调
 * @author Yixiaoyi03
 * @Date 2022/3/19 0019 22:47
 */
public class IInitializingBean implements InitializingBean {
    public IInitializingBean() {
        System.out.println("实例化IInitializingBean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("属性注入之后");
    }
}
