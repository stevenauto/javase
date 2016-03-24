package com.aruba.code8.exception;

public class ExceptionTest
{
	public static void main(String[] args)
	{
		int c = 0;
		
		try
		{
			int a = 3;
			int b = 0;
			
			c = a / b;//发生异常是会生成一个异常对象，try模块后面的代码就不会执行，直接跳到catch里面的代码
			
			System.out.println("hello world");
		}
//		try后面不管有多少个catch，只有一个catch会执行。
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("welcome");
		}
		
		
		System.out.println(c);
	}
}
