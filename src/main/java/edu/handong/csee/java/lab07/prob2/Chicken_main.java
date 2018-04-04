package edu.handong.csee.java.lab07.prob2;

/**
 * This is a class named 'Chicken_main'!
 * This includes the main method to print out each menu's name and rating!
 * @author JYB
 *
 */
public class Chicken_main {
	
	/**
	 * This is the main method!
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chicken menu1 = new Chicken("Cheese_mustard", 16000.00, 5);		// instantiating the constructor to 'menu1' and initialize the 'name', 'price', 'stars' 
		Chicken menu2 = new Chicken("Honey_mustard", 16000.00, 5);		// instantiating the constructor to 'menu2' and initialize the 'name', 'price', 'stars'
		Chicken menu3 = new Chicken("Spicey_chicken", 16000.00, 1);		// instantiating the constructor to 'menu3' and initialize the 'name', 'price', 'stars'
		
		menu1.set_stars(3);												// set 'stars' of menu1 to 3
		menu2.set_stars(4);												// set 'stars' of menu2 to 4		
		menu3.set_stars(1);												// set 'stars' of menu3 to 1
		
		System.out.println(menu1.get_name() + "'s rating is " + menu1.get_stars());
		System.out.println(menu2.get_name() + "'s rating is " + menu2.get_stars());
		System.out.println(menu3.get_name() + "'s rating is " + menu3.get_stars());		// print each menu's name and rating
	}
}
