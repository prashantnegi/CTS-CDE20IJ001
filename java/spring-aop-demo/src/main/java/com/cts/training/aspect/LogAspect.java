package com.cts.training.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    private Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Pointcut("execution(* com.cts.training.service.CustomerService.add*(..))")
    public void lb(){}

    @Pointcut("execution(* com.cts.training.service.CustomerService.delete*(..))")
    public void dLog(){}

    @Before("lb() || dLog()")
    public void logBefore(JoinPoint jp) {
        logger.info("-----------------logBefore()-----------------------");
        logger.info("before executing " + jp.getSignature().getName());
        logger.info("---------------------------------------------------");
    }

    @After("execution(* com.cts.training.service.CustomerService.*(..))")
    public void logAfter(JoinPoint jp) {
        logger.info("-----------------logAfter()-----------------------");
        logger.info("after executing " + jp.getSignature().getName());
        logger.info("---------------------------------------------------");
    }

    @AfterReturning(
            pointcut = "execution(* com.cts.training.service.CustomerService.addCustomerReturnValue(..))",
            returning = "result")
    public void logAfterReturning(JoinPoint jp, Object result) {
        logger.trace("-----------------logAfterReturning()----------------");
        logger.info("after executing " + jp.getSignature().getName());
        logger.info("Method return value = " + result);
        logger.trace("---------------------------------------------------");
    }

    @AfterThrowing(
            pointcut = "execution(* com.cts.training.service.CustomerService.addCustomerThrowException(..))",
            throwing = "error")
    public void logAfterThrowing(JoinPoint jp, Throwable error) {

        logger.info("---------------------logAfterThrowing()---------------");
        logger.info("after executing " + jp.getSignature().getName());
        logger.error("Exception : ", error);
        logger.info("--------------------------------------------------------");

    }

    @Around("execution( * com.cts.training.service.CustomerService.addCustomerAround(..))")
    public void logAroud(ProceedingJoinPoint jp) throws Throwable{
        logger.info("Before the method: " + jp.getSignature().getName());
        jp.proceed();
        logger.info("After the method: " + jp.getSignature().getName());
    }

}
