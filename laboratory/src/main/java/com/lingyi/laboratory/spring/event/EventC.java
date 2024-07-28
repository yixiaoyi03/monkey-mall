package com.lingyi.laboratory.spring.event;

/**
 * 说明描述
 *
 * @author Yixiaoyi03
 * @Date 2022/3/22 0022 20:38
 */

public class EventC {

    String name;

    public EventC(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EventC{" +
                "name='" + name + '\'' +
                '}';
    }
}
