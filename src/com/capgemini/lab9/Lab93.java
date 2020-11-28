package com.capgemini.lab9;
import java.util.Scanner;
import java.util.function.BiPredicate;

public class Lab93 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BiPredicate <String,String> bipredicate =
				(userid,password) ->
		{
			if(userid.equals("Kshitija") && password.equals("Kshit@24"))
			{
				return true;
			}
			return false;
		};
		System.out.println("Enter user id");
		String id=sc.next();
		System.out.println("Enter password");
		String pd=sc.next();


		if(bipredicate.test(id,pd))
		{ System.out.println("Login succsessfully"); }
		else 
		{ System.out.println("Wrong credentials .... authentication error"); }

	}

}
