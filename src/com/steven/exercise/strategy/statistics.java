package com.steven.exercise.strategy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class statistics
{
	public static void main(String[] args)
	{
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(String t:args)
		{
			if(map.containsKey(t)){
				int oldvalue = map.get(t);
				map.put(t,oldvalue+1);
			}else{
				map.put(t,1);
			}	
		}
		Set set = map.entrySet();
		for(Iterator<Map.Entry<String,Integer>> iter=set.iterator();iter.hasNext();)
		{
			Map.Entry<String,Integer> entry =iter.next();
			System.out.println(entry.getKey()+ ":"+ entry.getValue());
		}
		
	}

}
