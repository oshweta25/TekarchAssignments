package com.shweta.assignment2;
//9.WJP to do descending order sorting for the given array. Array = [3,2,4,7,0,3,1,5,8, 4]


public class Ques9 {

	public static void sortDescend( ) {
		
		int[] arr = {3,2,4,7,0,3,1,5,8,4};
		
		for ( int i = 0 ; i < arr.length-1; i++ ) {
			for ( int j = i+1 ; j < arr.length; j++  ) {
				if ( arr[j] != arr[i])	{		
				if ( arr[j] > arr[i]  ) {
					
					int a = arr[j]; 
					arr[j] = arr[i];
					arr[i] = a;
				}
			}
		}
		}
		for ( int i : arr ) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		sortDescend();
	}

}
