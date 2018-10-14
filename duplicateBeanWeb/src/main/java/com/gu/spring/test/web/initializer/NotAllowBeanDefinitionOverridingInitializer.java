package com.gu.spring.test.web.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * 使用上下文初始化参数指定是否允许bean 定义被覆盖
 * @author:ben.gu
 * @Date:2018/10/14 下午10:46
 */
public class NotAllowBeanDefinitionOverridingInitializer
        implements ApplicationContextInitializer<XmlWebApplicationContext> {

    @Override public void initialize(XmlWebApplicationContext applicationContext) {
        applicationContext.setAllowBeanDefinitionOverriding(false);
    }
}
