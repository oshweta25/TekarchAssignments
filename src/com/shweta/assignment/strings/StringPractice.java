package com.shweta.assignment.strings;

public class StringPractice {

		
//	7.Given a string print the reverse of the string.(Input: Java Code Output: edoC avaJ)	
	
	public  void reverseInput() {
		System.out.println("\nGiven a string print the reverse of the string\n");
	
		String input = "Java Code";
		
		String[] splitInput = input.split("");
		
		for(int count = 0; count< splitInput.length; count++) {
			System.out.print(splitInput[count]);
		}
		System.out.println("\n");
		for (int count = splitInput.length-1; count>=0; count--) {
			System.out.print(splitInput[count]);
		}
		System.out.println("\n\n--------------------------------------");
	}

//20.Reverse the words in a given string- a.Input string: I am learning OutputString: learning am I

	public static void reverseWords() {
		System.out.println("Reverse the words in a given string- a.Input string: I am learning OutputString: learning am I\n");
		String words = "I am learning";
		
		String[] wordsInput = words.split(" ");

		for (int count = 0; count<wordsInput.length; count++) {
			System.out.print(wordsInput[count]+" ");
		}
		System.out.println("\n");
		for (int count = wordsInput.length-1; count>=0; count--) {
			System.out.print(wordsInput[count]+" ");
		}
		System.out.println("\n\n--------------------------------------");
	}
	
//8.WJP to find total number of integers, upper case and lower case character in the give string.
	
	public static void checkLetterCase() {
		System.out.println("WJP to find total number of integers, uppercase and lowercase character in the give string.\n");
		String input = "Today is the 17th of Arpil 2021";
		int upperCaseLetters = 0;
		int lowerCaseLetters = 0;
		int digits = 0;
		
		for( int i =0; i<input.length(); i++) {
			char c = input.charAt(i); 
			
			if(Character.isUpperCase(c)){
				upperCaseLetters++;
			}
			if(Character.isLowerCase(c)) {
				lowerCaseLetters++;
			}
			if(Character.isDigit(c)) {
				digits++;
			}
		}	
		System.out.println( "In the given sentence \"Today is the 17th of Arpil 2021.\", there are : \n" + upperCaseLetters + " Upper Case Letters, \n" + lowerCaseLetters + " Lower Case Letters and \n" + digits + " digits." );
		System.out.println("\n--------------------------------------");
	}	
	public static void main(String[] args) {
		StringPractice reverserWork = new StringPractice();
		reverserWork.reverseInput();
		reverseWords();
		checkLetterCase();			
	}

}
