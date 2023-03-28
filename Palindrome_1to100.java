package com.ALL_Interview_Programs;

import java.util.Scanner;

public class Palindrome_1to100 {
	
	public static void main(String[] args) {
		for (int n = 1; n <=100; n++) {
			int a, i = 0, j = 0;
			a = n;
			while (a>0) {
				i = a%10;
				j = (j*10) + i;
				a = a / 10;
			}
			if (n==j) {
				System.err.println(n);
			}
			
		}
		
			
			
			
			
			
			
			
		}
		
		
		
		
		
	}


