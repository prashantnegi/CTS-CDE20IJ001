package com.cts.training.dao;

import com.cts.training.model.Student;
import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import java.sql.SQLException;
import java.util.Optional;

public class StudentDaoImplTest {

    public void test_create() {
    }

    @Test
    public void test_read_one() throws SQLException {
        StudentDao dao = new StudentDaoImpl();
        Optional<Student> student = dao.readOne(1);
        assertTrue(student.isPresent());
    }

    @Test
    public void test_read_one_with_no_id() throws SQLException {
        StudentDao dao = new StudentDaoImpl();
        Optional<Student> student = dao.readOne(0);
        assertTrue(student.isEmpty());
    }
}