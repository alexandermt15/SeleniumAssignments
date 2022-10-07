package week1.day2;

public class ArmstrongNumber {
	public static void main(String[] args) {
		// Declare your input
		int num = 153;
		// Declare 3 more int variables as calculated, remainder, original (Tip:
		// Initialize calculated alone)
		int calculated = 0, remainder = 0, quotient = 0, original = 0;

		// Assign input into variable original
		original = num;
		// Use loop to calculate: use while loop to set condition until the number
		// greater than 0
		while (num > 0) {
			// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)
			remainder = num % 10;
			// Within loop: get the quotient when done by 10 (Tip: Assign the result to
			// input)
			quotient = num / 10;

			// Within loop: Add calculated with the cube of remainder & assign it to
			// calculated
			calculated = calculated + remainder * remainder * remainder;
			num = quotient;
		}
// Check whether calculated and original are same
		if (calculated == original) {
			System.out.println(calculated + " is an Armstrong Number");
		} else {
			System.out.println(calculated + " is NOT an Armstrong Number");
		}

		// When it matches print it as Armstrong number

	}
}
