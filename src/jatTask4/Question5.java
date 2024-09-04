package jatTask4;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// Write a program to check whether a number is prime or not
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println(" Enter a number: ");
		
		int n = sc.nextInt();
		
		boolean result=true;
		
		if (n==0||n==1) {
			
			System.out.println("0 and 1 are not considered as Prime numbers");
			
		} else {
			for (int i = 2; i < n/2; i++) {
				
				if (n%i==0) {
					
					result = false;
					break;
				}
				
			}
			if (result) {
				
				System.out.println("Prime Number");
				
			}
			else {
				
				System.out.println("Not a Prime Number");
			}

		}
	}


	}


