package com.lingyi.laboratory.spring.beanDefinition;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 *
 * 注册user开头的标签解析器
 * @author Yixiaoyi03
 * @Date 2022/3/5 0005 14:28
 */
public class UserNamespaceHandler extends NamespaceHandlerSupport {
	@Override
	public void init() {
		registerBeanDefinitionParser("user",new UserBeanDefinitionParser());
	}
}
