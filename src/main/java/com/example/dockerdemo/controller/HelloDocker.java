package com.example.dockerdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloDocker {

    static final Logger logger = LoggerFactory.getLogger(HelloDocker.class);


    @RequestMapping("/")
    public String home() {

        logger.debug("inside home()");
        return "Hello Docker !!!";
    }
}
