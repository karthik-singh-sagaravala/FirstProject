package com.zensar;

public class WageEmployee extends Employee {
	
private int hours;
private int rate;

public WageEmployee()
{
	super();
}
public WageEmployee (int employeeId,String employeeName, int employeeSalary,int hours,int rate) {
	setEmployeeId(employeeId);
	setEmployeeName(employeeName);
	setEmployeeSalary(employeeSalary);
	this.rate=rate;
	this.hours=hours;
}
public int getHours() {
	return hours;
}
public void setHours(int hours) {
	this.hours = hours;
}
public int getRate() {
	return rate;
}
public void setRate(int rate) {
	this.rate = rate;
}
public int calculateSalary()
{
	return rate*hours;
}
/*public String toString()
{
	return super.toString()+" "+rate+" "+hours;
}*/

}
