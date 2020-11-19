package com.cts.training;

import com.cts.training.model.Customer;
import com.cts.training.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;

@Slf4j
public class Application {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Customer customer =
                new Customer(2, "Rahul R", "rahul.r", "password.123", LocalDate.now());

        try {
            CustomerService customerService = context.getBean(CustomerService.class);
//            log.info("Customer Inserted " + customerService.addCustomer(customer));
            customerService.fetchAllCustomers().forEach(c -> log.info(c.toString()));
            log.info(customerService.findCustomerByid(2).toString());
        } catch (Exception ex) {

            log.error("Failed to execute with error " + ex.getMessage());
        }
    }
}
