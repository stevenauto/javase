package com.steven.pattern.composite2;

import java.util.List;

public class Leaf implements Component
{
	@Override
	public void doSomething()
	{
		System.out.println("ִ�з���");
	}

	@Override
	public void add(Component component)
	{
		
	}

	@Override
	public void remove(Component component)
	{
		
	}

	@Override
	public List<Component> getAll()
	{
		return null;
	}
}
