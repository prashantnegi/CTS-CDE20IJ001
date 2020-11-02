package com.easyskillup.demo.first;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    

    private static List<User> users = new ArrayList<>();


    @PostMapping("/users")
    public User create(@RequestBody User user){
        users.add(user);
        return user;
    }

    @GetMapping("/users")
    public List<User> findAll(){
        return users;
    }
   
}
