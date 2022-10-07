package week1.day2;

public class SumOfDigits {

	public static void main(String[] args) {
		// Declare your input number (int)
		int num = 123, remainder, quotient;
		// Initialize an integer variable by name: sum
		int sum = 0;
		// Use loop to calculate the sum: use while loop to set condition until the
		// number goes greater than 0
		while (num > 0) {

			// Within loop: get the remainder when done by 10 -> Tip: use mod %
			remainder = num % 10;
			// Print the remainder to confirm
			System.out.println("Remainder is " + remainder);
			// Within loop: add that remainder to the sum
			sum = sum + remainder;
			// Print the sum to confirm
			System.out.println("Sum is " + sum);
			// Within loop: get quotient of that number (tip: quotient should be same
			// variable of loop condition)
			quotient = num / 10;
			num = quotient;

			// Print the quotient to confirm
			System.out.println("Quotient is " + quotient);
			// Outside the loop: print the final sum
		}
		System.out.println("Sum of Digits is " + sum);
	}
}
