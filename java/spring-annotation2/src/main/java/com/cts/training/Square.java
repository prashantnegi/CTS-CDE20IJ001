package com.cts.training;

import org.springframework.stereotype.Component;

@Component("square")
public class Square extends  Shape{
    @Override
    public void draw() {
        System.out.println("This is a square with color "
                + color.getColor() + ".");
    }
}
