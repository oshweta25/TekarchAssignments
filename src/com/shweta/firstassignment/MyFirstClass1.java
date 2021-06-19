package com.shweta.firstassignment;

public class MyFirstClass1 {

	//Write a program to print numbers from 1-50 with an increment of 3 digits. 
	
	public static void printNumbersUsingForLoop() {
		System.out.println("Now Printing with FOR Loop:");
		for (int i=1; i<=50; i+=3) { 
			System.out.print(i+" "); 
		}
		System.out.print("\n"); 	 		
	}
	public static void printNumbersUsingWhileLoop() {
		System.out.println("Now Printing with WHILE Loop:");
		int i = 1;
		while(i<=50) {
			System.out.print(i+" ");
			i+=3;
		}
		System.out.print("\n\n"); 			
	}
	
	//Write a program to print numbers from 50 - 1 with a decrement of 5 digits 
	//50,45,40,35,30 using while loop and for loop
	
	public static void printDecrementNumbersUsingForLoop() {
		System.out.println("Printing Decreasing order with FOR Loop:");
		for (int i=50; i>=1; i-=5) { 
			System.out.print(i+""
					+ " "); 
		}
		System.out.print("\n"); 			
	}
	public static void printDecrementNumbersUsingWhileLoop() {
		System.out.println("Printing Decreasing order with WHILE Loop:");
		int i = 50;
		while(i>=1) {
			System.out.print(i+" ");
			i = i-5;
		}
		System.out.print("\n"); 			
	}
	
	public static void main(String[] args) {
		printNumbersUsingForLoop();
		printNumbersUsingWhileLoop();
		printDecrementNumbersUsingForLoop();
		printDecrementNumbersUsingWhileLoop();
	}
}

