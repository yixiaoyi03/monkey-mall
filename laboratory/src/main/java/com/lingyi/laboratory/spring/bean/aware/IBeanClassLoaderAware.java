package com.lingyi.laboratory.spring.bean.aware;

import org.springframework.beans.factory.BeanClassLoaderAware;

/**
 * 获取bean的类加载器
 *
 * @author Yixiaoyi03
 * @Date 2022/3/20 0020 19:30
 */
public class IBeanClassLoaderAware implements BeanClassLoaderAware {

    private ClassLoader classLoader;
    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("类加载器:"+classLoader);
        this.classLoader= classLoader;
    }
}
