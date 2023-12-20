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
        System.out.println("% java Gen3 " + a + " " + b);
		// creating a new random object
		Random random = new Random();
		// generating three random numbers in range and prints them
		int first = random.nextInt((b - a) + 1) + a;
		int second = random.nextInt((b - a) + 1) + a;
		int third = random.nextInt((b - a) + 1) + a;
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
