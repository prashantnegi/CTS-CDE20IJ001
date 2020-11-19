package com.cts.training;

import com.cts.training.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfiguration.class);

        StudentController controller =  context.getBean(StudentController.class);
        Student s = new Student("1", "Ashish", "ashish.s");
        controller.createStudent(s);

        Paint p = context.getBean(Paint.class);
        p.render();

    }
}
