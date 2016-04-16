package com.aruba.code22.classloader;

public class Dog
{
	public Dog()
	{
		System.out.println("Dog is loaded by : " + this.getClass().getClassLoader());
	}
}
