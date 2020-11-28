package com.capgemini.lab9;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class Lab92 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Consumer <String> consumer=
				str-> {
					String str2=new String();
					for(int i=0;i<str.length();i++)
					{
						str2=str2.concat(str.charAt(i)+" ");
					}
					System.out.println(str2);
				};
		System.out.println("Enter string to seperate");
		String str=sc.next();
		consumer.accept(str);

	}

}
