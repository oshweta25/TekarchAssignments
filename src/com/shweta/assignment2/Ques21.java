package com.shweta.assignment2;
/*21. Given two strings, first string is a sentence and the second string is a character. 
You need to write a function to print number of characters in between the occurrences of second-string excluding spaces. 
String1 = “I love java programming” String2 =”o”
*/

public class Ques21 {
	
	public static int charInBetween() {
		String str ="I love java programming";
		String str1 = str.replace(" " , "");
		String str2 = "o";
		
		char[] arr = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		int firstIndex = 0; 
		int lastIndex = 0; 
		
		for ( int i = 0 ; i < arr.length ; i ++  ) {

			if ( arr[i] == arr2[0] ) {
				
				if ( firstIndex == 0 ) {
					firstIndex = i;
				}
				else {
					lastIndex = i;
				}
			}
		}
		int diff  = lastIndex - firstIndex -1;
		System.out.println(diff);
		return diff;
	}

	public static void main(String[] args) {
		charInBetween();
	}

}
