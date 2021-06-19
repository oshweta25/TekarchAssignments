package com.shweta.assignment2;
//23. String s="hello world" count the number of occurrences of each letter.

public class Ques23 {
	static void countAll() {

		String s = "hello world";
		String s1 = s.replace(" ", "");

		int[] count = new int[256];

		for (int i = 0; i < s1.length(); i++) {

			count[s1.charAt(i)]++;
		}
		for ( int i = 0 ; i < count.length ; i++ ) {
			if ( count[i] > 0 ) {
			System.out.println( (char) i + " " +count[i] );
			}
		}
	} 

	public static void main(String[] args) {
		countAll();
	}
}