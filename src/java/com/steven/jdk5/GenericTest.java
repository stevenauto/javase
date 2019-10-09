package com.steven.jdk5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//public class ListGenericFoo<T extends List>//定义的时候就明确范围，定义类的时候告诉泛型可以取什么类别。
//GenericTest<T>定义的时候没有明确范围，在使用的时候需要明确范围。
public class GenericTest<T>
{
	private T foo;

	public T getFoo()
	{
		return foo;
	}

	public void setFoo(T foo)
	{
		this.foo = foo;
	}
	
	public static void main(String[] args)
	{
		//声明引用变量的时候使用泛型，表示引用到底可以指向什么类型的一个对象
		GenericTest<? extends List> ge = null;
		
		ge = new GenericTest<ArrayList>();
		ge = new GenericTest<LinkedList>();
		
		//ge = new GenericTest<HashMap>();
		//List的父类，super表示下限，extends表示上限
		GenericTest<? super List> ge2 = null;
		
		ge2 = new GenericTest<Object>();
		
		GenericTest<String> ge3 = new GenericTest<String>();
		ge3.setFoo("hello world");
//		GenericTest<? extends Object> ge4 = ge3和下面的语句一样。
		GenericTest<?> ge4 = ge3;
		
		System.out.println(ge4.getFoo());
		
		ge4.setFoo(null);
		
		System.out.println(ge4.getFoo());
		
		//ge4.setFoo("welcome");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
