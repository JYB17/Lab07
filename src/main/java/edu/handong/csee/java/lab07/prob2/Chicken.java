package edu.handong.csee.java.lab07.prob2;

/**
 * This is a class named 'Chicken'!
 * This defines constructors, getters, and setters!
 * @author JYB
 *
 */
public class Chicken {
	private String name;
	private double price;
	private int stars;					// declaring instance variables 'name', 'price', and 'stars'
	
	/**
	 * This is a default constructor!
	 * This initializes objects!
	 */
	public Chicken() {
		this.name = "";					// setting instance variable 'name' to ""
		this.price = 0.0;				// setting instance variable 'price' to 0.0
		this.stars = 0;					// setting instance variable 'stars' to 0
	}
	
	/**
	 * This is a constructor!
	 * This sets instance variables to constructor's parameters!
	 * @param name
	 * @param price
	 * @param stars
	 */
	public Chicken(String name, double price, int stars) {
		this.name = name;										// update instance variable 'name' to parameter 'name'
		this.price = price;										// update instance variable 'price' to parameter 'price'
		this.stars = stars;										// update instance variable 'stars' to parameter 'stars'
	}
	
	/**
	 * This is a getter named 'get_name'!
	 * This gets the name!
	 * @return
	 */
	public String get_name() {
		return this.name;			// return the value of instance variable 'name'
	}
	
	/**
	 * This is a getter named 'get_price'!
	 * This gets the price!
	 * @return
	 */
	public double get_price() {
		return this.price;			// return the value of instance variable 'price'
	}
	
	/**
	 * This is a getter named 'get_stars'!
	 * This gets the stars!
	 * @return
	 */
	public int get_stars() {
		return this.stars;			// return the value of instance variable 'stars'
	}
	
	/**
	 * This is a setter named 'set_name'!
	 * This sets 'name' to the parameter!
	 * @param name
	 */
	public void set_name(String name) {
		this.name = name;						// set instance variable 'name' to the parameter
	}
	
	/**
	 * This is a setter named 'set_price'!
	 * This sets 'price' to the parameter!
	 * @param price
	 */
	public void set_price(double price) {
		this.price = price;						// set instance variable 'price' to the parameter
	}
	
	/**
	 * This is a setter named 'set_stars'!
	 * This sets 'stars' to the parameter!
	 * @param stars
	 */
	public void set_stars(int stars) {
		this.stars = stars;						// set instance variable 'stars' to the parameter
	}
}
