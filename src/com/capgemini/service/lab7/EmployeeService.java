package com.capgemini.service.lab7;

import java.util.Map;

import com.capgemini.lab7.*;

public interface EmployeeService {
	public abstract void addEmployee(Map<Integer,Employee> empMap );
	public abstract void deleteEmployee(Map<Integer,Employee> empMap , Integer empId);
	public abstract void showEmployeeWithScheme(Map<Integer,Employee> empMap, String scheme);
	public abstract void displayEmployee(Map<Integer,Employee> empMap);
	

}
