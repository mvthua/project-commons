/*
 * Copyright (c) 2013.
 * All rights reserved.
 */
package com.project.commons.log.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.project.commons.log.Sample;

/**
 * @author mhua
 */
@ContextConfiguration(locations = "classpath:ctx-custom-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class LogTest {

    /**
     * @
     */
    @Autowired
    private Sample sample;

    /**
     * @
     */
    @Test
    public void test() {
        sample.sample();
    }

}
