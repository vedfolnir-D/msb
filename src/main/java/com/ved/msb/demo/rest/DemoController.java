package com.ved.msb.demo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/demo")
public class DemoController {

    @RequestMapping("first")
    public String getString() {
        log.info("get a request");
        return "first interface";
    }
}
