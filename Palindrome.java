package com.ALL_Interview_Programs;

import java.util.Scanner;

public class Palindrome {

	//Palindrome = deed console: deed reverse will be same as original
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int a, i=0,j=0;
		a = n;
		while (a>0) {
			
			i = a % 10;
			j = (j*10) + i;
			a = a/10;
				
			
		}
				
		System.out.println(j);
		if (n == j) {
			
			System.out.println("The given number is palindrome");
			
		} else {
			System.err.println("it is not palindrome");

		}
		
		
	}
}
