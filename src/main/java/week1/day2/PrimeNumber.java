package week1.day2;

public class PrimeNumber {
	public static void main(String[] args) {
		int num = 13;
		boolean flag = false;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = true;

			}
		}
		if (!flag) {
			System.out.println(num + " is a Prime Number");
		} else {
			System.out.println(num + " is NOT a Prime Number");
		}
	}
}
