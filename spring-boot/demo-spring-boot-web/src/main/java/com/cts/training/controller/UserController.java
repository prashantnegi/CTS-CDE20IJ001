package com.cts.training.controller;

import java.util.Arrays;
import java.util.List;

import com.cts.training.model.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping(value = "/all")
    public @ResponseBody List<User> users() {
        return Arrays.asList(new User(1, "ashish", "ashish.s"), new User(2, "mahima", "mahima.k"));
    }

}
