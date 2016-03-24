package com.aruba.code8.reflect;

import java.lang.reflect.Method;

public class InvokeTester
{
	public int add(int param1, int param2)
	{
		return param1 + param2;
	}

	public String echo(String message)
	{
		return "hello: " + message;
	}

	public static void main(String[] args) throws Exception
	{
		// InvokeTester test = new InvokeTester();
		// System.out.println(test.add(1, 2));
		// System.out.println(test.echo("tom"));

		Class<?> classType = InvokeTester.class;
		/**
		 * 
		 * 
		 * 生成的是空参数列表的实例，也就是说调用了不带参数的构造方法
		 */
		Object invokeTester = classType.newInstance();

		// System.out.println(invokeTester instanceof InvokeTester);
		/**
		 * 通过与这个类所对应的class对象调用它的getMethod方法，第一个参数你想获得的方法的名称叫什么"add"，
		 * 第二个参数为这个方法所需要的参数（这些参数所对应的class对象所构成的数组）

		 */

		Method addMethod = classType.getMethod("add", new Class[] { int.class,
				int.class });
//		下面这句话的意思是调用invokeTester对象的addMethod方法，并且将new Object[]{1, 2})作为参数传入
		
		Object result = addMethod.invoke(invokeTester, new Object[]{1, 2});
		
		System.out.println((Integer)result);
		
		System.out.println("---------------------");
		
		Method echoMethod = classType.getMethod("echo", new Class[]{String.class});
		
		Object result2 = echoMethod.invoke(invokeTester, new Object[]{"tom"});
		
		System.out.println((String)result2);
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
