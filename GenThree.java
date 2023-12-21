/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
import java.util.Random;
public class GenThree {
	public static void main(String[] args) {
		// declares two int variables and gets them from user
        int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		// creates the range 
		int range = b - a;
		// generating three random numbers in range and prints them
		// using random from math lib, generates number between 0-1
		int first = (int) ((Math.random() * range) + a);
		int second = (int) ((Math.random() * range) + a);
		int third = (int) ((Math.random() * range) + a);
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		// declaring int variable and sets its value by min function of math class
		int min = Math.min(first, second);
		// checks if third number is smaller than the first&second numbers, if it does its sets as his new value
		min = Math.min(min, third);
		// prints the minimal number that was generated in range
		System.out.println("The minimal generated number was: " + min);	
	}
}
