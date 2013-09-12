/*
 * Copyright (c) 2013.
 * All rights reserved.
 */
package com.project.commons.audit.impl;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @author mhua
 */
public class CustomAuditorAwareImpl implements AuditorAware<String> {

    /**
     * {@inheritDoc}
     */
    @Override
    public String getCurrentAuditor() {
        return "SYSTEM"; //SecurityContextHolder.getContext().getAuthentication().getName();
    }

}
