package com.lingyi.laboratory.spring.beanPostProcessor;

import org.springframework.beans.factory.DisposableBean;

/**
 *  销毁bean的回调
 *
 * @author Yixiaoyi03
 * @Date 2022/3/19 0019 22:50
 */
public class IDisposableBean implements DisposableBean {
    public IDisposableBean() {
        System.out.println("实例化IDisposableBean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("销毁bean回调");
    }
}
