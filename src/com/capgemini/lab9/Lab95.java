package com.capgemini.lab9;
import java.util.Scanner;
import java.util.function.Function;

public class Lab95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab95 factorial=new Lab95();
		Scanner sc=new Scanner(System.in);
		// method reference
		Function <Integer,Integer> function = factorial::fact;
		System.out.println("Enter Number to get factorial");
		int number=sc.nextInt();
		System.out.println("Factorial of "+number+"="+function.apply(number));
	}
	 public Integer fact(int number)
	 {
		 if(number ==0 || number ==1)
		 {
			 return 1;
		 }
		 else
		 {
			 return number*fact(number-1);
		 }
	 }

}
