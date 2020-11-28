package com.capgemini.lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab63 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<Integer,Integer> intSqMap=new HashMap();
		System.out.println("Enter size");
		int size=sc.nextInt();
		System.out.println("Enter the array");
		int [] intArray=new int[size];
		for(int i=0;i<size;i++)
		{
			intArray[i]=sc.nextInt();
		}
		intSqMap=getSquare(intArray);
		for(Map.Entry<Integer, Integer> e: intSqMap.entrySet())
		{
			System.out.println(e.getKey()+"--->"+e.getValue());
		}
		
	}

	private static Map<Integer, Integer> getSquare(int[] intArray) {
		
		Map<Integer,Integer> intSqMap=new HashMap();
		for(int i = 0; i < intArray.length; i++) {  
			
				//System.out.println(charArray[i] + "-" + count[i]);  
			intSqMap.put(intArray[i], (intArray[i]*intArray[i]));
				
		}  
		
		return intSqMap ;
	}

}
