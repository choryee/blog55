package com.bit.blog55.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogTestController {


    @GetMapping("/test/hello")
    public String hello() {
        return "hello world!";
    }
}


