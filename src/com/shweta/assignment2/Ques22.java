package com.shweta.assignment2;

import java.util.Arrays;

/*Given two strings, first string is a sentence and the second string is a character. 
You need to write a function to print unique number of characters in between the occurrences of second-string excluding spaces.
String1 = “I love java programming” String2 =”o”
*/

public class Ques22 {
	static void uniqueCh() {

		String given = "I love java programming";
		String s1 = given.replace(" ", "");
		String s2 = "o";

		char[] source = s1.toCharArray();
		char s = s2.charAt(0);

		int index1 = -1;
		int index2 = -1;

		for (int i = 0; i < s1.length(); i++) {
			if (source[i] == s) {
				if (index1 == -1) {
					index1 = i;
				} else {
					if (index2 == -1) {
						index2 = i;
					}
				}
			}
		}

		if (index1 == -1 || index2 == -1) {
			return;
		}

		// System.out.println("index1=" + index1 + ", index2=" + index2);
		char[] newArray = Arrays.copyOfRange(source, index1 + 1, index2);

		// Working on newArray to count and print all the unique numbers.
		// char[] newArray

		int count = 0;
		int[] asciArr = new int[256];
		for (int i = 0; i < newArray.length; i++) {
			// System.out.println( (int) newArray[i] );
			// System.out.println( newArray[i] );
			asciArr[newArray[i]]++;
			// System.out.println(asciArr[newArray[i]]);

			System.out.println(newArray[i] + " Number of Occurances is : " + asciArr[newArray[i]]);

			if (asciArr[newArray[i]] == 1) {
				count++;
			}
		}

		System.out.println("\nNumber of unique characters is : " + count);

	}

	public static void main(String[] args) {
		uniqueCh();
	}

}
