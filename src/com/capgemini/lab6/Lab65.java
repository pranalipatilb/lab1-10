package com.capgemini.lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lab65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		System.out.println("Enter the array");
		int [] intArray=new int[size];
		for(int i=0;i<size;i++)
		{
			intArray[i]=sc.nextInt();
		}
		int smallest=getSecondSmallest(intArray);
		System.out.println("Second smallest element in array --> "+smallest);
	}

	private static int getSecondSmallest(int[] intArray) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList();
		for(int a:intArray)
		{
			list.add(a);
		}
		Collections.sort(list);
		return list.get(1);
	}

}
