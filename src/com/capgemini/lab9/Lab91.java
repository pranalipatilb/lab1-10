package com.capgemini.lab9;

import java.util.Scanner;

public class Lab91{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		Lab91interface result=(num1,num2)-> Math.pow(num1, num2);
		//System.out.println(result.power(2.0, 4.0));
		System.out.println("Enter Both x and y");
		Double x=sc.nextDouble();
		Double y=sc.nextDouble();
		System.out.println("Result: "+result.power(x,y));

	}

}
