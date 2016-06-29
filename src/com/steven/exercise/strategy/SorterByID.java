package com.aruba.exercise.strategy;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SorterByID implements PersonSorter,Comparator<Person>
{
	private Boolean isAsc;
	public SorterByID(Boolean b)
	{
		this.isAsc=b;
	}
	public void sort(List<Person> list)
	{
		Collections.sort(list,this);
	}

	@Override
	public int compare(Person p1, Person p2)
	{
		int result = p1.getId()-p2.getId();
		return isAsc? result: -result;
	}
	
	
}


