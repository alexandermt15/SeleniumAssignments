package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {

		int[] num = { 23, 54, 67, 55, 66, 42, 27, 89 };

		List<Integer> oddeven = new ArrayList();

		for (int i = 0; i < num.length; i++) {
			oddeven.add(num[i]);
			if (num[i] % 2 != 0) {
				System.out.println(num[i]);
			}
		}

	}
}
