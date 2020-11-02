package com.jdbc.demo.dao.api;

import com.jdbc.demo.dao.model.Trainee;
import com.jdbc.demo.dao.util.ConnectionManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TraineeDao implements GenericDao<Trainee> {

    @Override
    public Optional<Trainee> get(Integer id) {
        return Optional.empty();
    }

    @Override
    public List<Trainee> getAll() throws SQLException {
        List<Trainee> trainees = new ArrayList<>();
        try (Connection con = ConnectionManager.getConnection()) {
            String sql = "select * from trainee";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                trainees.add(new Trainee(
                        resultSet.getInt(1), resultSet.getString(2),
                        resultSet.getString(3), resultSet.getString(4)
                ));
            }
        }
        return trainees;
    }

    @Override
    public int save(Trainee trainee) throws SQLException {
        int inserted = 0;
        try (Connection con = ConnectionManager.getConnection()) {

            String sql = "insert into trainee (first_name, last_name, join_year) values (?, ?, ?)";
            PreparedStatement statement = con.prepareStatement(sql);

//            statement.setInt(1, trainee.getId());
            statement.setString(1, trainee.getFirstName());
            statement.setString(2, trainee.getLastName());
            statement.setString(3, trainee.getYear());

            inserted = statement.executeUpdate();
        }
        return inserted;
    }

    @Override
    public void update(Trainee trainee, String[] params) {

    }

    @Override
    public void delete(Trainee trainee) {

    }
}
