package org.example.dao;

import org.example.model.Trainee;

import java.util.List;

public interface TraineeDao {

    void registerTrainee(String cohort, Trainee trainee);

    void removeTrainee(String cohort, Trainee trainee);

    Trainee findByName(String cohort, String fullName);

    List<Trainee> findAll(String cohort);
}
