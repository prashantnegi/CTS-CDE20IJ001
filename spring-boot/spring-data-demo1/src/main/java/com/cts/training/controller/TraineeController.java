package com.cts.training.controller;

import java.util.List;

import com.cts.training.entity.Trainee;
import com.cts.training.repo.TraineeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TraineeController {

    @Autowired
    private TraineeRepository traineeRepo;

    @PostMapping("/trainees")
    public Trainee create(@RequestBody Trainee t){
        return traineeRepo.save(t);
    }

    @GetMapping("/trainees")
    public List<Trainee> findAll(){
        return traineeRepo.findAll();
    }
    
}
