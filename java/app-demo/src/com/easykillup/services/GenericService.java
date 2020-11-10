package com.easykillup.services;

import java.security.Principal;
import java.util.List;

public interface GenericService<T>{

    void create(T obj);

    void update(T obj);

    void delete(T obj);

    List<T> findAll();

    T findOne(Object key);

    Principal authenticate(T obj);

    Principal authorize(T s);

}
