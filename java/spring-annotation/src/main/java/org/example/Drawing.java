package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Drawing {

    @Autowired
    @Qualifier("circle")
    private Shape shape;

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void draw(){
        System.out.println("Drawing class");
        this.shape.draw();
    }
}
