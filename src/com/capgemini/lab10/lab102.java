package com.capgemini.lab10;

import com.capgemini.lab10.lab102filedetails;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class lab102 {

	  public static void main(String rr[])throws IOException
      {
		  lab102filedetails f=new lab102filedetails();
             BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
             System.out.println("Enter file name");
             String s=br.readLine();
             f.analyze(s);
      }
}
