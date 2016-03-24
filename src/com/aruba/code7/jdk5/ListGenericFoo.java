package com.aruba.code7.jdk5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
//此处必须使用extends（表示下面的意思），不使用implements，这是泛型的特点。不管后面跟的是接口还是类，
public class ListGenericFoo<T extends List>//定义的时候就明确范围
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
