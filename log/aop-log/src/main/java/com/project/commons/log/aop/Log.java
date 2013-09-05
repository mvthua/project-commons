/*
 * Copyright (c) 2013.
 * All rights reserved.
 */
package com.project.commons.log.aop;

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
    @Pointcut("@annotation(com.project.commons.log.annotation.Loggable)")
    private void log() {
    }

    /**
     * @param jp_P
     */
    @Before("log()")
    public void before(JoinPoint jp_P) {
        final Logger log = LoggerFactory.getLogger(jp_P.getTarget().getClass());

        // System.out.println("Join point kind : " + jp_P.getKind());
        log.debug("Signature declaring type : "+ jp_P.getSignature().getDeclaringTypeName());
        log.debug("Signature name : " + jp_P.getSignature().getName());
        log.debug("Arguments : " + Arrays.toString(jp_P.getArgs()));
        // System.out.println("Target class : "+ jp_P.getTarget().getClass().getName());
        // System.out.println("This class : " + jp_P.getThis().getClass().getName());
    }

}
