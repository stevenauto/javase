package com.aruba.code8.exception;

public class ExceptionTest2
{
	public void method() throws Exception
	{
		System.out.println("hello world");
		//throw����s
		throw new Exception();
	}
	
	public static void main(String[] args)
	{
		ExceptionTest2 test = new ExceptionTest2();
		
		try
		{
			test.method();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("aaa");
		}
		
		
	}
}
