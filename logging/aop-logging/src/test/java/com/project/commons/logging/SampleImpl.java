package com.project.commons.logging;

import org.springframework.stereotype.Component;

import com.project.commons.logging.annotation.Loggable;

/**
 * Created with IntelliJ IDEA.
 * User: exist
 * Date: 8/16/13
 * Time: 11:43 AM
 * To change this template use File | Settings | File Templates.
 */
@Component
public class SampleImpl implements Sample {

    @Loggable
    public void sample() {
        System.out.println("Sample!");
    }
}
