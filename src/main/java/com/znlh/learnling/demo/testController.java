package com.znlh.learnling.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    @RequestMapping(value = "hello")
    public String hello(){
        return  "hello,hello,hello,hello,hello";
    }
}
