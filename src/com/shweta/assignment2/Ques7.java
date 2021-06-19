package com.shweta.assignment2;
//7.WJP to find total number of integers, uppercase and lowercase character in the give string.

public class Ques7 {

	public static void countIUL(String input) {

		int integers = 0;
		int upperCase = 0;
		int lowerCase = 0;

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (Character.isUpperCase(c)) {
				upperCase++;
			} else if (Character.isLowerCase(c)) {
				lowerCase++;
			} else if (Character.isDigit(c))
				integers++;
		}

		System.out.println("Number of Upper Case letters : " + upperCase + "\nNumber of Lower Case letters : "
				+ lowerCase + "\nNumber of Integers : " + integers);
	}

	public static void main(String[] args) {
		countIUL("Java7Code");
	}
}
