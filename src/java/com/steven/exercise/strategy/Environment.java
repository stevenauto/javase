package com.steven.exercise.strategy;

import java.util.List;

public class Environment
{
	private PersonSorter sorter;

	public PersonSorter getSorter()
	{
		return sorter;
	}

	public void setSorter(PersonSorter sorter)
	{
		this.sorter = sorter;
	}
	
	public Environment()
	{
		
	}
	public Environment(PersonSorter sorter)
	{
		this.sorter=sorter;
	}
	
	public void sort(List<Person> list)
	{
		this.sorter.sort(list);
	}
	
}
