package com.shweta.assignment2;
//17.WJP program where String = "1,2,3,4,5,6,7,8,9" from this string add all odd

public class Ques17 {

	public static int addString() {
		String str = "1,2,3,4,5,6,7,8,9";

		String[] strArr = str.split(",");
		
		int sum = 0;

		for (int i = 0; i < strArr.length; i++) {

			int x = Integer.parseInt(strArr[i]);

			if (x % 2 != 0) {
				sum += x;

			}
		}
		System.out.println(sum);
		return sum;

	}

	public static void main(String[] args) {
		addString();
	}
}
