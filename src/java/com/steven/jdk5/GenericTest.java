package com.steven.jdk5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//public class ListGenericFoo<T extends List>//�����ʱ�����ȷ��Χ���������ʱ����߷��Ϳ���ȡʲô���
//GenericTest<T>�����ʱ��û����ȷ��Χ����ʹ�õ�ʱ����Ҫ��ȷ��Χ��
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
		//�������ñ�����ʱ��ʹ�÷��ͣ���ʾ���õ��׿���ָ��ʲô���͵�һ������
		GenericTest<? extends List> ge = null;
		
		ge = new GenericTest<ArrayList>();
		ge = new GenericTest<LinkedList>();
		
		//ge = new GenericTest<HashMap>();
		//List�ĸ��࣬super��ʾ���ޣ�extends��ʾ����
		GenericTest<? super List> ge2 = null;
		
		ge2 = new GenericTest<Object>();
		
		GenericTest<String> ge3 = new GenericTest<String>();
		ge3.setFoo("hello world");
//		GenericTest<? extends Object> ge4 = ge3����������һ����
		GenericTest<?> ge4 = ge3;
		
		System.out.println(ge4.getFoo());
		
		ge4.setFoo(null);
		
		System.out.println(ge4.getFoo());
		
		//ge4.setFoo("welcome");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
