package com.sunbeam.preparatory_ass;

import java.util.Scanner;

//Q.14. check if String is palindrome.
public class Question_14 {
	
	public static void isPalindrome(String str) {
		String reverse = "";
		char str1[]= str.toCharArray();
		for(int i=str1.length-1; i>=0; i--) {
			reverse += str1[i];
		}
		
		if(reverse.equalsIgnoreCase(str)) {
			System.out.println("String is Palindrome");
		}else {
			System.out.println("String is not Palindrome");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string: ");
		String str = sc.nextLine();
		
		isPalindrome(str);
	}

}
