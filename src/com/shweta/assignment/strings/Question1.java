package com.shweta.assignment.strings;

/**
 * Program to remove duplicates from a string input= “abcabcabc” output = “abc”
 */
public class Question1 {

	public String removeDuplicates(String input) {
		
		int length = input.length();
		char[] inputArr = new char[length];
 		int lastIndex = 0;
		
 		for ( int i = 0; i<length-1; i++) {
 			
 			if ( i == 0 ) {
 				inputArr[i] = input.charAt(i);
 				lastIndex = i;
 			}
 			else {
 				char current = input.charAt(i);
 				boolean found = false;
 				for ( int j = 0; j <= lastIndex; j++ ) {
 					if( current == inputArr[j] ) {
 						found = true;
 						break;
 					}
 				}
 				if(!found) {
						inputArr[++lastIndex] = current;
					} 				
 			}		
 		}
 		
		return new String(inputArr, 0, lastIndex+1);
	}
	
	public static void main(String[] args) {
		Question1 q = new Question1();
		
		String[] inputs = {
				"abcabcabc",
				"shwetashwsh",
				"appleorangeappleorangeapple"			
		};
		for (String input : inputs ) {
		String stripped = q.removeDuplicates(input);
		System.out.println(stripped);
		}
	}
}
