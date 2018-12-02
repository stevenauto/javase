package com.steven.pattern.dynamicproxy.simple;


public class RealSubject implements Subject
{
	public void request()
	{
		System.out.println("From real subject!");
	}

}
