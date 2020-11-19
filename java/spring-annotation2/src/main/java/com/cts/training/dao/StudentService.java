package com.cts.training.dao;

import com.cts.training.model.Student;
import org.springframework.stereotype.Service;


public interface StudentService {

    void create(Student s);

    void findAll();
}
