package com.zensar;

import java.util.Scanner;

public class Tcs {
//	
//		public  boolean isPalindrome(String str){  
//		    StringBuilder sb=new StringBuilder(str);  
//		    sb.reverse();  
//		    String rev=sb.toString();  
//		    if(str.equals(rev)){  
//		        return true;  
//		    }else{  
//		        return false;  
//		    }  
//		}  
		

	//public static void main(String args[]) {
//		int arr[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
//		int a = arr.length;
//		int sum = 0;
//		int n=10;
//		for (int i = 0; i < a; i++) {
//		
//				int num = arr[i];
//				if (num > 0) 
//				{
//					
//					sum = sum + num * n;
//					--n;
//				}
//			}
//		System.out.println(sum);
//	
//	if(sum%11==0)
//	{
//		System.out.println("d");
//	}
//	else
//	{
//		System.out.println("nd");
//	}
//	}
	public static void main(String args[])
	{
//	Tcs s=new Tcs();
//		 System.out.println(s.isPalindrome("nitin"));  
//		    System.out.println(s.isPalindrome("jatin"));  
//		int number;
//		int sum=0;
//		System.out.println("Enter the number");
//		Scanner sc=new Scanner(System.in);
//		number=sc.nextInt();
//		int temp=number;
//		while (temp >0)
//		{
//			int rem=temp%10;
//			sum=sum*10+rem;
//			temp=temp/10;
//		}
//		if(sum==number)
//		{
//			System.out.println("palindrome" +number);
//		}
//		else
//		System.out.println("not palindrome"+number);
//		int a=5;
//		int b=6;
//		a=a+b;//11
//		b=a-b;//5
//		a=a-b;//6
//		System.out.println(+a);
//		System.out.println(+b);
//		int n=5;
//		int count=0;
//		for(int i=1;i<n/2;n++)
//		if(n%i==0)
//		{
//			++count;
//		}
//		if(count==2)
//		{
//			System.out.println("prime number"+n);
//		}
//		else
//		{
//			System.out.println("not prime"+n);
//		}
//		int i=10;  
//		System.out.println(i);  
//		System.out.print(++i); 
//		System.out.print(i++);  
		int a[]= {1,2,1,3,1,3,6,7,4,4,5,6,5,2,11,4,5};
		int n=a.length;
		int j;
		for(int i=0;i<n;i++)
		{
			for( j=0;j<i;j++)
			{
				if(a[i]==a[j])
				{
					break;
				}			
			}
			if(i==j)
			{
				System.out.println(a[i]);
			}
		}
		
		
	}
}