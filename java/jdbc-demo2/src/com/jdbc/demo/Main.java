package com.jdbc.demo;

import com.jdbc.demo.dao.api.GenericDao;

import com.mysql.cj.jdbc.Driver;

import com.jdbc.demo.dao.api.TraineeDao;
import com.jdbc.demo.dao.model.Trainee;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {

        Trainee t = new Trainee( "Aakash", "Nanda", "2020");

        GenericDao<Trainee> dao = new TraineeDao();

//        try {
//            System.out.println(dao.save(t));
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }

        dao.getAll().forEach(System.out::println);
    }
}
