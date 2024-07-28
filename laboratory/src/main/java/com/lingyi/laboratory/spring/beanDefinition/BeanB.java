package com.lingyi.laboratory.spring.beanDefinition;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * 说明描述
 *
 * @author Yixiaoyi03
 * @Date 2022/2/18 0018 20:50
 */
public class BeanB implements InitializingBean, DisposableBean {

    @Override
    public void destroy(){
        System.out.println("生命周期回调方法，在bean被销毁时调用");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("生命周期回调方法，在bean完成属性注入后调用");
    }
}
