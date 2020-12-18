package com.cts.training.dao;

import com.cts.training.model.Student;

import java.sql.SQLException;
import java.util.Optional;

public interface StudentDao {

    int create(Student student) throws SQLException;

     Optional<Student> readOne(int id) throws SQLException;
}
