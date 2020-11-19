package com.cts.training;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class Shape {

    @Autowired
    protected Color color;

    public abstract void draw();
}
