package com.ciel.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloApi {
    @RequestMapping("/msg")
    public String home(@RequestParam("name") String name){
        return "Hello " + name + ", this is the first msg";
    }
}
