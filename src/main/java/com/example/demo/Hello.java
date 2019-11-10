package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("redconsole")
public class Hello {

    @GetMapping("/hello")
    public String test(){
        return "Hello EC2 Hello again";
    }

    @GetMapping("/beanstalk")
    public String hello(){
        return "BeansTalk Testing going on";
    }
}
