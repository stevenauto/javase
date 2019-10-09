package com.steven.pattern.adapter;

public class Adapter extends Adaptee implements Target
{
	@Override
	public void method1()
	{
		System.out.println("This is method1");
	}
}
