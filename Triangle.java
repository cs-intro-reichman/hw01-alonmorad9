/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		// declares three int variables and gets them from user
        int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		// declares boolean variable
		boolean possible;
		// checks if triangle is valid by rules
		if (a+b > c && a+c > b && b+c > a)
			possible = true;
		else
			possible = false;
		// prints the sides and if triangle is possible
		System.out.println(a + ", " + b + ", " + c + ": " + possible);	
	}
}
