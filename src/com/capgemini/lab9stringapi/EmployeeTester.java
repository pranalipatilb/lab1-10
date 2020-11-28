package com.capgemini.lab9stringapi;

import java.util.Map;

public class EmployeeTester {
	private static EmployeeService service= new EmployeeService();
	
	public static void main(String[] args) {
		
		System.out.println("\n-----sum of salary of all employees-----\n");
		double totalSal= service.sumOfSalaries();
		System.out.println("Total salary= "+ totalSal);
		
		System.out.println("\n-----department names and count of employees in each department-----\n");
		Map<String,Long> map= service.getDept();
		
		map.forEach((dept, count) -> {
			System.out.println(dept + " -> " + count);
		});
		
		System.out.println("\n---the senior most employee of an organization-----\n");
		System.out.println(service.findSeniorEmployee());
		
		System.out.println("\n----employee name and duration of their service in months and days---\n");
		service.durationOfService();
		
		System.out.println("\n---employees without department.----\n");
		
		service.listEmployeesWithoutDepartment()
		.forEach((emp) -> {
			System.out.println("Employee ID : " + emp.getEmployeeId() + " | Employee Name : " + 
					emp.getFirstName() + " " + emp.getLastName());
		});
		
		System.out.println("\n---Find out department without employees----\n");
		service.listDepartmentsWithoutEmployees()
		.forEach((deptName, count) -> {
            if (count == 0) System.out.println(deptName + ":" + count);
        });

		System.out.println("\n----departments with highest count of employees----\n");
		Department dept = service.getDeptWithHighEmp();
		System.out.println(dept);
		
		
		System.out.println("\n----employee name, hire date and day of week on which employee has started----\n");
		service.showHireDetails();
		
		System.out.println("\n----employee name, hire date and day of week for employee started on Friday.----\n");
		service.filterByWeekDay("Friday")
		.forEach((emp)-> System.out.println(emp));
		
		System.out.println("\n-----List employee’s names and name of manager to whom he/she reports------\n");
		service.printReportByManager();
		
		System.out.println("\n------employee name, salary and salary increased by 15%-------\n");
		service.incrementSalary();
		
		System.out.println("\n------employees who didn’t report to anyone-----\n");
		service.filterByNoManager()
		.forEach((emp) -> System.out.println(emp));

		System.out.println("\n----List of subordinates under manager ID 100---\n");
		service.listSubordinates(100)
		.forEach((emp) -> System.out.println(emp));
		
		System.out.println("\n---Sorted by employee ID----\n");
		service.sortById()
		.forEach((emp) -> System.out.println(emp));
		
		System.out.println("\n---Sorted by department ID----\n");
		service.sortByDeptId()
		.forEach((emp) -> System.out.println(emp));
		
		System.out.println("\n---Sorted by first Name----\n");
		service.sortByFirstName()
		.forEach((emp) -> System.out.println(emp));
		
	}

}
