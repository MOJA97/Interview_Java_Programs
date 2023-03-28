package com.ALL_Interview_Programs;

import java.util.Scanner;

public class Reverse_Number {
	 
	//reverse the number
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int a, i = 0, j = 0;
		a=n;
		// a= sc.nextInt;
		while (a > 0) {
			i = a%10;
			j = (j*10) + i;
			
			a = a /10;
			
		}
	System.out.println("the reverse number is "+ j);
	

}
}