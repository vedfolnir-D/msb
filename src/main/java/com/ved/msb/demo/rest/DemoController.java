package com.ved.msb.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ved.msb.util.RedisUtil;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/demo")
public class DemoController {

    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping("first")
    public String getString() {
        log.info("get a request");
        redisUtil.set("testKey", "testKey");
        return "first interface";
    }
}
