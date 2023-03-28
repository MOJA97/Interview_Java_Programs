package com.ALL_Interview_Programs;

import java.util.Scanner;

public class Armstrong {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int a, i =0, j=0;
		a = n;
		while (a > 0) {
			i = a%10;
			j = (i*i*i) + j;
			a = a/10;
			
		}
		if (n == j) {
			System.out.println("it is armstrong number");
			
		} else {
			System.err.println("the given number is not a Armstrong");

		}
		
		
	}

}
