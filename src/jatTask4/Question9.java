package jatTask4;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// Write a program to check whether the person is a senior citizen or not
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age: ");
		int age = sc.nextInt();
		
		if(age>60) {
			
			System.out.println("Senior Citizen");
	}
		else {
			
			System.out.println("Not a Senior Citizen");
		}
	}
}



