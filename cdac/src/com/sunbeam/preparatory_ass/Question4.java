package com.sunbeam.preparatory_ass;

import java.util.Scanner;

/*
 * Q.4. Write a program to calculate the grade of a student. There are five
 * subjects. Marks in each subject are entered from keyword. Assign grade
 * based on the following rule:
 * Total Marks >= 90, Grade:Ex
 * 90 > Total Marks >= 80, Grade:A
 * 80 > Total Marks >=70, Grade:B
 * 70 > Total Marks >=60, Grade:C
 * 60 >Total Marks, Grade: F
 * */
public class Question4 {
	public static void calculateGrade(int marks[]) {
		double totalMarks = 0;
		String grade;
		int sum=0;
		for(int i=0; i<5; i++) {
			sum += marks[i];
		}
		totalMarks = sum/5;
		
		if(totalMarks >= 90) {
			grade = "Ex";
		}else if(totalMarks >= 80) {
			grade = "A";
		}else if(totalMarks >= 70) {
			grade = "B";
		}else if(totalMarks >= 60) {
			grade = "C";
		}else {
			grade = "F";
		}
		
		System.out.println("------->>  Result <<-------");
		System.out.println("-------------------------------");
		for(int i=0; i<5; i++) {
			System.out.println("Marks of Subject "+(i+1)+" : "+marks[i]);
		}
		System.out.println("-------------------------------");
		System.out.println("Total Marks: "+totalMarks);
		System.out.println("-------------------------------");
		System.out.println("You got Grade: "+grade);
		System.out.println("-------------------------------");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your marks of 5 subjects ");
		System.out.println("-------------------------------");
		int marks[]= new int[5];
		for(int i=0; i<5; i++) {
			System.out.println("enter a marks of subject "+(i+1)+" : ");
			marks[i] = sc.nextInt();
			if(marks[i] > 100) {
				System.out.println("marks should less than 100...");
				break;
			}
		}
		System.out.println("-------------------------------");
		calculateGrade(marks);
		
	}

}
