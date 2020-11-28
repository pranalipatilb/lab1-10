package com.capgemini.lab9stringapi;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;



/**
 * The Class EmployeeService.
 */
public class EmployeeService {

	static long max = 0;
	static Department highest = null;

	
	/**
	 * Find out the sum of salary of all employees.
	 *
	 * @return the double
	 */
	
	public Double sumOfSalaries() {
		List<Employee> employeeList = EmployeeRepository.getEmployees();

		Optional<Double> optional = employeeList.stream()
				.map((e) -> e.getSalary())
				.reduce((a, b) -> a + b);

		if (optional.isPresent()) {
			return optional.get();
		} else {
			return 0.0;
		}

	}
	
	
	
	/**
	 * List out department names and count of employees in each department.
	 *
	 * @return the dept
	 */
	public Map<String, Long> getDept() 
	{
		List<Employee> employeeList = EmployeeRepository.getEmployees();

		Map<String, Long> employeeCountByDepartment = employeeList.stream()
				.collect(Collectors.groupingBy(dept -> dept.getDepartment().getDepartmentName(), 
						Collectors.counting()));
		return employeeCountByDepartment;
	}
	
	/**
	 * Find out the senior most employee of an organization.
	 *
	 * @return the employee
	 */
	 
	public Employee findSeniorEmployee()
	{
		List<Employee> employeeList = EmployeeRepository.getEmployees();
		
		Optional<Employee> senior = employeeList.stream()
				.reduce((emp1, emp2) -> 
				(emp1.getHireDate().isBefore(emp2.getHireDate()) ? emp1 : emp2));
		if(senior.isPresent())
			return senior.get();
		return null;
	}

	/**
	 *List employee name and duration of their service in months and days
	 */
	
	public void durationOfService()
	{
		List<Employee> employeeList = EmployeeRepository.getEmployees();
		
		employeeList.stream()
		.forEach(emp -> {
			Period period = emp.getHireDate().until(LocalDate.now());
			System.out.println("Employee ID : " + emp.getEmployeeId() + " | Months : " +
			ChronoUnit.MONTHS.between(emp.getHireDate(), LocalDate.now())
			+ " | Days : " + period.getDays());
		});
	}

	/**
	 * List employees without department.
	 *
	 * @return the list
	 */
	
	public List<Employee> listEmployeesWithoutDepartment()
	{
		List<Employee> employeeList = EmployeeRepository.getEmployees();
		return employeeList.stream()
		.filter(emp -> (emp.getDepartment() == null))
		.collect(Collectors.toList());
	}

	/**
	 *Find out department without employees
	 *
	 * @return the map
	 */
	
	public  Map<String, Long> listDepartmentsWithoutEmployees() 
	{
		List<Employee> employeeList = EmployeeRepository.getEmployees();
		return employeeList.stream().collect(
        		Collectors.groupingBy(dept -> dept.getDepartment().getDepartmentName(), 
        				Collectors.counting()));
		
	}

	
	/**
	 *  Find departments with highest count of employees
	 *
	 * @return the dept with high emp
	 */
	public Department getDeptWithHighEmp()
	{
		List<Employee> employeeList = EmployeeRepository.getEmployees();
		Map<Department, Long> employeeCountByDepartment = employeeList.stream().collect(
        		Collectors.groupingBy(dept -> dept.getDepartment(), 
        				Collectors.counting()));
		
		employeeCountByDepartment.forEach((dept, count) -> {
			if(count > max) {
				max = count;
				highest = dept;
			}
		});
		
		return highest;
	}
	
	/**
	 *List employee name, hire date and day of week on which employee has started
	 */

	public void showHireDetails()
	{
		List<Employee> employeeList = EmployeeRepository.getEmployees();
		employeeList.stream()
		.forEach((emp) -> {
			System.out.println("Name: " + emp.getFirstName() + " " + emp.getLastName() + 
					" | Hire Date: " + emp.getHireDate() + " | " + emp.getHireDate().getDayOfWeek().toString());
		});
	}
	
	/**
	 *List employee name, hire date and day of week for employee started on Friday.
	 * @param weekDay the week day
	 * @return the list
	 */
	
	public List<Employee> filterByWeekDay(String weekDay) {
		
		List<Employee> employeeList = EmployeeRepository.getEmployees();
		
		return employeeList.stream()
		.filter((emp) -> emp.getHireDate().getDayOfWeek().toString().equalsIgnoreCase(weekDay))
		.collect(Collectors.toList());
	}
	
	/**
	 * List employee’s names and name of manager to whom he/she reports. 
	 * Create a report in format “employee name reports to manager name”
	 */
	
	public void printReportByManager() {
		List<Employee> employeeList = EmployeeRepository.getEmployees();
		
		employeeList.stream()
		.forEach((emp) -> {
			System.out.println(emp.getFirstName() + " " + emp.getLastName() + 
					" reports to manager " + emp.getManagerId());
		});
	}

	/**
	 *  List employee name, salary and salary increased by 15%
	 */

	public void incrementSalary() {
		List<Employee> employeeList = EmployeeRepository.getEmployees();
		employeeList.stream()
		.forEach((emp) -> {
			Double inc = (Double)emp.getSalary() * 0.15 + emp.getSalary();
			System.out.println(emp.getFirstName() + " " + emp.getLastName() + 
					" | " + emp.getSalary() + " | " + inc);
		});
	}
	
	/**
	 *  Find employees who didn’t report to anyone
	 *
	 * @return the list
	 */
	
	public List<Employee> filterByNoManager() {
		
		List<Employee> employeeList = EmployeeRepository.getEmployees();
		
		 return employeeList.stream()
		.filter((emp) -> emp.getManagerId() == null)
		.collect(Collectors.toList());
	}
	
	/**
	 * List subordinates.
	 *
	 * @param managrId the managr id
	 * @return the list
	 */
	
	public List<Employee> listSubordinates(int managrId) {
		List<Employee> empList = EmployeeRepository.getEmployees();
		
		return empList.stream()
		.filter((emp) -> emp.getManagerId() == managrId)
		.collect(Collectors.toList());
	}
	
	/**
	 * Sort by id.
	 *
	 * @return the list
	 */
	
	
	public List<Employee> sortById() {
		List<Employee> empList = EmployeeRepository.getEmployees();
		
	        return empList.stream()
	               .sorted(Comparator.comparingInt(Employee::getEmployeeId))
	               .collect(Collectors.toList());	
	}
	
	/**
	 * Sort by dept id.
	 *
	 * @return the list
	 */
	public List<Employee> sortByDeptId() {
		List<Employee> empList = EmployeeRepository.getEmployees();
		
	       return empList.stream()
	               .sorted(Comparator.comparing((emp) -> emp.getDepartment().getDepartmentId()))
	               .collect(Collectors.toList());
	}
	
	/**
	 * Sort by first name.
	 *
	 * @return the list
	 */
	public List<Employee> sortByFirstName() {
		List<Employee> empList = EmployeeRepository.getEmployees();
		
		return empList.stream()
	               .sorted(Comparator.comparing((emp) -> emp.getFirstName().toLowerCase()))
	               .collect(Collectors.toList());
	}


	
}
