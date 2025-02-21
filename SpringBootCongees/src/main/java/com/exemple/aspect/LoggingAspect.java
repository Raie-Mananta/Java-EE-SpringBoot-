package com.exemple.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggingAspect {

    @Pointcut("execution(* com.exemple.service.*.*(..))")
    public void serviceMethods() {}

    @Before("serviceMethods()")
    public void beforeMethod(JoinPoint joinPoint) {
        log.info("Début d'exécution de : {} avec les arguments : {}",
                joinPoint.getSignature().toShortString(),
                joinPoint.getArgs());
    }

    @AfterReturning(pointcut = "serviceMethods()", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        log.info("Fin d'exécution de : {} avec le retour : {}",
                joinPoint.getSignature().toShortString(),
                result);
    }

    @AfterThrowing(pointcut = "serviceMethods()", throwing = "exception")
    public void afterThrowing(JoinPoint joinPoint, Throwable exception) {
        log.error("Exception dans : {} avec le message : {}",
                joinPoint.getSignature().toShortString(),
                exception.getMessage());
    }
}
