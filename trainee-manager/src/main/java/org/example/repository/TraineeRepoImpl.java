package org.example.repository;

import org.example.model.Trainee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TraineeRepoImpl implements TraineeRepo{

    private Map<String, List<Trainee>> traineeDataSource = new HashMap<>();

    @Override
    public void registerTrainee(String cohort, Trainee trainee) {

    }

    @Override
    public void removeTrainee(String cohort, Trainee trainee) {

    }

    @Override
    public Trainee findByName(String cohort, String fullName) {
        return null;
    }

    @Override
    public List<Trainee> findAll(String cohort) {
        return null;
    }
}
