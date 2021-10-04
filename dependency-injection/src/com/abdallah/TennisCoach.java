package com.abdallah;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Value("${email}")
	private String email;
	

	@Override
	public String getDailyWorkout() {
		return "Practice back hand";
	}

	
	public String getEmail() {
		return "Email: " + email;
	}
}
