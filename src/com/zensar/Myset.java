package com.zensar;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Myset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee(2,"ram",300);
		Employee e2=new Employee(1,"sam",300);
		Employee e3=new Employee(2,"ram",300);
       
		Queue queue=new PriorityQueue();
		queue.add(e1);
		queue.add(e2);
		queue.add(e3);
		System.out.println(queue);
		
		
		
		
		
		
		
//		if(e1.equals(e3))
//		{
//			System.out.println("equal");
//		}
//		else
//		{
//			System.out.println("false");
//		}
//		System.out.println(e1.hashCode());
//		System.out.println(e3.hashCode());
//	
//        Set set=new HashSet();
//        
//        set.add(e1);
//        set.add(e2);
//        set.add(e3);
//        
//        System.out.println(set);
}
}
