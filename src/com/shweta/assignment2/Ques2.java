package com.shweta.assignment2;

//Consider there is a 3 Boolean variable called a, b, c. Check if at least two out of three Booleans are true
public class Ques2 {

	static boolean checkIf2RBoolean(boolean a, boolean b, boolean c) {

		return a && b || b && c || c && b;

	}

	public static void main(String[] args) {
		boolean x = false;
		boolean y = true;
		boolean z = true;
		boolean answer = checkIf2RBoolean(x, y, z);
		System.out.println(answer);
	}

}
