package com.cts;

public class Circle extends Shape{

    @Override
    public void draw(){
        System.out.println("This is a circle and the color is "
                + color.getColor() + ".");
    }
}
