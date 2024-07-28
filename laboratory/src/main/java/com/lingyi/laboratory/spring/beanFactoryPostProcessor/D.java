package com.lingyi.laboratory.spring.beanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 *
 *
 * @author Yixiaoyi03
 * @Date 2022/3/17 0017 22:03
 */

public class D implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("D------------BeanFactoryPostProcessor---postProcessBeanFactory----9");
    }

}
