package week3.day2;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumbers {
	public static void main(String args[]) {
		int arr[] = { 1, 2, 4, 5, 6, 7, 8, 9, 10 };// 3 is missing
		Set<Integer> set = new TreeSet<Integer>();
		for (Integer i : arr) {
			set.add(i);
		}
		int count = set.size();
		System.out.println("Size is " + count);
		Integer[] myArray = new Integer[count];
		set.toArray(myArray);
		Arrays.sort(myArray);
		System.out.println("Sorted array is ");
		for (int i : myArray) {
			System.out.print(i + " ");
		}
		int count1 = myArray.length - 1;
		for (int i = 0; i < count1; i++) {
			if (myArray[i] + 1 != myArray[i + 1]) {
				System.out.println("\n Missing number in array series is " + (myArray[i] + 1));
				System.out.println();
				break;
			}
		}
	}

}