package com.steven.code1;

public class Child extends Parent
{
	public Child()
	{	
//		invoke constructor with parameter,super���뷢�ڵ�һ��λ��
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
