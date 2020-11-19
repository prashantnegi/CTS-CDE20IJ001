package com.cts.training.dao;

import com.cts.training.model.Customer;

import java.util.List;

public interface CustomerDao {

    int insert(Customer c);

    List<Customer> findAll();

    Customer findById(int id);
}


