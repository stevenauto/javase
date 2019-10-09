package com.steven.code1;

public class Child extends Parent
{
	public Child()
	{	
//		invoke constructor with parameter,super必须发在第一个位置
		super(1);
		System.out.println("child");
	}

	public static void main(String[] args)
	{
		Child child = new Child();
	}
}

class Parent
{
	public Parent(int i)
	{
		System.out.println("parent");
	}

	
	public Parent()
	{
		System.out.println("no args parent");
	}
	
}
