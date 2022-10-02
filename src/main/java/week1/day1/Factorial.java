package week1.day1;

import java.util.Iterator;

public class Factorial {
public static void main(String[] args) {
	
	int fact = 1;
	int input= 5;
	for (int i = 1; i <= input; i++) {
	fact = fact*i;	
	System.out.println(fact);
	}
	
}
}
