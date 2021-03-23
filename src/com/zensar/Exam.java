package com.zensar;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.function.Predicate;
//import com.zensar.Foo.Bar;

/*public class Exam {
	int x;
	double y;
	void add(int a ,int b )
	{
		 x=a+b;
		 System.out.println(x);
	}
     void add(double a,double b)
     {
    	 y=a+b;
    	 System.out.println(y);
     }
     Exam()
     {
    	 this.x=0;
    	 this.y=0;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a=2;
       double b=3.2;
		Exam e=new Exam();
		e.add(a, a);
		e.add(b, b);
		
		
	}

}*/
/*class X
{
	int a;
	double b;
}
class Y extends X
{
	int c;
}
class Exam
{
	public static void main(String[] args)
	{
		X a=new X();
		Y b=new Y();
		Class obj;
		obj=b.getClass();
		System.out.println(obj.isLocalClass());
		
	}
}*/

/*class Foo
{
	class Bar{}
}
class Exam
{
	public static void main(String[] args)
	{
		Foo f =new Foo();
		Bar b=f.new Bar();
		System.out.println("hi");
	}
}*/
/*class Exam
{
	public static void main(String[] args)
	{
		HashMap obj=new HashMap();
		obj.put("A",new Integer(1));
		obj.put("B",new Integer(2));
		obj.put("C",new Integer(3));
		System.out.println(obj);
		
	}
}*/
/*class Box
{
	int height;
	int width;
}
class Exam
{
	public static void main(String[] args)
	{
		Box b=new Box();
		Box b1=new Box();
		b.height=1;
		b.width=5;
		b1=b;
		System.out.println(b1.height);
	}
	
}*/
/*class Exam 
{
	int x=2;
	Exam(int i)
	{
		x=i;
	}
	public static void main(String[] args)
	{
		Exam e=new Exam(5);
		System.out.println("x="+e.x);
	}
}*/
/*class Myexception extends Exception{
	int detail;
	Myexception(int a)
	{
		detail=a;
	}
	public String toString() {
		return "detail";
		
	}
}
	class Exam
	{
		static void compute(int a)throws Myexeption{
			throw new Myexecption;	
			}
		
	}*/
/*class Exam extends Thread{  
	 public void run(){  
	  for(int i=1;i<5;i++){  
	    try{Thread.sleep(5000);}catch(InterruptedException e){System.out.println(e);}  
	    System.out.println(i);  
	  }  
	 }  
	 public static void main(String args[]){  
	  Exam t1=new Exam();  
	  Exam t2=new Exam();  
	   
	  t1.start();  
	  t2.start();  
	 }  
	}  */
/*class Exam extends Thread{  
	 public void run(){  
	  for(int i=1;i<=5;i++){  
	   try{  
	    Thread.sleep(500);  
	   }catch(Exception e){System.out.println(e);}  
	  System.out.println(i);  
	  }  
	 }  
	public static void main(String args[]){  
	 Exam t1=new Exam();  
	 Exam t2=new Exam();  
	 Exam t3=new Exam();  
	 t1.start();  
	 try{  
	  t1.join(1500);  
	 }catch(Exception e){System.out.println(e);}  
	  
	 t2.start();  
	 t3.start();  
	 }  
	}  */
/*class Exam{
	public static void main(String[] args) {
		String str="name";
		String str1="name";
		StringBuffer str2=new StringBuffer("name");
		StringBuffer str3=new StringBuffer("name");
if(str==str1) {
	System.out.println("yes");
}else {
	System.out.println("no");
}
if(str2==str3) {
	System.out.print("same");
}
else
{
	System.out.print("not same");

}
		
	}
}*/
/*public class Exam {
    public static void main(String [] args) {
        LocalDate d1 = LocalDate.parse("1999-09-09");
        LocalDate d2 = LocalDate.parse("1999-09-09");
        LocalDate d3 = LocalDate.of(1999, 9, 9);
        LocalDate d4 = LocalDate.of(1999, 9, 9);
        System.out.println((d1 == d2) + ":" + (d2 == d3) + ":" + (d3 == d4));
    }
}*/
/*public class Exam {
    public static void main(String[] args) {
        String [] arr = {"*", "**", "***", "****", "*****"};
        Predicate pr1 = s -> ((String) s).length() < 3;
        print(arr, pr1);
    }

    private static void print(String [] arr, Predicate<String> predicate) {
        for(String str : arr) {
            if(predicate.test(str)) {
                System.out.println(str);
            }
        }
    }
}*/
/*public class Exam{
    public static void main(String[] args) {
        Boolean b1 = new Boolean("tRuE");
        Boolean b2 = new Boolean("fAlSe");
        Boolean b3 = new Boolean("abc");
        Boolean b4 = null;
        System.out.println(b1 + ":" + b2 + ":" + b3 + ":" + b4);
    }
}*/
/*public class Exam {
    public static void main(String [] args) {
        Period period = Period.of(0, 0, 0).ofYears(15).ofMonths(5).ofDays(26);
        System.out.println(period);
    }
}*/
public class Exam {
    public static void main(String[] args) {
        final String fName = "James";
        String lName = "Gosling";
        String name1 = fName + lName;
        String name2 = fName + "Gosling";
        String name3 = "James" + "Gosling";
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name1 == name2);
        System.out.println(name2 == name3);
    }
}








