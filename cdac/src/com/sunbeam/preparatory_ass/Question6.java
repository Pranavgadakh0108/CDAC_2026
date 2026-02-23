package com.sunbeam.preparatory_ass;

import java.util.Scanner;

//Q.6. Write a program to perform matrix multiplication
public class Question6 {
	
	public static void matrixMultiplication(int matrix1[][], int matrix2[][], int r1, int c1, int c2) {
		int result[][] = new int[r1][c2];
		for(int i=0; i<r1; i++) {
			for(int j=0; j<c2; j++) {
				for(int k=0; k<c1; k++) {
					result[i][j] += matrix1[i][k]*matrix2[k][j];
				}
			}
		}
		
		System.out.println("---------------------------------");
		System.out.println("Resultant Matrix: ");
		for(int i=0; i<r1; i++) {
			for(int j=0; j<c2; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num of rows of 1st matrix: ");
		int r1 = sc.nextInt();
		System.out.println("enter num of columns of 1st matrix: ");
		int c1 = sc.nextInt();
		System.out.println("enter num of rows of 2nd matrix: ");
		int r2 = sc.nextInt();
		System.out.println("enter num of columns of 2nd matrix: ");
		int c2 = sc.nextInt();
		
		int matrix1[][]= new int[r1][c1];
		int matrix2[][]= new int[r2][c2];
		
		if(c1==r2) {
			System.out.println("---------------------------------");
			System.out.println("Enter values of matrix1: ");
			for(int i=0; i<r1; i++) {
				for(int j=0; j<c1; j++) {
					System.out.println("enter a value at matrix1["+i+"]["+j+"] : ");
					matrix1[i][j]= sc.nextInt();
				}
			}
			System.out.println("---------------------------------");
			System.out.println("Enter values of matrix2: ");
			for(int i=0; i<r2; i++) {
				for(int j=0; j<c2; j++) {
					System.out.println("enter a value at matrix2["+i+"]["+j+"] : ");
					matrix2[i][j]= sc.nextInt();
				}
			}
			System.out.println("---------------------------------");
			System.out.println("Matrix 1: ");
			for(int i=0; i<r1; i++) {
				for(int j=0; j<c1; j++) {
					System.out.print(matrix1[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("---------------------------------");
			System.out.println("Matrix 2: ");
			for(int i=0; i<r2; i++) {
				for(int j=0; j<c2; j++) {
					System.out.print(matrix2[i][j]+" ");
				}
				System.out.println();
			}
			matrixMultiplication(matrix1,matrix2,r1,c1,c2);
		}else {
			System.out.println("** The Num of columns in 1st matrix and Num of rows in 2nd Matrix should be same..**");
		}

	}

}
