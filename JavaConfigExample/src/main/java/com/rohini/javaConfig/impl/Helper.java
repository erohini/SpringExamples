package com.rohini.javaConfig.impl;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.rohini.javaConfig.CustomerConfig;
import com.rohini.javaConfig.SchedularConfig;

@Configuration
@Import({CustomerConfig.class, SchedularConfig.class})
public class Helper {
	
}
