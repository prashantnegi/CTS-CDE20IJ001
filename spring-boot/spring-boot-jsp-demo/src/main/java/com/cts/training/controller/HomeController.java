package com.cts.training.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import com.cts.training.model.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping({ "/", "/index" })
    public String index(Model model,
            @RequestParam(value = "name", required = false, defaultValue = "World") String name) {
        model.addAttribute("name", name);
        return "index";
    }

    @GetMapping("/register")
    public String registerPage(Model model) {
        User user = new User();
        List<String> professionList = Arrays.asList("Developer", "Designer", "Tester");
        model.addAttribute("user", user);
        model.addAttribute("professionList", professionList);
        return "register";
    }


    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("user") User user, BindingResult result){
        if(result.hasErrors())
            return "register";
        else
            return "confirm";
    }
}
