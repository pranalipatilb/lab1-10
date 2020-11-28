package com.capgemini.lab1;
import java.util.*; 
import java.lang.*; 
class exersice1
{ 
  

    public static int sumOfSeries(int n) 
    { 
        int sum = 0; 
        for (int x=1; x<=n; x++) 
            sum += x*x*x; 
        return sum; 
    } 
  
 public static void main(String[] args) 
    {   Scanner s= new Scanner(System.in);
        System.out.println("enter no");
        int n = s.nextInt(); 
        System.out.println(sumOfSeries(n)); 
  
    } 
} 