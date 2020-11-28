package com.capgemini.service.lab7;

import java.util.Map;
import java.util.Scanner;

import com.capgemini.lab7.*;
public class EmployeeServiceImp implements EmployeeService {

	

	@Override
	public void addEmployee(Map<Integer, Employee> empMap) {
		Employee e;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter empid");
		Integer empId=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name");
		String Name=sc.nextLine();
		System.out.println("Enter Salary");
		Integer Salary=sc.nextInt();
		e=new Employee(empId,Name,Salary);
		if(e.getSalary()>=5000 && e.getSalary()<20000)
		{
			e.setInsScheme("Scheme C");
			e.setDesignation("System Associate");
		}
		else if(e.getSalary()>=20000 && e.getSalary()<40000)
		{
			e.setInsScheme("Scheme B");
			e.setDesignation("Programmer");
		}
		else if(e.getSalary()>=40000)
		{
			e.setInsScheme("Scheme A");
			e.setDesignation("Manager");
		}
		else
		{
			e.setInsScheme("No scheme");
			e.setDesignation("Clerk");
		}
		empMap.put(e.getId(), e);
		
		
	}

	@Override
	public void deleteEmployee(Map<Integer, Employee> empMap, Integer empId) {
		// TODO Auto-generated method stub
		empMap.remove(empId);
		
	}

	@Override
	public void displayEmployee(Map<Integer, Employee> empMap) {
		// TODO Auto-generated method stub
		for(Map.Entry<Integer, Employee> e:empMap.entrySet() ) {
			{
				System.out.println(e.getValue().toString());
			}
		}
		
	}

	@Override
	public void showEmployeeWithScheme(Map<Integer,Employee> empMap, String scheme) {
		// TODO Auto-generated method stub
		for(Map.Entry<Integer, Employee> e:empMap.entrySet() )
		{
			if(e.getValue().getInsScheme().equals(scheme))
			{
				System.out.println(e.getValue().toString());
			}
			
		}
		
	}

	

	

}
