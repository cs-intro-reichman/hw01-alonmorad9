/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		// declares int variable and gets it from user
        int cents = Integer.parseInt(args[0]);
		// prints the amout of quarters and cents the user needs
		System.out.println("Use " + cents/25 + " quarters" + " and " + cents%25 + " cents");
	}
}