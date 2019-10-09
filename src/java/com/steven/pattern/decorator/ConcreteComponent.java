package com.steven.pattern.decorator;

/*
 * 相当于fileoutputstream
 * 
 */
public class ConcreteComponent implements Component
{
	@Override
	public void doSomething()
	{
		System.out.println("功能A");
	}

}
