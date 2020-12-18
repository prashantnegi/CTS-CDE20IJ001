package com.cts.training.service;

import com.cts.training.repository.StudentDao;
import com.cts.training.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class StudentServiceImpl implements  StudentService{

    @Autowired
    private StudentDao studentDao;

    @Override
    @Transactional
    public int registerStudent(Student student) {
        log.info("Service - inside registerStudent() in " + this.getClass().getName());
        return studentDao.create(student);
    }

    @Override
    public List<Student> findAllStudents() {
        log.info("Service - inside findAllStudents() in " + this.getClass().getName());
        return studentDao.readAll();
    }
}
