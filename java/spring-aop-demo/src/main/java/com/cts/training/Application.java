package com.cts.training;

import com.cts.training.service.CustomerService;
import com.cts.training.service.CustomerServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args)  {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfiguration.class);

        CustomerService customerService = context.getBean(CustomerService.class);

        customerService.addCustomerAround("some name");

    }
}
