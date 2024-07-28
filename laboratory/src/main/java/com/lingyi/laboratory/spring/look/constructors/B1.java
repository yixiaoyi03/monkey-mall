package com.lingyi.laboratory.spring.look.constructors;

/**
 * 构造器注入的bean
 *
 * @author Yixiaoyi03
 * @Date 2022-03-09 10:29
 */
//@Component
public class B1 {

    private A1 a1;

    public B1(A1 a1) {
        this.a1 = a1;
    }
}
