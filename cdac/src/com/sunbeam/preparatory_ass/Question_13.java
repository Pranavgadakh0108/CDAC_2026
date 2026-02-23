package com.sunbeam.preparatory_ass;

import java.util.Scanner;

/*
 * Q.13. Declare an Array and initialize it with a few Strings. 
 * Display the string which are duplicated in that array.
 */
public class Question_13 {
	
	public static void displayDuplicateString(String arr[]) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i].equalsIgnoreCase(arr[j])) {
					System.out.println(arr[i]);
					break;
				}
			}
		}
				
	}

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("how many strings wants to enter? :");
		int size = sc.nextInt();
		
		String arr[] = new String[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("enter string "+(i+1)+" : ");
			arr[i]=sc.next();
			
		}
		System.out.println("----------------------------------");
		displayDuplicateString(arr);

	}

}
