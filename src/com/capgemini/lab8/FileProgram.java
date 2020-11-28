package com.capgemini.lab8;


public class FileProgram {

	
	public static void main(String[] args) {
		Thread t1=new CopyDataThread();
		t1.start();

	}

}
