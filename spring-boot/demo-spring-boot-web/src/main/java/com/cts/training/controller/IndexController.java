package com.cts.training.controller;

import java.util.Arrays;
import java.util.List;

import com.cts.training.model.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class IndexController {

    @GetMapping(value = "/users")
    public List<User> users() {

        return Arrays.asList(new User(1, "ashish", "ashish.s"), new User(2, "mahima", "mahima.k"));

    }

    @GetMapping(value = "/")
    public String index() {

        return "Welcome from Spring boot";

    }

}
