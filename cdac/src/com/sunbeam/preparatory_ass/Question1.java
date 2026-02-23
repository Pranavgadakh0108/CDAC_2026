package com.sunbeam.preparatory_ass;

import java.util.Scanner;

/*
 * Q.1. Write a program to input n numbers on command line argument and calculate max of them.
 */

public class Question1 {
	
	public static int calculateMax(int arr[]) {
		
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many numbers want's to enter: ");
		int n = sc.nextInt();
		int arr[]= new int[n];
		System.out.println("-------------------------");
		for(int i=0; i<n; i++) {
			System.out.println("enter number "+(i+1)+": ");
			arr[i]=sc.nextInt();
		}
		System.out.println("-------------------------");
		
		System.out.println("Max Number is: "+calculateMax(arr));

	}

}
