package com.jdbc.demo.dao.api;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface GenericDao<T> {

    Optional<T> get(Integer id) throws SQLException;

    List<T> getAll() throws SQLException;

    int save(T t) throws SQLException;

    int[] saveBatch(List<T> t) throws SQLException;

    int update(T t, String[] params) throws SQLException;

    int delete(T t);
}
