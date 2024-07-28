package com.lingyi.laboratory.spring;

/**
 * @author Yixiaoyi03
 * @date 2021/11/28 10:06
 */
public interface Test {

    default void test(){
        System.out.println(this);
    };
}
