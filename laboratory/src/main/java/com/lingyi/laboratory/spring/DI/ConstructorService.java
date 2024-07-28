package com.lingyi.laboratory.spring.DI;

import com.lingyi.laboratory.spring.Bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 通过构造器注入
 *
 * @author Yixiaoyi03
 * @Date 2022/2/18 0018 22:30
 */
@Component
public class ConstructorService {

    private Bean bean;

    @Autowired
    public ConstructorService(Bean bean) {
        System.out.println("constructorService create by constructor with arg");
        this.bean = bean;
        System.out.println("通过Autowired指定使用这个构造函数，否则默认会使用无参");
    }

    public void test(){
        System.out.println(bean);
    }

    public Bean getBean() {
        return bean;
    }
}
