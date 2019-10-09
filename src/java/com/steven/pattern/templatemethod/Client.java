package com.steven.pattern.templatemethod;

public class Client
{
	public static void main(String[] args)
	{
		AbstractClass ac = new ConcreteClass();
		
		ac.template();
	}
}
