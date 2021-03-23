package com.zensar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) {

		
	List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	
		//list.forEach(i->System.out.println(i));
		/*List<Integer>evennumberlist=new ArrayList<>();
		
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)%2==0) {
				evennumberlist.add(list.get(i));
			}
		}
	
	for(Integer i:evennumberlist) {
		System.out.println(i);
	}*/
		/*List<Integer>newlist=list.stream().filter((i)->i>5).map((i)->i+2).collect(Collectors.toList());
//	List<Integer>newlist1=list.stream().filter((i)->i%5==0).collect(Collectors.toList());
	List<Integer>newlist1=list.stream().map((i)->i+2).collect(Collectors.toList());*/
	
	Stream<Integer>myStream=list.stream().filter((i)->{
		
		if(i%2==0)
		//	System.out.println("ram");
			return true;
		else
			return false;
		
	}
	);
	myStream.forEach(i->System.out.println(i));
	
	
//	
//		for(Integer i:list2)
//		{
//			System.out.println(i);
//		}
		}
	}
	

