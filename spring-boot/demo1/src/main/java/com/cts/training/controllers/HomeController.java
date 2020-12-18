package com.cts.training.controllers;

import com.cts.training.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class HomeController {

    static List<User> users = new ArrayList<>();

    {
        users.add(new User(1, "Ashish"));
        users.add(new User(2, "Rahul"));
        users.add(new User(3, "Ajay"));
    }


    @GetMapping("/home/{name}/{id}")
    public String home(@PathVariable("name") String name, @PathVariable("id") int id) {
        return "Welcome home " + name + ", your id is " + id;
    }

    @GetMapping("/all")
    public List<User> users(){
        return users;
    }
}
