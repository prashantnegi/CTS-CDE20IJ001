package org.example.repository;

import org.example.model.Trainee;

import java.util.List;

public interface TraineeRepo {

    void registerTrainee(String cohort, Trainee trainee);

    void removeTrainee(String cohort, Trainee trainee);

    Trainee findByName(String cohort, String fullName);

    List<Trainee> findAll(String cohort);
}
