package com.aruba.code7.jdk5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
//�˴�����ʹ��extends����ʾ�������˼������ʹ��implements�����Ƿ��͵��ص㡣���ܺ�������ǽӿڻ����࣬
public class ListGenericFoo<T extends List>//�����ʱ�����ȷ��Χ
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
