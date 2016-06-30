package com.steven.code8.exception;

public class ExceptionTest4
{
	/**
	 * 不需要抛出多个，父类可以代表他们throws MyException， MyException2
	 * 
	 * 
	 */
	public void method(String str) throws Exception
	{
		if(null == str)
		{
			throw new MyException("传入的字符串参数不能为null");
		}
		else if("hello".equals(str))
		{
			throw new MyException2("传入的字符串不能为hello");
		}
		else
		{
			System.out.println(str);
		}
	}
	/**main方法是由jvm调用的，谁调用的exception就抛给谁，所以下面语句Exception抛给JVM
	 * public static void main(String[] args) throws Exception
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		try
		{
			ExceptionTest4 test = new ExceptionTest4();
			
			test.method("hello");
		}
		catch(MyException e)
		{
			System.out.println("进入到MyException catch块");
			e.printStackTrace();
		}
		catch(MyException2 e)
		{
			System.out.println("进入到MyException2 catch块");
			e.printStackTrace();
		}
		/**
		 * 子类型的exception(MyException)可以由父类型(Exception)的来catch，反过来不行。多态
		 * 因为方法method抛出Exception，public void method(String str) throws Exception所以需要下面的语句
		  范围最大的在最后
		 */
		
		catch(Exception e)
		{
			System.out.println("进入到Exception catch块");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("异常处理完毕");
		}
		
		System.out.println("程序执行完毕");
		
	}
}











