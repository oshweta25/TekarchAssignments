package com.shweta.assignment2;
//10.WJP to count the Uppercase, lowercase, numbers and special characters in the string.

public class Ques10 {

	public static void countCharacters(String input) {
		String s = input.replaceAll("\\s", "");
		System.out.println(s);
		char[] charArr = s.toCharArray(); 
		
		int number = 0;
		int upperCase = 0;
		int lowerCase = 0;
		int specialCh = 0;
		
		
		for ( int i = 0; i<charArr.length; i++ ) {
			
			if ( Character.isUpperCase(charArr[i])) {
				upperCase++;
			}
			else if ( Character.isLowerCase(charArr[i])) {
				lowerCase++;
			}
			else if ( Character.isDigit(charArr[i])) {
				number++;
			}
			else {
				System.out.println("else");
				specialCh++;
			}
		}
		System.out.println("Upper Case count = " + upperCase + 
				"\nLower Case count = " + lowerCase +
				"\nDigit count = " + number +
				"\nSpecial character count = " + specialCh +"."
				);
	}
	public static void main(String[] args) {
		String str = "Hello Spring!!! @2021. ";
		countCharacters(str);
	}
}
