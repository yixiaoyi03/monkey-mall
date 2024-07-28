package com.lingyi.laboratory.spring.constructor;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * 多个@Autowired标注的构造器
 * @author Yixiaoyi03
 * @Date 2022-03-15 14:56
 */
public class E {

    private String name;
    private A a;

    @Autowired(required = false)
    public E(String name, A a) {
        this.name = name;
        this.a = a;
        System.out.println("一个参数A和参数name");
    }

    @Autowired(required = false)
    public E(A a) {
        this.a = a;
        System.out.println("一个参数A构造器");
    }

    public E() {
        System.out.println("无参");
    }
}
