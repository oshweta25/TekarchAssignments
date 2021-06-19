package com.shweta.assignment2;
//12. WJP: given an array of elements print 1 even and 1 odd number in sorted way.  input : 7 4 8 3 2 10 6 5 output: 2 3 4 5 6 7 8

public class Ques12 {
	public static void sortAscendEvenOdd() {
		int[] input = { 7, 4, 8, 3, 2, 10, 6, 5 };

		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if (input[i] < input[j]) {
					var curr = input[j];
					input[j] = input[i];
					input[i] = curr;
				}
			}
		}
		int[] input1 = new int[input.length];
		if (input.length%2 != 0 ) {
			input1 = new int[input.length];
		}
		for (int i = 0; i < input1.length-1; i ++) {
			input1[i] = input[i];
			for (int j = 0; j < input1.length; j++) {
				if (input1[i] % 2 != 0 && i % 2 == 0   && input1[i] < input1[j]) {
					int curr = input1[i];
					input1[i] = input1[i + 1];
					input1[i + 1] = curr;
				}
			}
		}

		for (int in : input) {
			System.out.println(in);
		}
	}
	public static void main(String[] args) {
		sortAscendEvenOdd();
	}

}
