package com.capgemini.lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab64 {

	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		Map<Integer,Integer> studentInfo=new HashMap();
		System.out.println("Enter Number of students");
		int size=sc.nextInt();
		int studNum=0;
		int marks=0;
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter student registration number");
			studNum=sc.nextInt();
			System.out.println("Enter marks");
			marks=sc.nextInt();
			studentInfo.put(studNum, marks);
		}
		Map<Integer,String> studentMedalInfo=new HashMap();
		studentMedalInfo=getStudents(studentInfo);
		System.out.println("Student N medal list");
		for(Map.Entry<Integer,String> e: studentMedalInfo.entrySet()) {
			System.out.println(e.getKey()+"--->"+e.getValue()); }
	}

	private static Map<Integer, String> getStudents(Map<Integer, Integer> studentInfo) {
		Map<Integer,String> studentMedalInfo=new HashMap();
		for(Map.Entry<Integer, Integer>e : studentInfo.entrySet() )
		{
			if(e.getValue()>=90)
			{
				studentMedalInfo.put(e.getKey(), "Gold");
			}
			else if(e.getValue()>=80 && e.getValue()<90)
			{
				studentMedalInfo.put(e.getKey(), "Silver");
			}
			else if(e.getValue()>=70 && e.getValue()<80)
			{
				studentMedalInfo.put(e.getKey(), "Bronze");
			}
		}

		return studentMedalInfo ;
	}

}
