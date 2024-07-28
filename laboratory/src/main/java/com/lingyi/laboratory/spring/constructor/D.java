package com.lingyi.laboratory.spring.constructor;

/**
 * 说明描述
 *
 * @author Yixiaoyi03
 * @Date 2022-03-15 11:59
 */
public class D {

    public static D create(){
        System.out.println("factory");
        return new D();
    }

}
