package com.example.baitapspring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // Use @Before to write log before execute any method.
    @Before("execution(* com.example.baitapspring.service.*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Logging before method: " + joinPoint.getSignature().getName());
    }
    // Use @AfterReturning to write log after execute any method.
    @AfterReturning("execution(* com.example.baitapspring.service.*.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("Logging after method: " + joinPoint.getSignature().getName());
    }
}
