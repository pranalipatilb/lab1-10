package com.capgemini.lab1;

import java.util.Scanner;

public class Lab17 {
	public static void checkNumber(int n)
	{boolean flag = false;
    
  
	
   
   
   //4
   int currentDigit = n % 10;
   n = n/10;
    
  
   while(n>0){
       
       if(currentDigit <= n % 10){
           flag = true;
           break;
       }

       currentDigit = n % 10;
       n = n/10;
   }
    
   
   if(flag){
       System.out.println("is not an increasing number.");
   }else{
       System.out.println("is an increasing number ");
   }

		
	}

public static void main(String args[]) {
        
        Scanner s= new Scanner(System.in);
       int n;
       System.out.println("enter a no");
       n=s.nextInt();
       checkNumber(n);
       
       
}}
