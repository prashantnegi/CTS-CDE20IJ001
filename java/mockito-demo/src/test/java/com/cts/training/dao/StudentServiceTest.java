package com.cts.training.dao;

import com.cts.training.model.Student;
import com.cts.training.service.StudentService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import java.time.LocalDate;

@RunWith(MockitoJUnitRunner.class)
public class StudentServiceTest {

    @Mock
    private StudentDaoImpl studentDao;

    @Mock
    private StudentService studentService ;

    @Before
    public void setUp(){
        studentService.setStudentDao(studentDao);
    }

    @Test
    public void test_find_student_by_id(){

        Student s = new Student(1,"Ashish S", "ashish.s", LocalDate.now());

        when(studentService.findStudentById(1)).thenReturn(s);

        Student retStudent = studentService.findStudentById(1);
        assertEquals("Checking if name is same.","Ashish S",
                retStudent.getName());

    }
}
