package com.sunbeam.preparatory_ass;
/*
 * Write a program to read the name of a student (studentName), roll Number (rollNo)
 * and marks (totalMarks) obtained. rollNo may be an alphanumeric string. Display the data as read.
 * */

import java.util.Scanner;

class Student{
	String studentName;
	String rollNo;
	int totalMarks;
	
	Scanner sc = new Scanner(System.in);
	
	public void getData() {
		System.out.println("enter student name: ");
		studentName = sc.nextLine();
		System.out.println("enter student rollNo: ");
		rollNo = sc.next();
		System.out.println("enter student marks: ");
		totalMarks = sc.nextInt();
	}
	
	public void displayData() {
		getData();
		System.out.println("-------------------------------");
		System.out.println("Student Name: "+studentName);
		System.out.println("Student Roll Number: "+rollNo);
		System.out.println("Student Marks: "+totalMarks);
		System.out.println("-------------------------------");
		
	}
}

public class Question8 {

	public static void main(String[] args) {
		Student s = new Student();
		s.displayData();
	}
}
