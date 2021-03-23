package com.zensar;

public class SalesPerson extends WageEmployee {
	
	private int commision;
	
	public SalesPerson(int employeeId,String employeeName, int employeeSalary,int hours,int rate,int commision)
	{
		super(employeeId,employeeName,employeeSalary,hours,rate);
		this.commision=commision;
	}

	public int getCommision() {
		return commision;
	}

	public void setCommision(int commision) {
		this.commision = commision;
	}
	
	/*public int calCommision()
	{
		return commision;
	}*/
	public String toString()
	{
		return super.toString()+" "+commision;
	}
	

}
