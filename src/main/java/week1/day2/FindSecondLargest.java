package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {
	public static void main(String[] args) {
		int[] data = { 3, 2, 11, 4, 6, 7 };
		// Arrange in ascending order
		Arrays.sort(data);
		// Pick the second element from last and print it
		System.out.println(data.length - 2);
		System.out.println(data[data.length - 2]);

	}

}
