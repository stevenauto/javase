package com.steven.pattern.decorator;
/*
 * Ïàµ±ÓÚfilteroutputstream
 * 
 */
public class Decorator implements Component
{
	private Component component;
	
	public Decorator(Component component)
	{
		this.component = component;
	}
	
	@Override
	public void doSomething()
	{
		component.doSomething();
	}
}
