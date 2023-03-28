package com.ALL_Interview_Programs;

import java.util.Scanner;

public class String_Palindrome {
	
	public static void main(String[] args) {
		
		
		String original, reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to check the string is palindrome or not");
		
		String original1 = sc.nextLine();
		int length = original1.length();
		
		for (int i = length-1; i>=0; i--) {
			reverse = reverse + original1.charAt(i);
			
		}
		
		if (original1.equalsIgnoreCase(reverse)) {
			
			System.out.println("Entered string is palindrome");
			
		} else {
			System.err.println("Entered String is not palindrome");
		}		
		
		
		
	}

}
