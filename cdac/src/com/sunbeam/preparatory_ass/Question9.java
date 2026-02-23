package com.sunbeam.preparatory_ass;

import java.util.Scanner;

/*
 * Q9. Accept an integer number and when the program is executed print the
 * binary, octal and hexadecimal equivalent of the given number.
 * eg.  Enter Number:20
 * 		Given Number: 20
 * 		Binary equivalent:10100
 * 		Octal equivalent:24
 * 		Hexadecimal equivalent:14
 * */
public class Question9 {
	
	public static void toBinary(int num) {
		String binary="";
		while(num>0) {
			int rem = num%2;
			binary += rem;
			num/=2;
		}
		
		StringBuilder s = new StringBuilder();
		s.append(binary);
		s.reverse();
		System.out.println("Binary: "+s);
		
	}
	
	public static void toOctal(int num) {
		String octal="";
		while(num>0) {
			int rem = num%8;
			octal += rem;
			num/=8;
		}
		
		StringBuilder s = new StringBuilder();
		s.append(octal);
		s.reverse();
		System.out.println("Octal: "+s);
	}
	
	public static void toHexadecimal(int num) {
		String hexa="";
		while(num>0) {
			int rem = num%16;
			hexa += rem;
			num/=16;
		}
		
		StringBuilder s = new StringBuilder();
		s.append(hexa);
		s.reverse();
		System.out.println("Hexadecimal: "+s);
	}

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Input Number: ");
		 int num = sc.nextInt();
		 System.out.println("Given Number: "+num);
		 toBinary(num);
		 toOctal(num);
		 toHexadecimal(num);
	 
	}
}
