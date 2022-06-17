package com.wipro.BookAppFavorite.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("execution(* com.wipro.BookAppFavorite.Controller..*(..)))")
    public void beforeAllMethods(JoinPoint jp){
        logger.error("error");
    }

    @After("execution(* com.wipro.BookAppFavorite.Controller..*(..)))")
    public void afterAllMethods(JoinPoint jp){

    }
}
