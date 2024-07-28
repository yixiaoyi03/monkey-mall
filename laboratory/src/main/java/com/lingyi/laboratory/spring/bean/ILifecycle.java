package com.lingyi.laboratory.spring.bean;

import org.springframework.context.Lifecycle;

/**
 *  容器生命周期回调,必须容器显示调用strat方法启动
 *
 * @author Yixiaoyi03
 * @Date 2022/3/20 0020 16:06
 */
public class ILifecycle implements Lifecycle {

    boolean isRunning;

    @Override
    public void start() {
        isRunning = true;
        System.out.println("容器开始启动");
    }

    @Override
    public void stop() {
           isRunning = false;
        System.out.println("容器结束");
    }

    @Override
    public boolean isRunning() {
        return isRunning;
    }
}
