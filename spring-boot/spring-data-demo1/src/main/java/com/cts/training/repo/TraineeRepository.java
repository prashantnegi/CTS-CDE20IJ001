package com.cts.training.repo;

import com.cts.training.entity.Trainee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TraineeRepository extends JpaRepository<Trainee, Integer>{
    
}
