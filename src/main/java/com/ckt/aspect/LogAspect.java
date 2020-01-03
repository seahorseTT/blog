package com.ckt.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    //定义一个切面
    @Pointcut("execution(* com.ckt.web.*.*(..))")
    public void log() {
    }

    @Before("log()")
    public void doBefore() {
        logger.info("==========doBefore=========");
    }

    @After("log()")
    public void doAfter() {
        logger.info("==========doAfter=========");
    }
}
