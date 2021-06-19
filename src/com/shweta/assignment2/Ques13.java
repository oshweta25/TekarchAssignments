package com.shweta.assignment2;
//13. input string= “ABCAABCAEBE” which character is duplicated least number of times.

public class Ques13 {
	public static void leastDuplicateCounter() {
		String input = "ABCAABCAEBEE";
		int[] inArr = new int[256];

		for (int i = 0; i < input.length(); i++) {
			char ithCharacter = input.charAt(i);
			int integerValueOfCharacter = (int) ithCharacter;

			if (integerValueOfCharacter < 256) {
				inArr[integerValueOfCharacter]++;
			}
		}
		int min = 0;
		int minIndex = 0;
		for (int i = 0; i < 256; i++) {
			if (inArr[i] != 0) {
				if (min == 0) {
					min = inArr[i];
					minIndex = i;
				} else if (inArr[i] < min) {
					min = inArr[i];
					minIndex = i;
				}
			}
		}
		System.out.println("Character " + (char) minIndex + " is repeated least i.e. " + min + " times.");
	}

	public static void main(String[] args) {
		leastDuplicateCounter();
	}

}
