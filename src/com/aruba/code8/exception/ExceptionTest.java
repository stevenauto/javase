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
			
			c = a / b;//�����쳣�ǻ�����һ���쳣����tryģ�����Ĵ���Ͳ���ִ�У�ֱ������catch����Ĵ���
			
			System.out.println("hello world");
		}
//		try���治���ж��ٸ�catch��ֻ��һ��catch��ִ�С�
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
