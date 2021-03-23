package com.zensar;


	interface Greeting{
		public String greet();
		public static void display()
		{
			System.out.println("hai");
		}
		
		public default void display1() {
			System.out.println("hello");
		}
	}
	
	 class Greet1 implements Greeting{

		@Override
		public String greet() {
			// TODO Auto-generated method stub
			return "good morning";
		}
		
	}
	 class Greet2 implements Greeting{

		@Override
		public String greet() {
			// TODO Auto-generated method stub
			return "good afternoon";
		}
		 
	 }
	public class MyInterface implements Greeting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Greet2 two=new Greet2();
		System.out.println(two.greet());
		Greet1 one =new Greet1();
		System.out.println(one.greet());
	     Greeting.   display();
	     one.display1();
	      
	       
	       
	
		Greeting greeting=  ()-> "good morning";
     System.out.println(greeting.greet());

}

	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return "good evening";
	}
	}
