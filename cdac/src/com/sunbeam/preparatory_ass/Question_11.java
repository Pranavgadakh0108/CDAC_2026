package com.sunbeam.preparatory_ass;
/*
 * Create a structure called Employee that includes three fields - a first name(string),
 * a last name(string) and a monthly salary (double). Write a functions to initialize the fields,
 * print them and modify the values in the given object.
 * Write the test ode in main(). Create two emp objects and display each object's yearly salary. Then
 * give each Employee a 10% raise and display each Employee's yearly salary again.
 */

import java.util.Scanner;

class Employee{
	String firstName;
	String lastName;
	double monthlySalary;
	
	Scanner sc = new Scanner(System.in);
	
	public void emp_init(Employee e) {
		System.out.println("Enter employee First Name: ");
		e.firstName = sc.nextLine();
		System.out.println("Enter Employee Last Name: ");
		e.lastName = sc.nextLine();
		System.out.println("Enter Employee Monthly Salary: ");
		e.monthlySalary = sc.nextDouble();
		System.out.println("--------------------------------------------");
	}
	
	public void set_salary(Employee e,double sal) {
		sal += (e.monthlySalary*0.1);
		e.monthlySalary = sal;
		System.out.println("After 10% Raise: ");
		System.out.println("--------------------------------------------");
		emp_display(e);
		
	}
	
	public void emp_display(Employee e) {
		System.out.println("Employee Name: "+e.firstName+" "+e.lastName);
		System.out.println("Employee Monthly Salary: "+e.monthlySalary);
		System.out.println("Employee Yearly Salary: "+(e.monthlySalary*12));
		System.out.println("--------------------------------------------");
	}
}
public class Question_11 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.emp_init(e1);
		e2.emp_init(e2);
		e1.emp_display(e1);
		e2.emp_display(e2);
		e1.set_salary(e1, e1.monthlySalary);
		e2.set_salary(e2, e2.monthlySalary);
		
		
	}

}
