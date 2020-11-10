package com.easykillup.services;

import com.easykillup.dao.GenericDao;
import com.easykillup.dao.impl.StudentDaoMysql;
import com.easykillup.dao.impl.StudentDaoOracle;
import com.easykillup.model.Student;
import com.easykillup.security.AuthenticationImpl;
import com.easykillup.security.Authenticaton;

import java.security.Principal;
import java.util.List;

public class StudentService implements GenericService<Student> {

    private GenericDao<Student> studentDao = new StudentDaoMysql();;

    private Authenticaton<Student> studentAuthenticaton = new AuthenticationImpl();

    public StudentService(){

    }

    @Override
    public void create(Student obj) {
        studentDao.create(obj);
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

    @Override
    public Principal authenticate(Student obj) {
        return null;
    }

    @Override
    public Principal authorize(Student s) {
        return null;
    }
}
