package com.scaleupindia;

import java.time.LocalDate;
import java.time.Month;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo2 {
	public static void main(String[] args) {
		/*
		 * Rename currentDate as birthDate 
		 * Set your dateOfBirth in same
		 */
		LocalDate birthDate = LocalDate.of(1995, 11, 28);
		System.out.println("Birth Date: " + birthDate);
		
		LocalDate birthDate2 = LocalDate.of(1995, Month.NOVEMBER, 28);
		System.out.println("Birth Date: " + birthDate2);
	}
}
