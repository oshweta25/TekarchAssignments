package com.shweta.assignment2;
//18. WJP for int array = [1,2,3,4,5] running sum of numbers. O/p = [1,1+2,1+2+3,1+2+3+4,1+2+3+4+5] i.e [1,3,6,10,15]

public class Ques18 {

	public static void runningSum() {

		int[] arr = { 1, 2, 3, 4, 5 };
		int[] op = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j > -1; j--) {
				sum += arr[j];
				op[i] = sum;
			}

		}
		for (int x : op) {
			System.out.print(x + " ");
		}

	}

	public static void main(String[] args) {

		runningSum();
	}

}
