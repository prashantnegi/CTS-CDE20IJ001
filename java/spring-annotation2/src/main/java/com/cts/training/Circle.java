package com.cts.training;

import org.springframework.stereotype.Component;

@Component("circle")
public class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("This is a circle with color "
                + color.getColor() + ".");
    }
}
