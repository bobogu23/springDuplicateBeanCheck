package com.gu.spring.test.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author:ben.gu
 * @Date:2018/10/14 下午9:45
 */
public class A {
    private Logger logger= LoggerFactory.getLogger(getClass());

    public A() {
        logger.error("a initializing ...");
    }

}
