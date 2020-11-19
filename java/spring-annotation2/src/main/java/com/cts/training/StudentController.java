package com.cts.training;

import com.cts.training.dao.StudentService;
import com.cts.training.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentController {

    @Autowired
    private StudentService studentService;

    public void createStudent(Student s){
        studentService.create(s);
    }
}
