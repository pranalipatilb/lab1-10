package com.capgemini.lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Lab66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc=new Scanner(System.in);
		Map<Integer,Integer> voterInfo=new HashMap();
		System.out.println("Enter Number of voters");
		int size=sc.nextInt();
		int voterId=0;
		int age=0;
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter voter id ");
			voterId=sc.nextInt();
			System.out.println("Enter age");
			age=sc.nextInt();
			voterInfo.put(voterId, age);
		}
		List<Integer> validIdList =new ArrayList();
		validIdList=votersList(voterInfo);
		Iterator<Integer> iterator=validIdList.iterator();
		System.out.println("Valid Voter id ");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	private static List<Integer> votersList(Map<Integer, Integer> voterInfo) {
		List<Integer> validIdList =new ArrayList();
		for(Map.Entry<Integer, Integer>e : voterInfo.entrySet() )
		{
			if(e.getValue()>18)
			{
				validIdList.add(e.getKey());
			}
		}
		return validIdList;
	}

}
