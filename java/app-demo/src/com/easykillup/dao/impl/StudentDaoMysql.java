package com.easykillup.dao.impl;

import com.easykillup.dao.GenericDao;
import com.easykillup.model.Student;

import java.util.List;

public class StudentDaoMysql implements GenericDao<Student> {
    @Override
    public void create(Student obj) {
        System.out.println("CREATE: " + obj);
    }

    @Override
    public void update(Student obj) {

    }

    @Override
    public void delete(Student obj) {

    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student findOne(Object key) {
        return null;
    }
}
