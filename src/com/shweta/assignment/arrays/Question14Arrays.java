package com.shweta.assignment.arrays;

import java.util.Arrays;

/*9.Write an algorithm to reverse first 3 numbers, then next 3 numbers, then next 3 numbers, the 
number will be based on var k. Array = [3,2,4,7,0,3,1,5,8, 4] k=3 OutPut = [4,2,3,3,0,7,8,5,1,4]
*/

public class Question14Arrays {

	public void reverseKEach(int[] input, int k) {
		if (k <= 0) {
			return;
		}
		for (int i = 0; i + k <= input.length; i += k) {
			for (int j = 0; j < k / 2; j++) {
				int leftIndex = i + j;
				int rightIndex = i + k - j - 1;
				int curr = input[leftIndex];
				input[leftIndex] = input[rightIndex];
				input[rightIndex] = curr;
			}
		}

	}

	public static void main(String[] args) {
		Question14Arrays reverse = new Question14Arrays();
		int[] input = { 3, 2, 4, 7, 0, 3, 1, 5, 8, 4 };
		int[] input2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int k = 0; k <= input2.length; k++) {
			int[] copy = Arrays.copyOf(input2, input2.length);
			reverse.reverseKEach(copy, k);
			System.out.println("\nReversing value of K : " + k);
			for (int in : copy) {
				System.out.print(in + " ");
			}
		}
		System.out.println();
		for (int k = 0; k <= input.length; k++) {
			int[] copy = Arrays.copyOf(input, input.length);
			reverse.reverseKEach(copy, k);
			System.out.println("\nReversing value of K : " + k);
			for (int in : copy) {
				System.out.print(in + " ");
			}
		}
	}
}
