package com.capgemini.lab3;

import java.util.Scanner;

public class Lab32 {
	
	public static void getImage(StringBuffer a)
	{
	
	StringBuilder input1 = new StringBuilder();
		  
	        input1.append(a);
	        input1 = input1.reverse();
	        System.out.println(a+"|"+input1); 
				
				
			
	}

	 public static void main(String args[]) 
	    { 
		Scanner sc= new Scanner(System.in);   
	    System.out.print("Enter a string: ");  
	    StringBuffer a = new StringBuffer();
	    a.append(sc.nextLine());
	    getImage(a);
		
	        } 
}

