/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq {
		// declares three double variables and gets them from user
        double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		// prints the program name and user input
        System.out.println("% java LinearEq " + a + " " + b + " " + c);
		// prints the equation and its solution
		System.out.println(a + " *" + " X" + " + " + b + " = " + c);
		System.out.println(" X " + "= " + ((c-b)/a));
}