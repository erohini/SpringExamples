package com.rohini.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SchedularConfig {
	@Bean(name="schedular")
	public Schedular schedular(){
		return new Schedular();
	}
}
