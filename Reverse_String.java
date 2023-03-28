package com.ALL_Interview_Programs;

public class Reverse_String {
	
	public static void main(String[] args) {
		
		String d = "grebnesieH : emaN ym yaS";
		
		String d1 = "";
		
		int l = d.length();
		System.out.println(l);
		
		for (int i = d.length()-1; i>=0; i--) {
			
			d1 = d1 + d.charAt(i);
			
		}
		System.out.println(d1);
		
		
		
		
		
	}

}
