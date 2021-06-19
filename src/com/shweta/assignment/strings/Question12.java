package com.shweta.assignment.strings;

import java.util.Arrays;

//12.Write a Java program to check whether two strings are anagram or not?

public class Question12 {
	
	public boolean isAnagramOrNot (String one, String two) {
		char[] oneArr = one.toCharArray();
		char[] twoArr = two.toCharArray();;

		Arrays.sort(oneArr);
		Arrays.sort(twoArr);

		boolean isAnagram = true;
		if( oneArr.length == twoArr.length ) {
			int length = oneArr.length;
			for ( int i =0; i< length; i++ ) {
				if ( oneArr[i] != twoArr[i] ) {
					isAnagram = false;
				}
			}
			
		}
			
		
		return isAnagram;
	}
	public static void main (String[] args) {
		
		Question12 q = new Question12();		
		boolean answer = q.isAnagramOrNot("shweta", "arewhs");
		System.out.println(answer);
		Question12 y = new Question12();		
		boolean answer2 = y.isAnagramOrNot("shweta", "atewhs");
		System.out.println(answer2);
	}
	
}
