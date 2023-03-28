package com.ALL_Interview_Programs;

public class Palindrome_Words {
	public static void main(String[] args) {
		
		String a = "Madam";
		String a1 = "";
		
		String b = "Officer";
		String b1 = ""; // -- for storage
		
		
		for (int i = a.length()-1; i>=0; i--) {
			
			a1 = a1 + a.charAt(i);
			
		}
		
		for (int i = b.length()-1; i>=0; i--) {
			
			b1 = b1 + b.charAt(i);
		}
		System.out.println("The given palindrome word is:"+ a);
		System.out.println("Another palindrome word is:"+ b
				);
		
		if (a.equalsIgnoreCase(a1)) {
			System.out.println(a1 + " is palindrome");
			
		} else {
			System.err.println(a1 + " is not palindrome");

		}
		
		if (b.equalsIgnoreCase(b1)) {
			System.out.println(b1 + " is palindrome");
		} else {
			System.err.println(b1 + " is not palindrome");

		}
		
		
		
		
	}
		
	
	}