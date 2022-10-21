package week3.day2;

import java.util.Arrays;
import java.util.Collections;

public class SortingUsingCollection {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = { "HCL", "Wipro", "Aspire Systems", "CTS" };
		int len = arr.length;
		System.out.println("Length is " + len);
		Arrays.sort(arr);
		System.out.println("Linear order");
		for (String i : arr) {
			System.out.println(i);
		}
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println("Reverse order");
		for (String i : arr) {
			System.out.println(i);
		}

	}
}
