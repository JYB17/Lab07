package edu.handong.csee.java.lab07.prob3;

import java.util.*;

/**
 * This is a class named 'Attendance'!
 * This defines constructors, getters, and setters!
 * @author JYB
 *
 */
public class Attendance {
	private String name = "";					// declaring instance variable 'name' and initializing to ""
	private int year=0;							// declaring instance variable 'year' and initializing to 0
	private String student_id ="";				// declaring instance variable 'student_id' and initializing to ""
	private int missed =0;						// declaring instance variable 'missed' and initializing to 0
	
	/**
	 * This is a default constructor!
	 * This initializes objects!
	 */
	public Attendance() {
		this.name = "Null";						// setting instance variable 'name' to NULL
		this.year = 0;							// setting instance variable 'name' to 0
		this.student_id = "Null";				// setting instance variable 'student_id' to NULL
		this.missed = 0;						// setting instance variable 'missed' to 0
	}
	
	/**
	 * This is a constructor!
	 * This sets instance variables to constructor's parameters!
	 * @param name
	 * @param year
	 * @param student_id
	 * @param missed
	 */
	public Attendance(String name, int year, String student_id, int missed) {
		this.name = name;														// update instance variable 'name' to parameter 'name'
		this.year = year;														// update instance variable 'year' to parameter 'year'
		this.student_id = student_id;											// update instance variable 'student_id' to parameter 'student_id'
		this.missed = missed;													// update instance variable 'missed' to parameter 'missed'
	}
	
	/**
	 * This is getter named 'get_name'!
	 * This gets 'name' and returns its value!
	 * @return
	 */
	public String get_name() {
		return name;					// return the value of instance variable 'name'
	}
	
	/**
	 * This is getter named 'get_year'!
	 * This gets 'year' and returns its value!
	 * @return
	 */
	public int get_year() {
		return year;					// return the value of instance variable 'year'
	}
	
	/**
	 * This is getter named 'get_id'!
	 * This gets 'student_id' and returns its value!
	 * @return
	 */
	public String get_id() {
		return student_id;				// return the value of instance variable 'student_id'
	}
	
	/**
	 * This is getter named 'get_missed'!
	 * This gets 'missed' and returns its value!
	 * @return
	 */
	public int get_missed() {
		return missed;					// return the value of instance variable 'missed'
	}
	
	/**
	 * This is setter named 'set_name'!
	 * This sets 'name' to the parameter!
	 * @param name
	 */
	public void set_name(String name) {
		this.name = name;					// set instance variable 'name' to the parameter
	}
	
	/**
	 * This is setter named 'set_year'!
	 * This sets 'year' to the parameter!
	 * @param year
	 */
	public void set_year(int year) {
		this.year = year;					// set instance variable 'year' to the parameter
	}
	
	/**
	 * This is setter named 'set_id'!
	 * This sets 'student_id' to the parameter!
	 * @param student_id
	 */
	public void set_id(String student_id) {
		this.student_id = student_id;			// set instance variable 'student_id' to the parameter
	}
	
	/**
	 * This is setter named 'set_missed'!
	 * This sets 'missed' to the parameter!
	 * @param missed
	 */
	public void set_missed(int missed) {
		this.missed = missed;					// set instance variable 'missed' to the parameter
	}
}
