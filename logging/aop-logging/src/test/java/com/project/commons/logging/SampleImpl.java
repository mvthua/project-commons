/*
 * Copyright (c) 2013.
 * All rights reserved.
 */
package com.project.commons.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.project.commons.logging.annotation.Loggable;

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
