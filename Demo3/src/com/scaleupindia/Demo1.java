package com.scaleupindia;

import java.time.LocalDate;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo1 {
	public static void main(String[] args) {
		/*
		 * Create an instance of LocalDate and save in currentDate variable 
		 * Print the currentDate 
		 * Print the currentDate in yyyy-MM-dd format
		 */
		LocalDate currentDate = LocalDate.now();
		System.out.println("Current Date: " + currentDate);
	}
}
