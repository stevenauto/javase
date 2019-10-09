package com.steven.jdk5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//�˴�����ʹ��extends����ʾ�������˼������ʹ��implements�����Ƿ��͵��ص㡣���ܺ�������ǽӿڻ����࣬
public class ListGenericFoo<T extends List>//�����ʱ�����ȷ��Χ��GenericTest<T>�����ʱ��û����ȷ��Χ����ʹ�õ�ʱ����Ҫ��ȷ��Χ��
{
	private T[] fooArray;

	public T[] getFooArray()
	{
		return fooArray;
	}

	public void setFooArray(T[] fooArray)
	{
		this.fooArray = fooArray;
	}
	
	public static void main(String[] args)
	{
		ListGenericFoo<LinkedList> foo1 = new ListGenericFoo<LinkedList>();
		ListGenericFoo<ArrayList> foo2 = new ListGenericFoo<ArrayList>();
		
		LinkedList[] linkedList = new LinkedList[10];
		
		foo1.setFooArray(linkedList);
		
		ArrayList[] arrayList = new ArrayList[10];
		
		foo2.setFooArray(arrayList);
		
		//ListGenericFoo<HashMap> foo3 = new ListGenericFoo<HashMap>();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
