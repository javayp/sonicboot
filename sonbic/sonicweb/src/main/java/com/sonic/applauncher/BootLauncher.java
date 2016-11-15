package com.sonic.applauncher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by prash on 11/9/2016.
 */
@SpringBootApplication
public class BootLauncher {

    private static final Logger logger = LoggerFactory.getLogger(BootLauncher.class);

    public static void main(String args[]){
        SpringApplication.run(BootLauncher.class, args);
    }
}
