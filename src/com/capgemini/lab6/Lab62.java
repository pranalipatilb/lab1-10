package com.capgemini.lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//import statuc java.util.Scanner;

public class Lab62{

	//private Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<Character,Integer> charCountMap=new HashMap();
		System.out.println("Enter the character array");
		char [] charArray=sc.next().toCharArray();
		charCountMap=countChars(charArray);
		for(Map.Entry<Character, Integer> e: charCountMap.entrySet())
		{
			System.out.println(e.getKey()+"--->"+e.getValue());
		}
	}

	private static Map<Character,Integer> countChars(char[] charArray) {
		// TODO Auto-generated method stub
		int i=0,j=0;
		int length=charArray.length;
		int [] count=new int[length];
		for(i=0;i<length;i++)
		{
			count[i]=1;
			for(j=i+1;j<length;j++)
			{
				if(charArray[i]==charArray[j])
				{
					count[i]++;
					charArray[j]='0';//Set charArray[j] to 0 to avoid printing visited character  
					//that is only single char is present in array no repeated
				}
			}
		}
		Map<Character,Integer> charCountMap=new HashMap();
		for(i = 0; i <length; i++) {  
			if(charArray[i] != ' ' && charArray[i] != '0')  
			{
				//System.out.println(charArray[i] + "-" + count[i]);  
				charCountMap.put(charArray[i], count[i]);
			}	
		}  
		return charCountMap;

	}

}
