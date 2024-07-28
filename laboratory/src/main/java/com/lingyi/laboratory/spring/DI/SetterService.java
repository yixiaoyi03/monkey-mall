package com.lingyi.laboratory.spring.DI;

import com.lingyi.laboratory.spring.Bean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 演示通过set方法注入
 *
 * @author Yixiaoyi03
 * @Date 2022/2/18 0018 20:48
 */
@Slf4j
@Component
public class SetterService {
     private Bean bean;

     public SetterService(){
         System.out.println("service create");
     }
     public void test(){
         System.out.println(bean);
     }

     //通过autowired指定使用set方法完成注入
     @Autowired
    public void setDiSetterBean(Bean bean) {
         System.out.println("通过autowired指定使用set方法完成注入");
        this.bean = bean;
    }
}
