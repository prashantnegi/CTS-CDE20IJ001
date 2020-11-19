package com.cts.training.service;

import com.cts.training.dao.CustomerDao;
import com.cts.training.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerDao customerDao;

    @Override
    @Transactional
    public int addCustomer(Customer customer) {
        return customerDao.insert(customer);
    }

    @Override
    public List<Customer> fetchAllCustomers() {
        return customerDao.findAll();
    }

    @Override
    public Customer findCustomerByid(int id) {
        return customerDao.findById(id);
    }
}
