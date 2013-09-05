/*
 * Copyright (c) 2013.
 * All rights reserved.
 */
package com.project.commons.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.project.commons.log.annotation.Loggable;

/**
 * @author mhua
 */
@Component
public class SampleImpl implements Sample {

    /**
     * @
     */
    private static final Logger LOG = LoggerFactory.getLogger("SampleImpl");


    /**
     * {@inheritDoc}
     */
    @Loggable
    public void sample() {
        LOG.info("Sample");
    }

}
