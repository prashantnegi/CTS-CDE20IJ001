package com.cts.training.service;

import com.cts.training.model.Student;

import java.util.List;

public interface StudentService {

    int registerStudent(Student student);

    List<Student> findAllStudents();
}
