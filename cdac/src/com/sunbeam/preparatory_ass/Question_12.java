package com.sunbeam.preparatory_ass;

import java.util.Scanner;

//Q.12. WAP to reverse the letters present in the given String.
public class Question_12 {
	
	public static void reverseString(String str) {
		char newStr[] = str.toCharArray();
		System.out.println("Input String: "+str);
		System.out.print("\nOutput String: ");
		for(int i=newStr.length-1; i>=0; i--) {
			System.out.print(newStr[i]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = sc.nextLine();
		
		reverseString(str);

	}

}
