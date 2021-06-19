package com.shweta.firstassignment;

import java.util.Scanner;

public class Calculation1 {
	
	public static void sortArray() {
		
		System.out.println("Please enter three different numbers");
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		} 
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n");
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				int temp;
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}	
	public static void main(String[] args) {
		Calculation1.sortArray();
	}
	
}