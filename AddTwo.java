/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	public static void main(String[] args) {
		// declares two int variables and gets them from user
        int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		// prints the sum
		System.out.println(a + " + " + b + " = " + (a+b));	
	}
}
