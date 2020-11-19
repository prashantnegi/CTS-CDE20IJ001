package com.cts.training.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggerAspect {

    @Pointcut("execution( * com.cts.training.dao.CustomerDao.*(..))")
    public void allDao(){}

    @Pointcut("execution( * com.cts.training.service.CustomerService.*(..))")
    public void allService(){}

    @Before("allDao() || allService()")
    public void logBefore(JoinPoint jp){
        log.info("Starting " + jp.getSignature().getName() + "()...");
    }

    @Before("allDao() || allService()")
    public void logAfter(JoinPoint jp){
        log.info("Completed " + jp.getSignature().getName() + "()...");
    }

    @AfterThrowing(pointcut = "allDao() || allService()", throwing = "exception")
    public void logAfterException(JoinPoint jp, Throwable exception){
        log.error("Excception in " + jp.getSignature().getName() + "()", exception);
    }

}
