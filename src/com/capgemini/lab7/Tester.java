package com.capgemini.lab7;
import com.capgemini.service.lab7.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


//import com.cg.training.service.Employee;

public class Tester {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Employee e;
		EmployeeServiceImp emp=new EmployeeServiceImp();
		Map<Integer,Employee> employeeMap= new HashMap<>();
		Integer empId;
//		String Name;
//		Integer Salary;
		Integer scheme;
		char exit;
		int choice;
		do
		{
			System.out.println(
					"1.Add employee \n 2.Get details based on  \n 3.Delete employee \n 4.Display");
			
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				
				emp.addEmployee(employeeMap);
				break;
			case 2:
				System.out.println("Select scheme \n 1.Scheme A \n 2.Scheme B \n 3.Scheme C \n 4.No Scheme \n enter no.");
				scheme=sc.nextInt();
				switch(scheme)
				{
				case 1:emp.showEmployeeWithScheme(employeeMap, "Scheme A");
				break;
				case 2:emp.showEmployeeWithScheme(employeeMap, "Scheme B");
				break;
				case 3:emp.showEmployeeWithScheme(employeeMap, "Scheme C");
				break;
				case 4:emp.showEmployeeWithScheme(employeeMap, "No scheme");
				break;
				default:System.out.println("You have entered wrong choice");
				}
				break;
			case 3: System.out.println("Enter emp id to delete employee details");
			    empId=sc.nextInt(); 
			    emp.deleteEmployee(employeeMap, empId);
			    break;
			case 4:
			    emp.displayEmployee(employeeMap);
			    break;
			}

			System.out.println("Do you want to continue y/n ????");
			exit=sc.next().charAt(0);

		}while(exit=='y');


	}

}
