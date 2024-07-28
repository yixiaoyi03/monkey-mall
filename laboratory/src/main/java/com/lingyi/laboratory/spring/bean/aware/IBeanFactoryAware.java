package com.lingyi.laboratory.spring.bean.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * 获取当前bean的beanFactory
 *
 * @author Yixiaoyi03
 * @Date 2022/3/20 0020 19:32
 */
public class IBeanFactoryAware implements BeanFactoryAware {
    private BeanFactory beanFactory;
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("当前beanFactory:"+beanFactory);
        this.beanFactory = beanFactory;
    }
}
