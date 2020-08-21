package com.vectooor.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author vector
 * @date 2020/8/22 上午1:01
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping("world")
    public String world() {
        return "hello, world! Date=" + new Date();
    }

    @GetMapping("china")
    public String china() {
        return "hello, china! Date=" + new Date();
    }
}
