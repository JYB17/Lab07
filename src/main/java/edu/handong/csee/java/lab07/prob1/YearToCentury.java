package edu.handong.csee.java.lab07.prob1;

/**
 * This is a class named YearToCentury!
 * It defines constructors and a method to caluculate century! 
 * @author JYB
 *
 */
public class YearToCentury {
	int year;					// declaring instance variable 'year'
	
	/**
	 * This is a default constructor!
	 * This initializes objects!
	 */
	public YearToCentury() {
		year=0;						//  initializing variable 'year' as 0
	}
	
	/**
	 * This is a constructor!
	 * This sets instance variable to its parameter!
	 * @param year
	 */
	public YearToCentury(int year) {
		this.year = year;					// setting instance variable 'year' to parameter 'year' using "this"
	}
	
	/**
	 * This is method named 'calc_century'!
	 * This calculates the century of a year!
	 * @return
	 */
	public int calc_century() {
		if(year%100 ==0)
			year = year/100;			// if year%100 is 0, divide year by 100 and update the 'year'
		else
			year = (year/100)+1;		// else, divide year by 100 and plus 1 and update 'year'
		return year;					// return the value of 'year'
	}
}
