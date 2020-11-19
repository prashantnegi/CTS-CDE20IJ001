package com.cts.training.service;

import com.cts.training.model.Customer;

import java.util.List;

public interface CustomerService {

    int addCustomer(Customer customer);

    List<Customer> fetchAllCustomers();

    Customer findCustomerByid(int id);

}
