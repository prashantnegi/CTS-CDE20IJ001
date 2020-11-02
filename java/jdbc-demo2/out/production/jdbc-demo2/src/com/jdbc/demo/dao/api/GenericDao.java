package com.jdbc.demo.dao.api;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface GenericDao<T> {

    Optional<T> get(Integer id);

    List<T> getAll() throws SQLException;

    int save(T t) throws SQLException;

    void update(T t, String[] params);

    void delete(T t);
}
