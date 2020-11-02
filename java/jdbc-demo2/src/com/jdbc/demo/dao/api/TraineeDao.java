package com.jdbc.demo.dao.api;

import com.jdbc.demo.dao.model.Trainee;
import com.jdbc.demo.dao.util.ConnectionManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class TraineeDao implements GenericDao<Trainee> {

    @Override
    public Optional<Trainee> get(Integer id) throws SQLException {
        Trainee trainee = null;
        try (Connection con = ConnectionManager.getConnection()) {
            String sql = "select * from trainee where id = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                trainee = new Trainee(resultSet.getInt(1), resultSet.getString(2),
                        resultSet.getString(3), resultSet.getString(4));
            }
        }
        return Optional.ofNullable(trainee);
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
        int updated = 0;
        try (Connection con = ConnectionManager.getConnection()) {

            String sql = "insert into trainee (first_name, last_name, join_year) values (?, ?, ?)";
            PreparedStatement statement = con.prepareStatement(sql);

//            statement.setInt(1, trainee.getId());
            statement.setString(1, trainee.getFirstName());
            statement.setString(2, trainee.getLastName());
            statement.setString(3, trainee.getYear());

            updated = statement.executeUpdate();
        }
        return updated;
    }

    @Override
    public int update(Trainee trainee, String[] params) throws SQLException {
        int updated = 0;
        try (Connection con = ConnectionManager.getConnection()) {
            String sql = "update trainee set first_name = ?," +
                            "last_name = ?, join_year = ? " +
                            "where id= ?";
            trainee.setFirstName(Objects.requireNonNull(params[0], "First name cannot be empty."));
            trainee.setLastName(Objects.requireNonNull(params[1], "Last name cannot be empty."));
            trainee.setYear(Objects.requireNonNull(params[3], "Join year cannot be empty."));

            PreparedStatement statement = con.prepareStatement(sql);

            statement.setString(1, trainee.getFirstName());
            statement.setString(2, trainee.getLastName());
            statement.setString(3, trainee.getYear());

            updated = statement.executeUpdate();
        }
        return updated;
    }

    @Override
    public int delete(Trainee trainee) {
        return 0;
    }
}
