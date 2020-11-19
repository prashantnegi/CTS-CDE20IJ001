package com.cts.training.service;

public interface CustomerService {

    void addCustomer();

    String addCustomerReturnValue();

    void addCustomerThrowException() throws Exception;

    void addCustomerAround(String name);

    void deleteCustomer();

    void removeAll();
}
