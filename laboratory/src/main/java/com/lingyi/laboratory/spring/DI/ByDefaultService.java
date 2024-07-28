package com.lingyi.laboratory.spring.DI;

import com.lingyi.laboratory.spring.Bean;

/**
 *
 * 演示默认装配（no）
 * @author Yixiaoyi03
 * @Date 2022/2/19 0019 17:50
 */
public class ByDefaultService {

    public Bean bean;

    @Override
    public String toString() {
        return "ByDefaultService{" +
                "bean=" + bean +
                '}';
    }


}
