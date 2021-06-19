package com.shweta.assignment2;
//19.Reverse the words in a given string – a.Input string: I am learning. Output String: learning am I.

public class Ques19 {
	public static void reverseWords () {
		String input = "I am learning";
		String[] str = input.split(" ");
		
		for ( int i = 0; i < str.length/2; i ++ ) {
			String x = str[i];
			str[i] = str[str.length-1-i];
			str[str.length-1-i] = x;
		}
		for ( String x : str) {
			System.out.print(x+ " ");
		}
	}
	public static void main(String[] args) {
		reverseWords();
	}
}
