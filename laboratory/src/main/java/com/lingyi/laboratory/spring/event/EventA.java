package com.lingyi.laboratory.spring.event;

import org.springframework.context.ApplicationEvent;

/**
 * 事件A
 *
 * @author Yixiaoyi03
 * @Date 2022/3/22 0022 20:14
 */
public class EventA extends ApplicationEvent {
    public EventA(Object source) {
        super(source);
    }
}
