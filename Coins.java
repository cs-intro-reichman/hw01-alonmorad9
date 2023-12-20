/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		// decalers decalers int variable and gets them from user
        int cents = Integer.parseInt(args[0]);
		// prints the program name and user input
        System.out.println("% java Coins " + cents);
		// prints the amout of quarters and cents the user needs
		System.out.println("Use " + cents/25 + " quarters" + " and " + cents%25 + " cents");
	}
}