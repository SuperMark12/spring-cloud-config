package com.cloud.spring.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @author: Administrator
 * @date: 2019/10/17
 * @modified by:
 * @modified date:
 * @problem no:
 */
@RestController
@RefreshScope
public class Test {

    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/getValue")
    public String getValue() {
        return foo;
    }
}
