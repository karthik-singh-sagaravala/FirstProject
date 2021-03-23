package com.zensar;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//public class TestArray extends Employee {
//	public TestArray(int employeeId, String employeeName, int employeeSalary) {
//		super(employeeId, employeeName, employeeSalary);
//		// TODO Auto-generated constructor stub
//	}
//
//	public TestArray() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public static void main(String[] args)
//	{
////		int[] arr=new int[5];
////		arr[0]=10;
////		arr[1]=20;
////		arr[2]=30;
////		arr[3]=40;
////		arr[4]=50;
////		
////		for(int a:arr) {
////			System.out.println(a);
////		
////		}
////		Employee[] employee=new Employee[5];
////		employee[0]=new Employee(1,"kohli",2000);
////		employee[1]=new Employee(2,"mahi",3000);
////		employee[2]=new Employee(1,"raina",3000);
////		employee[3]=new Employee(1,"sachin",500);
////		
////		for(Employee a:employee) {
////			System.out.println(a);
//		
////		}
//		Employee employee=new Employee(100,"karthik",299);
//		ObjectOutputStream oos=null;
//		try {
//			oos= new ObjectOutputStream(new FileOutputStream("object.ser"));
//			oos.writeObject(employee);
//			System.out.println("object saved successfully");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		 try {
//			ObjectInputStream in=new ObjectInputStream(new FileInputStream("object.ser"));
//		//	Employee employee=(Employee)in.readObject();
//			System.out.println(employee);
//			
//		// }finally(){
//			 System.out.println();
//	//	 }
//	//}
////}
//	//	} catch (IOException | ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//	//		e.printStackTrace();
//	//	}  
//		
//		
//		
////	}
//
////}
