package com.lingyi.laboratory.spring.look.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 说明描述
 *
 * @author Yixiaoyi03
 * @Date 2022-03-09 9:08
 */
@Component
public class B2 {
    private String username = "b";

    private A2 a2;

    public B2() {
        System.out.println("实例化B2:"+this);
    }

    @Autowired
    public void setA(A2 a2) {
        System.out.println("注入属性A2:"+a2);
        this.a2 = a2;
    }


}
