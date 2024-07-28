package com.lingyi.laboratory.spring.aop;

import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 通过名称设置自动代理
 *
 * @author Yixiaoyi03
 * @Date 2022/3/25 0025 23:52
 */
@Configuration
public class MyBeanNameAutoProxyCreator {

    @Bean
    public BeanNameAutoProxyCreator creator(){
        BeanNameAutoProxyCreator beanNameAutoProxyCreator = new BeanNameAutoProxyCreator();
        beanNameAutoProxyCreator.setBeanNames("userService");
        beanNameAutoProxyCreator.setInterceptorNames("myAdvisor");
        return beanNameAutoProxyCreator;
    }
}
