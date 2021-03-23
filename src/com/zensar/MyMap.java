package com.zensar;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MyMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map map=new HashMap();
		map.put("name", "karthik");
		map.put("email", "karthiksingh700@gmail.com");
		map.put("age", "26");
		
		Set set=map.keySet();
		
		Iterator itr=set.iterator();
		
		while(itr.hasNext())
		{
			String keys=(String)itr.next();
			
			System.out.println("key is "+keys+"values" +map.get(keys));
		}
		
	}

}
