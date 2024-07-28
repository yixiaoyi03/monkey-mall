package com.lingyi.laboratory.spring.constructor;

import java.util.function.Supplier;

/**
 * 说明描述
 *
 * @author Yixiaoyi03
 * @Date 2022-03-15 11:13
 */
public class C implements Supplier<C> {
    @Override
    public C get() {
        System.out.println("Supplier");
        return new C();
    }
}
