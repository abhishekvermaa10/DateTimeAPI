package com.scaleupindia;

import java.time.LocalTime;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo2 {
	public static void main(String[] args) {
		/*
		 * Rename currentTime as birthTime 
		 * Set your timeOfBirth in same
		 */
		LocalTime birthTime = LocalTime.of(10, 10);
		System.out.println("Birth Time: " + birthTime);
		
		LocalTime birthTime2 = LocalTime.of(10, 10, 10);
		System.out.println("Birth Time: " + birthTime2);
		
		LocalTime birthTime3 = LocalTime.of(10, 10, 10, 10);
		System.out.println("Birth Time: " + birthTime3);
	}
}
