package com.cg.demo.lab5;

import java.util.Scanner;

class AgeException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AgeException(String str) {
		  System.out.println(str);
		 }
}


public class Lab5Ex1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		try {
			if(age < 15) 
				throw new AgeException(age + " is Invalid age...");
			
			else 
				System.out.println(age + " is Valid age...");
			
			}
		catch(AgeException ae){
			System.out.println(ae);
		}
		finally{
			sc.close();
		}
	}
}


