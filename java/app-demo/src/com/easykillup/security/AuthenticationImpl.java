package com.easykillup.security;

import com.easykillup.model.Student;

import java.security.Principal;

public class AuthenticationImpl implements Authenticaton<Student> {


    @Override
    public Principal authenticate(Student obj) {
        return null;
    }

    @Override
    public Principal authorize(Student s) {
        return null;
    }
}
