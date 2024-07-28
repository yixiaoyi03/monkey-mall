package com.lingyi.laboratory.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 说明描述
 *
 * @author Yixiaoyi03
 * @Date 2022/3/20 0020 21:21
 */
public class IBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化后,开始代理对象");
        return bean;
    }

}
