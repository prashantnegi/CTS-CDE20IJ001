package com.cts.training.dao;

import com.cts.training.model.Student;
import com.cts.training.util.DataSourceManager;

import java.sql.*;
import java.util.Optional;

public class StudentDaoImpl implements StudentDao{
    @Override
    public int create(Student student) throws SQLException {

        int updated = 0;
        try (Connection con = DataSourceManager.getInstance().getConnection()) {
            String sql = "insert into students values (?, ?, ?, ?)";
            PreparedStatement statement = con.prepareStatement(sql);

            statement.setInt(1, student.getId());
            statement.setString(2, student.getName());
            statement.setString(3, student.getEmail());
            statement.setDate(4, Date.valueOf(student.getJoinDate()));

            updated = statement.executeUpdate();

            statement.close();
        }

        return updated;
    }

    @Override
    public Optional<Student> readOne(int id) throws SQLException {

        Student student = null;
        try (Connection con = DataSourceManager.getInstance().getConnection()) {
            String sql = "select * from students where id = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                student = new Student(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getDate(4).toLocalDate());
            }
            statement.close();
        }
        return Optional.ofNullable(student);
    }
}
