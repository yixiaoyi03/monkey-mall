package com.lingyi.laboratory.spring.beanPostProcessor;

import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 *
 * 合并beanDefinition的回调
 * @author Yixiaoyi03
 * @Date 2022/3/19 0019 22:23
 */
public class IMergedBeanDefinitionPostProcessor implements MergedBeanDefinitionPostProcessor {
    @Override
    public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
        System.out.println("5---找出所需要注入的字段,同时做缓存"+beanName);
    }

    @Override
    public void resetBeanDefinition(String beanName) {
        System.out.println("BeanDefinition被修改后的回调,清楚容器中的缓存"+beanName);
    }
}
