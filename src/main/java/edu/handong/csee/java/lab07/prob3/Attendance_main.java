package edu.handong.csee.java.lab07.prob3;

import java.util.Random;			// import to create random numbers

/**
 * This is a class named 'Attendance_main'!
 * This includes the main method!
 * @author JYB
 *
 */
public class Attendance_main {
	
	/**
	 * This is the main method!
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Attendance s_1 = new Attendance();				// instantiating the constructor to 's_1'
		Attendance s_2 = new Attendance();				// instantiating the constructor to 's_2'
		Attendance s_3 = new Attendance();				// instantiating the constructor to 's_3'
		Attendance s_4 = new Attendance();				// instantiating the constructor to 's_4'

		Random random = new Random();				// create an object of 'Random' class, 'random', to create random numbers

		s_1.set_name("Jess");						// set 'name' of 's_1' to Jess
		s_1.set_year(4);							// set 'year' of 's_1' to 4
		s_1.set_id("21400999");						// set 'student_id' of 's_1' to 21400999
		s_1.set_missed(random.nextInt(10));			// set 'missed' of 's_1' to random number from 0 to 10

		s_2.set_name("Kent");						// set 'name' of 's_2' to Kent
		s_2.set_year(2);							// set 'year' of 's_2' to 2
		s_2.set_id("21700111");						// set 'student_id' of 's_2' to 21700111
		s_2.set_missed(random.nextInt(10));			// set 'missed' of 's_2' to random number from 0 to 10

		s_3.set_name("Lucas");						// set 'name' of 's_3' to Lucas
		s_3.set_year(1);							// set 'year' of 's_3' to 1
		s_3.set_id("21833222");						// set 'student_id' of 's_3' to 21833222
		s_3.set_missed(random.nextInt(10));			// set 'missed' of 's_3' to random number from 0 to 10

		s_4.set_name("Martha");						// set 'name' of 's_4' to Martha
		s_4.set_year(2);							// set 'year' of 's_4' to 2
		s_4.set_id("21733444");						// set 'student_id' of 's_4' to 21733444
		s_4.set_missed(random.nextInt(10));			// set 'missed' of 's_4' to random number from 0 to 10

		if(s_1.get_missed() > 6) {	
			System.out.println("I'm sorry " + s_1.get_name() + ". You failed this course");
			System.out.println(s_1.get_name() + " - Number of absence: " + s_1.get_missed());		// if get_missed() of s_1 is over 6, print the failure message and the number of absence
		}
		else {
			System.out.println("We'll see about the grade, " + s_1.get_name());			// else, print the message
		}

		if(s_2.get_missed() > 6) {
			System.out.println("I'm sorry " + s_2.get_name() + ". You failed this course");
			System.out.println(s_2.get_name() + " - Number of absence: " + s_2.get_missed());		// if get_missed() of s_2 is over 6, print the failure message and the number of absence
		}
		else {
			System.out.println("We'll see about the grade, " + s_2.get_name());			// else, print the message
		}

		if(s_3.get_missed() > 6) {
			System.out.println("I'm sorry " + s_3.get_name() + ". You failed this course");
			System.out.println(s_3.get_name() + " - Number of absence: " + s_3.get_missed());		// if get_missed() of s_3 is over 6, print the failure message and the number of absence
		}
		else {
			System.out.println("We'll see about the grade, " + s_3.get_name());				// else, print the message
		}

		if(s_4.get_missed() > 6) {
			System.out.println("I'm sorry " + s_4.get_name() + ". You failed this course");
			System.out.println(s_4.get_name() + " - Number of absence: " + s_4.get_missed());		// if get_missed() of s_4 is over 6, print the failure message and the number of absence
		}
		else {
			System.out.println("We'll see about the grade, " + s_4.get_name());				// else, print the message
		}

	}

}
