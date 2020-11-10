package com.jdbc.demo;

import com.jdbc.demo.dao.api.GenericDao;
import com.jdbc.demo.dao.api.TraineeDao;
import com.jdbc.demo.dao.exception.NoTraineeFoundException;
import com.jdbc.demo.dao.model.Trainee;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException, NoTraineeFoundException {
//
//        Trainee t = new Trainee("Aakash", "Nanda", "2020");
//
//        GenericDao<Trainee> dao = new TraineeDao();
//
//        try {
////            System.out.println(dao.save(t));
//            t = dao.get(2).orElseThrow(() -> new NoTraineeFoundException("Cannot find the trainee"));
//
//            System.out.println(dao.update(t, new String[] {"Aakash", "Kumar", t.getYear()}));
//
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//
//        dao.getAll().forEach(System.out::println);

        Trainee t = new Trainee("Ravi", "Kumar", "2019");

        GenericDao<Trainee> tDao = new TraineeDao();

        System.out.println(tDao.save(t) + " rows inserted.");

        tDao.getAll().forEach(System.out::println);
    }
}
