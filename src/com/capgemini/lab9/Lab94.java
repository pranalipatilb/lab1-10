package com.capgemini.lab9;
//Exercise 4: Write a class with main method to demonstrate instance creation using method
//reference. (Hint: Create any simple class with attributes and getters and setters)
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;

public class Lab94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Employee> emplist=new ArrayList<>();
		Supplier <Employee> supplier=
				() ->
				{
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter emp id");
					int id=sc.nextInt();
					System.out.println("Enter emp name");
					String name=sc.next();
					return new Employee(id,name);
				};
			for(int i=0;i<2;i++)
			{
				emplist.add(supplier.get());
			}
			emplist.stream()
			.map( Employee :: getEname) //method refernce
			.forEach(System.out :: println);// method refernec

	}

}
