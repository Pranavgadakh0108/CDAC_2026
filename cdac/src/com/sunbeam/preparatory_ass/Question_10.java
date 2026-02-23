package com.sunbeam.preparatory_ass;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Q10. Read at most 10 names of students and store them into an array of
 * char nameOfStudents[10][50]. Sort the array and display them back.
 * */
public class Question_10 {
	
	public static void displayStudents(String nameOfStudents[]) {
		System.out.println("-----------------------------");
		System.out.println("Students before sorting: ");
		for(int i=0; i<10; i++) {
			System.out.println(nameOfStudents[i]);
		}
		
		Arrays.sort(nameOfStudents);
		
		System.out.println("-----------------------------");
		System.out.println("Students after sorting: ");
		for(int i=0; i<10; i++) {
			System.out.println(nameOfStudents[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nameOfStudents[]= new String[10];
		System.out.println("Enter 10 students names: ");
		for(int i=0; i<10; i++) {
	        System.out.println("Enter name of student "+(i+1)+" : ");
			nameOfStudents[i] = sc.nextLine().toUpperCase();
		}
		
		displayStudents(nameOfStudents);
	}
}
