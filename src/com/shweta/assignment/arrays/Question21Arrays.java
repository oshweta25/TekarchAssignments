package com.shweta.assignment.arrays;

/*
 * 21.Push all the zeros element to the end of the array
 * a.input1={5,0,6,0,7} output={5,6,7,0,0}
 */

public class Question21Arrays {

	public static void arrayPushElements() {

		int[] inputArr = { 5, 0, 6, 0, 7 };
		int[] newArr = new int[inputArr.length];
		int j = 0;
		for (int i = 0; i < inputArr.length; i++) {
			if (inputArr[i] != 0) {
				newArr[j] = inputArr[i];
				j++;
			}
		}
		for (int i = 0; i < newArr.length; i++) {
			System.out.println(newArr[i]);
		}
	}

	public static void main(String[] args) {
		arrayPushElements();
	}

}
