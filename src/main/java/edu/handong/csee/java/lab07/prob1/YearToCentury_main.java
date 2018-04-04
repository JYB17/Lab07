package edu.handong.csee.java.lab07.prob1;

import java.util.Scanner;

/**
 * This is class named 'YearToCentury_main'!
 * This includes the main method to calculate year to century!
 * @author JYB
 *
 */
public class YearToCentury_main {
	
	/**
	 * This is the main method!
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int yr=0;											// declare input variable 'yr' and initializing to 0
		Scanner keyboard = new Scanner(System.in);			// create an object of 'Scanner' class, 'keyboard'
		
		System.out.println("Input year: ");					
		yr = keyboard.nextInt();							// getting the input 'yr'
		
		YearToCentury year = new YearToCentury(yr);			// instantiating the constructor 'year'
		
		System.out.println(yr + " is " + year.calc_century() + "th century.");  	// print the result
	}

}
