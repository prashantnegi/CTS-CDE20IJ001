package com.cts.training;

public class Paint {

    private Brush brush;

    public Paint(Brush brush){
        this.brush = brush;
    }

    public void render(){
        System.out.println("Render method of the Paint class using " + brush.getBrush());
    }
}
