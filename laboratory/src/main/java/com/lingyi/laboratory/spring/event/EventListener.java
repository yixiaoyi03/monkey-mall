package com.lingyi.laboratory.spring.event;

import org.springframework.context.ApplicationListener;

/**
 * 事件A监听器
 *
 * @author Yixiaoyi03
 * @Date 2022/3/22 0022 20:16
 */
public class EventListener implements ApplicationListener<EventA> {
    @Override
    public void onApplicationEvent(EventA event) {
        System.out.println("接收到事件: "+event.getSource());
        System.out.println("处理事件");
    }
}
