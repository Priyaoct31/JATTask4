package jatTask4;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// Write a program to count the number of digits in an integer
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		
		int count=0;
		
		while (number>0) {
			
			count++;
			number=number/10;
			
		}
		
		System.out.println("Count of digits is :" + count);
	}


	}


