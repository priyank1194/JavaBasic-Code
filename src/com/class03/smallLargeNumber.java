package com.class03;

import java.util.Scanner;

public class smallLargeNumber {

	public static void main(String[]args) {
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter a number");
		int num=scanner.nextInt();
		
		if (num>=1 && num<=10) {
			System.out.println("Small number");
		}else if(num>=11 && num<=100) {
		
			System.out.println("Medium number");
			
		}
		else if(num>=101 && num<=1000) {
		
			System.out.println("Large number");
		}
	}
	
	
	
}
