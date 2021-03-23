package com.zensar;
import java.util.function.Predicate;

public class Lambda {
	
	interface InterfaceTest{
		public int add(int a,int b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

//		Employee e1=new Employee(101,"test",0);
//		Employee e2=new Employee(102,"hai",1);
//		Employee e3=new Employee(102,"hai",1);
//
//		List emp=new ArrayList();
//		
//		Collections.sort(emp,(Object o1,Object o2)->{
//		Employee emp1=(Employee)o1;
//		Employee emp2=(Employee)o2;
//		return emp1.getEmployeeName().compareTo(emp2.getEmployeeName());
//	
//		});
//		
//		System.out.print(emp);
		
		InterfaceTest i=(a,b) ->(a+b);
			System.out.println(i.add(10, 28));
			
			int[] arr= {1,2,3,4,5,6,7,8,9,10};
			Predicate<Integer>p1=j-> j%2==0;
			Predicate<Integer>p2=j-> j%5==0;
			Predicate<Integer>p3=p1.negate();
			
			for(int k:arr)
		//	System.out.println(p1.test(k));
						System.out.println(p3.test(k));


		 
	}

}
