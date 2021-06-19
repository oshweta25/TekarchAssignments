package com.shweta.assignment2;
//6.Given a string print the reverse of the string.(Input: Java Code Output: edoC avaJ)


public class Ques6 {
	
	public static String reverseInputString(String input) {

		String[] output = new String[input.length()];
		
		String[] arr = input.split("");
		int len = arr.length;
		for ( int i = 0 ; i < arr.length ; i ++ ) {
			output[i] = arr[len-1-i];
			
		}
		for ( String s : output ) {
			System.out.println(s);			
		}
		String str = String.join("", output);
		System.out.print(str);			

		return str;
	}
	
	public static void main (String[] args ) {
		reverseInputString("Java Code");	
	}
}
