package com.lingyi.laboratory.spring.aop;

import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 说明描述
 *
 * @author Yixiaoyi03
 * @Date 2022/3/26 0026 0:24
 */
@Configuration
public class MyDefaultAdvisorAutoProxyCreator {

    @Bean
    public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator(){
        return new DefaultAdvisorAutoProxyCreator();

    }
}
