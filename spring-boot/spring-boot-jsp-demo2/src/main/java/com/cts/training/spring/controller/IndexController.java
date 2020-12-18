package com.cts.training.spring.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import com.cts.training.spring.model.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @GetMapping({ "/", "/index" })
    public String index(Model model,
            @RequestParam(value = "name", required = false, defaultValue = "user") 
            String name) {

        model.addAttribute("user", name);
        return "index";
    }


    @GetMapping("/register")
    public ModelAndView registerForm(){
       
        User user = new User();
        List<String> professions = Arrays.asList("Developer", "Designer", "Tester");

        ModelAndView modelAndView = new ModelAndView("register");

        modelAndView.addObject("user", user);
        modelAndView.addObject("profession", professions);

        return modelAndView;
    }

    @PostMapping("/register")
    public ModelAndView registerUser(@Valid @ModelAttribute("user") User user,
                                BindingResult bindingResult){
                                    
        ModelAndView modelAndView = new ModelAndView();
        List<String> professions = Arrays.asList("Developer", "Designer", "Tester");
        if (bindingResult.hasErrors()) {
            modelAndView.addObject("profession", professions);
            modelAndView.setViewName("register");
        } else {
            modelAndView.setViewName("confirm");
        }
        return modelAndView;
    }

}
