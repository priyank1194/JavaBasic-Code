package com.class03;

public class DoubleComparision {

	public static void main(String[] args) {
		
		boolean diploma=true;
		double gpa=3.5;
		
		
		
		
		if(diploma) {
			System.out.println("Please check your gpa score");		
			if(gpa>=3.5) {
				System.out.println("You are eligible for scholarship");
			}else if (gpa<3.5) {
				System.out.println("You have to study harder");
			}
			
			else {System.out.println("You do not have a diploma");
			}	
		
		
		
		}
		
		

	}

}
