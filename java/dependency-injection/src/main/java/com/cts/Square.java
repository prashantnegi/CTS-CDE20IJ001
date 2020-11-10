package com.cts;

public class Square extends Shape{

    @Override
    public void draw(){
        System.out.println("This is a square with color "
                + color.getColor() + ".");
    }
}
