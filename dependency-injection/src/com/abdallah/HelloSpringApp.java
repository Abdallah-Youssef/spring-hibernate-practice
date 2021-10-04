package com.abdallah;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ProjectConfig.class);
				
		// retrieve bean from spring container
		TennisCoach theCoach = context.getBean(TennisCoach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getEmail());
				
		// close the context
		context.close();
	}

}







