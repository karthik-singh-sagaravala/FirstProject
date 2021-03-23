package com.zensar;

import java.util.Comparator;

public class NameComparator implements Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		
		return (e1.getEmployeeName().compareTo(e2.getEmployeeName()));
	}

}
