package com.easykillup.security;

import com.easykillup.model.Student;

import java.security.Principal;

public interface Authenticaton<T> {

    Principal authenticate(T obj);

    Principal authorize(T s);
}
