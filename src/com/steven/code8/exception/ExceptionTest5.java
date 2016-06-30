package com.steven.code8.exception;

public class ExceptionTest5
{
	public void method() 
	{
		try
		{
			System.out.println("进入到try块");
//当这里为return是会执行finally。	System.exit(0)会终止虚拟机，finally不会执行。0表示正常退出，非0异常。
			System.exit(0);
			
		}
		catch(Exception ex)
		{
			System.out.println("异常发生了");
		}
		finally
		{
			System.out.println("进入到finally块");
		}
		
		System.out.println("异常处理后续的代码");
	}
	
	public static void main(String[] args)
	{
		ExceptionTest5 test = new ExceptionTest5();
		
		test.method();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
