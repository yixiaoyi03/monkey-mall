package com.lingyi.laboratory.spring.DI;

import com.lingyi.laboratory.spring.Bean;

/**
 * 通过构造器装配
 *
 * @author Yixiaoyi03
 * @Date 2022/2/18 0018 22:30
 */
public class ByConstructorService {

    private Bean bean;

    public ByConstructorService(Bean bean) {
        this.bean = bean;
    }

    public Bean getBean() {
        return bean;
    }
}
