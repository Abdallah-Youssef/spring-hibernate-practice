package com.abdallah;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.abdallah")
@PropertySource("classpath:application.properties")
public class ProjectConfig {

}
