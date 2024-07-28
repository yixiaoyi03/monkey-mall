package com.lingyi.laboratory.spring;

import com.lingyi.laboratory.spring.DI.ConstructorService;
import com.lingyi.laboratory.spring.DI.SetterService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试两种注入方式(构造器和setter)
 *
 * @author Yixiaoyi03
 * @Date 2022/2/18 0018 21:04
 */
public class DITypeTests {


    @Test
    void setter(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.registerBean(Bean.class);
        applicationContext.registerBean(SetterService.class);
        applicationContext.refresh();
        SetterService setterService = applicationContext.getBean(SetterService.class);
        setterService.test();
    }

    @Test
    void constructor(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.registerBean(Bean.class);
        applicationContext.registerBean(ConstructorService.class);
        applicationContext.refresh();
        ConstructorService constructorService = applicationContext.getBean(ConstructorService.class);
        constructorService.test();
    }
}
