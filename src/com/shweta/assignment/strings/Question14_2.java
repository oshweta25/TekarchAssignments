package com.shweta.assignment.strings;
//14.Input string= “ABCAABCAEBE” which character is duplicated less/least number of times.

public class Question14_2 {
	public static void duplicateStringCounter() {
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
		duplicateStringCounter();
	}
}
