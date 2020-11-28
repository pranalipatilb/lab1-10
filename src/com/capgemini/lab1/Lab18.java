package com.capgemini.lab1;

import java.util.Scanner;

public class Lab18 {
	public static boolean checkNumber(int n) 
	{if(n==0)
	    return false;
	 
	return (int)(Math.ceil((Math.log(n) / Math.log(2)))) == 
	       (int)(Math.floor(((Math.log(n) / Math.log(2)))));
		
	}
	
	public static void main(String[] args)
	{int n=0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter a no");
	n=s.nextInt();
	if(checkNumber(n))
	    System.out.println(n+" is a power of 2");
	    else
	    System.out.println(n+" is not a power of 2");
	     
	}
}
