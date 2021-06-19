package com.shweta.assignment2;
//3.write a program to find factorial of a number (Non Recursive)

public class Ques3 {

	public static int findFactorial(int n) {

		int factorial = 1;
		if (n == 0 || n == 1) {
			factorial = 1;
		} else {
			for (int i = n; i >= 1; i--) {

				factorial = factorial * i;
			}
		}
		System.out.println("Factorial of " + n + " : " + factorial);
		return factorial;
	}

	public static void main(String[] args) {
		findFactorial(0);
		findFactorial(1);
		findFactorial(2);
		findFactorial(5);
	}
}
