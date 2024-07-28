package com.lingyi.laboratory.spring.bean.aware;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

/**
 * 获取当前环境
 *
 * @author Yixiaoyi03
 * @Date 2022/3/20 0020 20:29
 */

public class IEnvironmentAware implements EnvironmentAware {

    private Environment environment;
    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
        System.out.println("\n--------------------");
        System.out.println("当前环境:"+environment);
        System.out.println("--------------------");
    }
}
