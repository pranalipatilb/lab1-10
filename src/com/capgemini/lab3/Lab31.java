package com.capgemini.lab3;

import java.util.Scanner;

import java.util.StringTokenizer;

public class Lab31 { 
	public static void main(String args[]) {
    int n;
    int sum = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter integers with one space gap:");
    String s = sc.nextLine();
    StringTokenizer st = new StringTokenizer(s, " ");
    while (st.hasMoreTokens()) {

        n = Integer.parseInt(st.nextToken());
        System.out.println(n);
        sum = sum + n;
    }
    System.out.println("Sum of the integers is: " + sum);
    sc.close();
   }}
