package com.cts.training.repo;

import com.cts.training.entity.Trainer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainerRepository extends JpaRepository<Trainer, Integer>{
    
}
