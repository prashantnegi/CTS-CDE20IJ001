package com.cts.training.dao;

import com.cts.training.model.Student;
import org.springframework.stereotype.Service;


@Service
public class StudentServiceImpl implements StudentService {

    @Override
    public void create(Student s) {
        System.out.println("Created student " + s);
    }

    @Override
    public void findAll() {
        System.out.println("Finding all details of students.");
    }
}
