package com.class03;

import java.util.Scanner;

public class ageint {

	public static void main(String[]args){

	    
	    Scanner scanner=new Scanner(System.in);
	    System.out.println("Enter Your Age");
	    int age=scanner.nextInt();
	    
	    if(age>=18) {
	    	System.out.println("You can issue a driver license");
	    }else {
	    	
	    	System.out.println("You are not eligible for driver license");
	    }
	    }
	    
	    

	
	
}
