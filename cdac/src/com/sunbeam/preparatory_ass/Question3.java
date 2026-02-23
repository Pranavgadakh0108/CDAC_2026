package com.sunbeam.preparatory_ass;

import java.util.Scanner;

/*
 * Q.3. Write a program to calculate Fibonacci Series up to n number.
 */
public class Question3 {
	
	public static void fibonaaciUptoN(int num) {
		int n1 = 0, n2=1;
		int n3=0;
		System.out.print(n1+" "+n2);
		while(n3<num) {
			n3 = n1+n2;
			n1=n2;
			n2=n3;
			if(n3<=num) {
				System.out.print(" "+n3);
			}			
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int num = sc.nextInt();
		System.out.println("----------------------------");
		System.out.println("Fibonacci Series upto "+num+" :");
		fibonaaciUptoN(num);

	}

}
