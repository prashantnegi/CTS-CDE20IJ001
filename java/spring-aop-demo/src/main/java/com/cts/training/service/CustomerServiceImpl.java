package com.cts.training.service;

import com.cts.training.aspect.LogAspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    private Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);

    @Override
    public void addCustomer() {
        logger.trace("Customer added.");
    }

    @Override
    public String addCustomerReturnValue() {
        logger.trace("adding a customer with name Ashish");return "Ashish";
    }

    @Override
    public void addCustomerThrowException() throws Exception {
        logger.info("inside the exception method.");
        throw new RuntimeException("Some dummy exception.");
    }

    @Override
    public void addCustomerAround(String name) {
        logger.info("Aroung advice will be invoked on this method");
    }

    @Override
    public void deleteCustomer() {
        logger.warn("Deleting customer");
    }

    @Override
    public void removeAll() {
        logger.warn("Removing all customer");
    }
}
