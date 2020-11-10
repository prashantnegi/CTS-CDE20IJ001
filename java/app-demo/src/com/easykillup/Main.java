package com.easykillup;

import com.easykillup.model.Student;
import com.easykillup.services.GenericService;
import com.easykillup.services.StudentService;

public class Main {

    public static void main(String[] args) {

        GenericService<Student> service = new StudentService();

        service.authenticate(null);
    }
}
