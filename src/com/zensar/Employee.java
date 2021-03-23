package com.zensar;

import java.io.Serializable;

public class Employee implements Serializable{
	private int employeeId;
	protected static int i=10;
	private static Employee e1;
	private int employeeSalary;
	private String employeeName;
	
	public Employee()
	{
		super();
	}
	
	public Employee(int employeeId, String employeeName, int employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeSalary = employeeSalary;
		this.employeeName = employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String toString()
	{
	    return employeeId+" "+employeeName+" "+employeeSalary;
	}
	/*public int calculateSalary()
	{
		return 0;
	}*/
	

	public int calculateSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int compareTo(Object o) {
		// TODO Auto-generated method stub
	    Employee e1=(Employee)o;
       if(e1.getEmployeeId()==this.getEmployeeId())
	   {
		   return -1;
	   }
	   else if(e1.getEmployeeId()<this.getEmployeeId())
	   {
		   return 1;
	   }
	  
	return 1000;
}
	 public int hashCode() {
		return 0;
	}
	


}
