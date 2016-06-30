package com.steven.code8.annotation;

public class DeprecatedTest
{
	//加@Deprecated方法会加删除线
	@Deprecated
	public void doSomething()
	{
		System.out.println("do something!");
	}
	
	public static void main(String[] args)
	{
		DeprecatedTest test = new DeprecatedTest();
		
		test.doSomething();
		
		
		
		
		
		
//		Date date = new Date();
//		
//		System.out.println(date.toLocaleString());
	}
}
