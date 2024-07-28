package com.lingyi.laboratory.spring.beanPostProcessor;

/**
 *
 * 需要注入的bean
 * @author Yixiaoyi03
 * @Date 2022/3/19 0019 19:12
 */
public class Bean{

    private IBeanPostProcessor IBeanPostProcessor;

    public Bean(IBeanPostProcessor IBeanPostProcessor) {
        this.IBeanPostProcessor = IBeanPostProcessor;
        System.out.println("4---实例化Bean");
    }

}
