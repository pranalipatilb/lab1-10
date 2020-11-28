package com.capgemini.lab8;

public class Lab82tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable runnable=new Lab82();
		Thread t1=new Thread(runnable);
		t1.start();

	}

}
