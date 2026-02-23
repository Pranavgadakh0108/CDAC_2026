package com.sunbeam.preparatory_ass;

import java.util.Scanner;

/*
 * Q5. Write a program to check the input characters for uppercase, lowercase, 
 * number of digits and other characters. Display appropriate message.
*/
public class Question5 {
	
	public static void checkCharacter(char c) {
		if(Character.isUpperCase(c)) {
			System.out.println("character is Uppercase");
		}else if(Character.isLowerCase(c)) {
			System.out.println("character is Lowercase");
		}else if(Character.isDigit(c)) {
			System.out.println("character is Digit");
		}else {
			System.out.println("character is Symbol");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter character: ");
		char c = sc.next().charAt(0);
		
		checkCharacter(c);
	}
}
