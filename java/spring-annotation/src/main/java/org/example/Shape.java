package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class Shape {

    @Autowired
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw();

}
