package com.sunbeam.preparatory_ass;

import java.util.Scanner;

//Q.7 WAP to accept a number from user using command line argument and display its table.
public class Question7 {
	
	public static void numTable(int num) {
		System.out.println("Table of "+num+" : ");
		for(int i=1; i<=10; i++) {
			System.out.println(i*num);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		numTable(num);
	}

}
