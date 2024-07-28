package com.lingyi.laboratory.spring.event;

import org.springframework.context.event.EventListener;

/**
 * 说明描述
 *
 * @author Yixiaoyi03
 * @Date 2022/3/22 0022 20:27
 */
public class ListenerB {

    @EventListener
    public void listen(EventB eventB){
        System.out.println("接收到事件:"+eventB);
        System.out.println("处理事件");
    }
}
