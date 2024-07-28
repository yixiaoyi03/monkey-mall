package com.lingyi.laboratory.spring.bean;

import org.springframework.beans.factory.InitializingBean;

/**
 * 说明描述
 *
 * @author Yixiaoyi03
 * @Date 2022/3/20 0020 20:52
 */
public class IInitializingBean implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("初始化bean---InitializingBean");
    }
}
