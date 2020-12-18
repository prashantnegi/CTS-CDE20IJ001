package com.cts.training.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String index() {
        return "Hello from Spring boot.";
    }

    @ResponseBody
    @GetMapping(value = "/welcome")
    public String welcome(){
        return "Welcome from Spring boot demo application";
    }
}
