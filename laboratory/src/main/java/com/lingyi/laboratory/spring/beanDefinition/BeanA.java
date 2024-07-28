package com.lingyi.laboratory.spring.beanDefinition;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 说明描述
 *
 * @author Yixiaoyi03
 * @Date 2022/2/18 0018 20:50
 */
public class BeanA {


    @PreDestroy
    public void destroy(){
        System.out.println("生命周期回调方法，在bean被销毁时调用");
    }

    @PostConstruct
    public void afterPropertiesSet() {
        System.out.println("生命周期回调方法，在bean完成属性注入后调用");
    }
}
