package com.cts;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        Shape circle = context.getBean(Circle.class);
        Shape square = context.getBean(Square.class);

        Drawing d = new Drawing();

        d.setShape(circle);
        d.draw();

        d.setShape(square);
        d.draw();


    }
}
