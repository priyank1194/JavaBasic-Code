package com.class03;

import java.util.Scanner;

public class creditCrad {

		public static void main(String[]args){

		    
		    Scanner scanner=new Scanner(System.in);
		    System.out.println("Do you have a credit card: Enter Y or N");
		    String y="Y";
		    String answer=scanner.next();
		    
		    
		    if(answer.equalsIgnoreCase ("y") ) {
		    	System.out.println("Please enter balance on card");
		    	int balance=scanner.nextInt();
		    	if(balance<=1000){
		    		System.out.println("You can Spend more");
		    		
		    	}else {
		    		System.out.println("Please pay off immediately");
		    	}
		    	
		    }  	else {
		    	System.out.println("We will offer you a credit card");
		    	
		     }
		    		    
		    
	}

}
