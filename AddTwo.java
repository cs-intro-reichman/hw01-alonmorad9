/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	public static void main(String[] args) {
		// Declares two integer variables and gets them from user
        int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		// prints the program name and user input
        System.out.println("% java AddTwo " + a + " " + b);
		// prints the sum=output 
		System.out.println(a + "+" + b + "=" + (a+b));	
	}
}
