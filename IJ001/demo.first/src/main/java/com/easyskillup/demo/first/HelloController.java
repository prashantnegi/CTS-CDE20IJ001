package com.easyskillup.demo.first;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/hello/{name}")
    public String welcome(@PathVariable String name){
        return "Welcome to Spring Boot " + name + "." ;
    }
    

    @GetMapping(value = "/greet")
    public String greet(@RequestParam String name){
        return "Welcome to Spring Boot " + name + "." ;
    }
}


