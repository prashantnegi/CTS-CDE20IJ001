package com.cts.training;

import com.cts.training.config.AppConfig;
import com.cts.training.model.Student;
import com.cts.training.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;

@Slf4j
public class Application {

    public static void main(String[] args) {

        log.info("App starting....");

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Student s = new Student(1, "Ashish S", "ashish.s", LocalDate.now());

        StudentService service = context.getBean(StudentService.class);

        try {
//            int result = service.registerStudent(s);
//            log.info("Student registered: " + result);

            service.findAllStudents().forEach(System.out::println);
        } catch (Exception ex) {
            log.error("Exception while registering student, ", ex);
        }

    }
}
