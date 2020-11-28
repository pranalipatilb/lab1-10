package com.capgemini.lab3;


	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.time.*;
	import java.util.*;
	public class Lab39 {
	 private static Scanner sc = new Scanner(System.in);
	 public static LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
	     return dateToConvert.toInstant()
	       .atZone(ZoneId.systemDefault())
	       .toLocalDate();
	 }
	public static void main(String[] args) {
	System.out.println("Enter Date:");
	String birthdate = sc.next();
	SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-DD-mm");

	Date myBirthdate;
	try {
	myBirthdate = sdf1.parse(birthdate);
	LocalDate pdate=convertToLocalDateViaInstant(myBirthdate);

	LocalDate now = LocalDate.now();
	System.out.println("Current Date:");
	      System.out.println(now);
	       Period diff = Period.between( pdate, now);

	    System.out.printf("\nDifference is %d years, %d months and %d days old\n\n",
	                   diff.getYears(), diff.getMonths(), diff.getDays());
	} catch (ParseException e) {
	e.printStackTrace();
	}
	}

	}

