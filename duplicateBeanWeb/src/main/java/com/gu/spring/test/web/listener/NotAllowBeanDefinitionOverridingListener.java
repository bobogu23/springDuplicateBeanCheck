package com.gu.spring.test.web.listener;

import org.springframework.web.context.ConfigurableWebApplicationContext;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * 上下文加载监听器指定上下文参数，不允许bean 定义覆盖
 * @author:ben.gu
 * @Date:2018/10/14 下午10:32
 */
public class NotAllowBeanDefinitionOverridingListener extends ContextLoaderListener {
    @Override protected void customizeContext(javax.servlet.ServletContext sc,
            ConfigurableWebApplicationContext wac) {
        super.customizeContext(sc, wac);

        XmlWebApplicationContext xmlWebApplicationContext = (XmlWebApplicationContext) wac;
        xmlWebApplicationContext.setAllowBeanDefinitionOverriding(false);
    }
}
