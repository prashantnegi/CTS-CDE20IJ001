package com.cts.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.cts.training"})
public class AppConfiguration {

    @Autowired
    private Brush brush;

    @Bean
    public Brush getBrush(){
        return new Brush();
    }
    
    @Bean
    public Paint getRenderer(){
        return new Paint(brush);
    }
}
