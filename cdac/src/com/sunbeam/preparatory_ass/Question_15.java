package com.sunbeam.preparatory_ass;

import java.util.Scanner;

/*
 * Q15. Input a string from the user. Count occurrences of each alphabet in string.
 * input: Welcome to SunBeam
 * output:  A:1
 * 			B:1
 * 			C:1
 * 			E:3
 * 			L:1
 * 			M:2
 * 			N:1
 * 			O:2
 * 			S:1
 * 			T:1
 * 			U:1
 *			W:1
 * 
 */
public class Question_15 {
	
	public static void countAlphabets(String s) {
		int arr[] = new int[100];
		char alpha[]= s.toUpperCase().toCharArray();
		
		for(int i=0; i<alpha.length; i++) {
			int j = alpha[i];
			arr[j]++;
		}
		
		for(int i=0; i<arr.length; i++ ) {
			if(arr[i]>0) {
				if(i!=32) {
					System.out.println(Character.toString((char)i)+" : "+arr[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		
		countAlphabets(s);
	}

}
