package com.cts.training.service;

import com.cts.training.dao.StudentDao;
import com.cts.training.model.Student;

import java.sql.SQLException;

public class StudentService {

    private StudentDao studentDao;

    public StudentService(StudentDao studentDao){
        this.setStudentDao(studentDao);
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public Student findStudentById(int id){
        Student student = null;
        try {
            student = studentDao.readOne(id).get();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return student;
    }
}
