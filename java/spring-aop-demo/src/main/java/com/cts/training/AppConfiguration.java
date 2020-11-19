package com.cts.training;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.cts.training"})
@EnableAspectJAutoProxy
public class AppConfiguration {
}
