package com.cts;

public class Drawing {

    private Shape shape;

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void draw(){
        System.out.println("Drawing class");
        this.shape.draw();
    }
}
