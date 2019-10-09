package com.steven.exercise.strategy;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SorterByName implements PersonSorter,Comparator<Person>
{
	private Boolean isAsc;
	
	public SorterByName(Boolean b)
	{
		this.isAsc=b;
	}
	@Override
	public void sort(List<Person> list)
	{
		Collections.sort(list,this);

	}
	
	@Override
	public int compare(Person p1, Person p2)
	{
		if(p1.getName().equals(p2.getName()))
		{
			return p1.getId()-p2.getId();
		}
		return isAsc? p1.getName().compareTo(p2.getName()):p2.getName().compareTo(p1.getName()) ;
	}
	

}
