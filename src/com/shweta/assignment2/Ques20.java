package com.shweta.assignment2;
//20.Push all the zeros element to the end of the arraya. input1={5,0,6,0,7} output={5,6,7,0,0}

public class Ques20 {

	static void pushZeroElement() {

		int[] arr = { 5, 0, 6, 0, 7 };
		int[] ar2 = new int[arr.length];
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				ar2[++index] = arr[i];
			}
		}
		for (int x : ar2) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		pushZeroElement();
	}

}
