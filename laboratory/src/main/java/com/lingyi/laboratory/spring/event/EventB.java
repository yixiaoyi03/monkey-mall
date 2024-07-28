package com.lingyi.laboratory.spring.event;

/**
 * 说明描述
 *
 * @author Yixiaoyi03
 * @Date 2022/3/22 0022 20:26
 */
public class EventB {
    String name;

    public EventB(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EventB{" +
                "name='" + name + '\'' +
                '}';
    }
}
