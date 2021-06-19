package com.shweta.assignment.strings;
/*
 * Given two strings, first string is a sentence and the second string is a character. 
You need to write a function to print number of characters in between the occurrences of 
second-string excluding spaces. String1 = “I love java programming” String2 =”o”
*/
public class Question22 {

	public int numOfCharactersBetween () {
		
		String sentence = "I love java programming";
		String character = "o";

		sentence = sentence.replaceAll("\\s", "");
		System.out.println( "Spaceless string : " + sentence);
		char[] sentenceArr = sentence.toCharArray();
		char[] characterArr = character.toCharArray();
		char ch = characterArr[0];
		
		int length = sentenceArr.length;
		
		int location1 = 0;
		int location2 = 0;

		for ( int i = 0; i < length; i++ ) {
						
			if ( sentenceArr[i] == ch && location1 == 0 ) {
				location1 = i;
			}
			else if ( sentenceArr[i] == ch && location1 != 0 ){
				location2 = i;
			}
		}
		int spaces = 0;
		
			spaces = location2 - location1 -1;
		return spaces;
	}
	
	public static void main (String[] args) {
		Question22 ques = new Question22();
		int answerSpaces = ques.numOfCharactersBetween();
		System.out.println(answerSpaces);
	}
	
}
