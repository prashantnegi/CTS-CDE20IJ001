package com.easykillup.dao;

import java.util.List;

public interface GenericDao<T> {

    void create(T obj);

    void update(T obj);

    void delete(T obj);

    List<T> findAll();

    T findOne(Object key);

}
