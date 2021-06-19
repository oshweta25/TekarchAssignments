package com.shweta.assignment2;
//8.Write an algorithm to reverse first 3 numbers, then next 3 numbers, then next 3 numbers, the number will be based on var k. Array = [3,2,4,7,0,3,1,5,8, 4] k=3 OutPut = [4,2,3,3,0,7,8,5,1,4]

public class Ques8 {
	static int[] reverseEach3numbers(int[] arr, int k) {

		for (int i = 0; i <= arr.length - k; i += k ) {
			System.out.println("I = " + i);
			for (int j = 0; j < k/2; j++) {
				
				int leftIndex = i + j;
				int rightIndex = i + k -j - 1;
				int temp = arr[leftIndex];
				arr[leftIndex] = arr[rightIndex];
				arr[rightIndex] = temp;
				System.out.println("i = " + i + ", j = " + j + ", left=" + leftIndex + ", righIndex=" + rightIndex);
			}
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}

		return arr;
	}

	public static void main(String[] args) {
		int[] inArray = { 3, 2, 4, 7, 0, 3, 1, 5, 8, 4 };
		reverseEach3numbers(inArray, 3);
	}

}
