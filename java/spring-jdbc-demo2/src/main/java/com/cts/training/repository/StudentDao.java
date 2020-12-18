package com.cts.training.repository;

import com.cts.training.model.Student;

import java.util.List;

public interface StudentDao {

    int create(Student student);

    List<Student> readAll();
}
