package com.shweta.assignment2;
//Program to remove duplicates from a string input= “abcabcabc” output = “abc”.

public class Ques1 {

	public String removeDuplicates2(String input) {
		
		String result = "";
		
		for ( int i = 0 ; i < input.length(); i ++ ) {
			
			if ( !result.contains( String.valueOf(input.charAt(i)) ) ) {
				result += String.valueOf(input.charAt(i));

			}
		}
		 return result;  
		} 

	public static void main(String[] args) {
		Ques1 q2 = new Ques1();
		String answer = q2.removeDuplicates2("abcabcabc");
		System.out.println(answer);
	}
}
