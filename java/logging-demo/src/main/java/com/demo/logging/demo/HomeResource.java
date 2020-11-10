package com.demo.logging.demo;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HomeResource {

    @GetMapping("/")
    public String index(){
        log.info("/ of HumanResource");
        if(true){
            throw  new RuntimeException("Some dummy exception");
        }
        return "Hello from Spring boot.";
    }

    @ExceptionHandler(Exception.class)
    public void logException(Exception ex){
        log.error(ex.getMessage(), ex);
    }
}
