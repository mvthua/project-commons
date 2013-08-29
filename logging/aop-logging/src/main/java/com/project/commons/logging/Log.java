/*
 * Copyright (c) 2013.
 * All rights reserved.
 */
package com.project.commons.logging;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author mhua
 */
@Aspect
@Component
public class Log {

    /**
     * Monitor method that are annotated.
     */
    @Pointcut("@annotation(com.project.commons.logging.annotation.Loggable)")
    private void log() {
    }

    /**
     * @param joinPointParam
     */
    @Before("log()")
    public void before(JoinPoint joinPointParam) {
        final Logger log = LoggerFactory.getLogger(joinPointParam.getTarget().getClass().getName());

        // System.out.println("Join point kind : " + joinPointParam.getKind());
        log.debug("Signature declaring type : "+ joinPointParam.getSignature().getDeclaringTypeName());
        log.debug("Signature name : " + joinPointParam.getSignature().getName());
        log.debug("Arguments : " + Arrays.toString(joinPointParam.getArgs()));
        // System.out.println("Target class : "+ joinPointParam.getTarget().getClass().getName());
        // System.out.println("This class : " + joinPointParam.getThis().getClass().getName());
    }

}
