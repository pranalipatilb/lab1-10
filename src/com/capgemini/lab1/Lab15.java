package com.capgemini.lab1;

import java.util.Scanner;

public class Lab15 {
	static void calculateSum (int n) 
{   int sum=0;
   
    for (int num = 0; num < n; num++) 
    {  
        if (num % 3 == 0 && num % 5 == 0) 
        	{sum=sum+num;}}
           System.out.print(sum + " "); 
       
} 
   

public static void main(String []args) 
{  
	int n = 0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter no");
	n=s.nextInt();
	
	calculateSum(n); 

}}
