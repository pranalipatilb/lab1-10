package com.capgemini.lab9;


public class Employee {
	private Integer empid;
	private String ename;
	
	
	public Employee() {
		
	}

	public Employee(Integer empid, String ename) {
		super();
		this.empid = empid;
		this.ename = ename;
		
	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + "]";
	}

	
	
	
}
