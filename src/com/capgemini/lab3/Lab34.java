package com.capgemini.lab3;

import java.util.Scanner;

public class Lab34 {
	static int modifyNumber(int x, int d1, int d2)
    {
        int result = 0, multiply = 1;
 
        while (x / 10 > 0) 
        {
 
            
            int remainder = x % 10;
 
             if (remainder == d1)
                result = result + d2 * multiply;
 
            else
                result = result + remainder * multiply;
 
            
            multiply *= 10;
            x = x / 10; 
        }
 
        
        if (x == d1)
            result = result + d2 * multiply;
 
        else 
            result = result + x * multiply;
        return result;
    }
	 public static void main(String[] args)
	    {	Scanner sc= new Scanner(System.in);      
	        System.out.print("Enter first number- ");  
	        int x= sc.nextInt(); 
	        System.out.println("enter a no to replace with what-");
	        int d1= sc.nextInt(); 
	        int d2= sc.nextInt(); 
	        System.out.println(modifyNumber(x, d1, d2));
	    }

}
