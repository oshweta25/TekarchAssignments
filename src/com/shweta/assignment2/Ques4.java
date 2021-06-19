package com.shweta.assignment2;
//4.Check the palindrome of the following in separate programs, a. For a integer a = 123321, b.For string s =”MALAYALAM”

public class Ques4 {

	public static boolean integerPallindrome ( int input ) {
		int reversedNumber = 0;
		int number = input;
		while (number != 0) {
			int q = number/10;
			int r = number % 10;
			
			reversedNumber = 10 * reversedNumber + r;
			
			System.out.println ("number = " + number + ", q = " + q + ", r = " + r + ", rev = " + reversedNumber);
			number = q;
		}
		
		return input == reversedNumber;
	}
	public static boolean stringPallindrome(String input) {

		int len = input.length();
		int lenHalf = len / 2;
		boolean isPallindrome = true;

		for (int i = 0; i < lenHalf; i++) {

			if (input.charAt(i) != input.charAt(len - 1 - i)) {
				isPallindrome = false;
			} 
		}
		
		System.out.println(input + " is a Pallindrome : " + isPallindrome);
		return isPallindrome;
	}

	public static void main(String[] args) {
		System.out.println(integerPallindrome(123321));
		stringPallindrome("MALAYALAM");
	}
}
