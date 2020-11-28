package com.capgemini.lab1;

import java.util.Scanner;

public class Lab16 {
	static int calculateDifference(int n){ 
		  
		int l, k, Sum; 
		   l = (n * (n + 1) * (2 * n + 1)) / 6; 
		      
		     k = (n * (n + 1)) / 2; 
		  
		   
		    k = k * k; 
		      
		   Sum = Math.abs(l - k); 
		      
		    return Sum; 
		  
		} 
	public static void main(String s[]) 
	{ Scanner sc= new Scanner(System.in);
	System.out.println("enter no");
	int n = sc.nextInt(); 
	    
	    System.out.println(calculateDifference(n));      
	      
	} 

}
