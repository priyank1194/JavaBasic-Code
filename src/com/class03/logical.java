package com.class03;

import java.util.Scanner;

public class logical {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your height in inches");
		int height=scanner.nextInt();
		
		if(height>60 && height<72) {
			System.out.println("medium");
		}else if(height>72) {
			System.out.println("tall");
		}else {
			System.out.println("short");
		}

	}

}
