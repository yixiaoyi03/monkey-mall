package com.lingyi.laboratory.spring.look.constructors;

/**
 * 构造器注入的bean
 * @author Yixiaoyi03
 * @Date 2022-03-09 10:28
 */
//@Component
public class A1 {

    private B1 b1;

    public A1(B1 b1) {
        this.b1 = b1;
    }
}
