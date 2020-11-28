package com.cg.training.service.lab5;

import java.util.Scanner;

import com.cg.eis.exception.NameException;



public class NameTester {

	private static Scanner scanner=new Scanner(System.in);
	
	public static void main(String[] args) {
		NameTester nt = new NameTester();
		try {
			
		System.out.println("Enter first name");
		String firstName=scanner.nextLine();
		System.out.println("Enter last name");
		String lastName=scanner.nextLine();
		
		if(firstName.equals("") && lastName.equals("")) {
		  throw new NameException("First name and last name can not be blank");
		}else {
			System.out.println(firstName+" "+lastName);
		}
		}catch(NameException e){
			//nt.getMessage();
			e.printStackTrace();
			System.out.println("First name and last name can not be blank");
		}
		
	}

}
