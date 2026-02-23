package com.sunbeam.preparatory_ass;

import java.util.Scanner;

//Q.2. Write a program to calculate a Factorial of a number.

public class Question2 {
	
	public static int factorial(int num) {
		if(num == 0 || num == 1) {
			return 1;
		}else {
			int fact =1;
			while(num>0) {
				fact = fact*num;
				num--;
			}
			return fact;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int num = sc.nextInt();
		System.out.println("Factorial of "+num+" is: "+factorial(num));

	}

}
