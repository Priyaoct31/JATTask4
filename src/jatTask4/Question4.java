package jatTask4;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// Write a java program to get 2 numbers from the user and swap their values without any loss of data.
		// You can make use of additional variables for swapping.
		//Print the corresponding swapped values of the two numbers as output in the console
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter value a : ");
		int a = sc.nextInt();
		System.out.println("Enter value b : ");
		int b = sc.nextInt();
		
	System.out.println("Before Swapping");
		
		System.out.println("Value of a:" + a);
		System.out.println("Value of b: " + b);
		
		int temp = a;
		a=b;
		b=temp;
		
		System.out.println("After Swapping");
		
		System.out.println("Value of a:" + a);
		System.out.println("Value of b: " + b);
		
		

	}

}
