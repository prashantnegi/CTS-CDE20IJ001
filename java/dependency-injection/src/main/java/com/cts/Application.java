package com.cts;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("beans.xml");

        Drawing d = context.getBean("drawSquare", Drawing.class);
        d.draw();

    }
}
