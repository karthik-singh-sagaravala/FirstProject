package com.zensar;
import java.util.stream.IntStream;
public class MYIntStream {
	

	/* static int getMin(int arr[], int n)
	    {
	        int res = arr[0];
	         
	        for (int i = 1; i < n; i++)
	            res = Math.min(res, arr[i]);
	        return res;
	    }
	 static int getMax(int arr[],int n) {
		 int res=arr[0];
		 int max=0;
		 for(int i=0;i<n;i++)
		 {
			 if(res>arr[i]) {
				 max=arr[i];
			 }
		 }
		 return max;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {10,20,30,40,50};
		  int n = arr.length;
	        System.out.println( "Minimum element"+ " of array: " + getMin(arr, n));
	        System.out.println( "Maximum element"+ " of array: " + getMax(arr, n));*/
		 
	
public static void main(String[] args)
{
	
	IntStream stream=IntStream.of(10,20,30,40,50);
 IntStream.iterate(1,i->i+1)
	.limit(10)
	.forEach(i->System.out.println(i));
}

}


