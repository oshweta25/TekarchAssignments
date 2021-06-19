package com.shweta.assignment2;
//11.Write a Java program to check whether two strings are anagram or not?

import java.util.Arrays;

public class Ques11 {
	public static boolean checkAnagram(String input, String input2) {
		
		input = input.replace(" ", "");
		String input3 = input2.replace(" ", "");
		
		
	//	System.out.println(input3);

		char[] ch = input.toCharArray();
		char[] ch2 = input3.toCharArray();
		
		 Arrays.sort(ch);
		 Arrays.sort(ch2);
		
		boolean isAnagram = true;
		
		if ( ch.length == ch2.length ) {
		
			for ( int i = 0 ; i < ch.length; i ++ ) {
						
				if ( ch[i] != ch2[i] ) {
					isAnagram = false;
				}
			}
		}
		System.out.println(isAnagram);
		return isAnagram;
	}
	
	public static void main (String[] args) {
		checkAnagram("input", "input");
		checkAnagram("java", "avak");
		checkAnagram("listen", "solent");
		checkAnagram("astronomer", "moon starer");
	}
}
