package com.steven.code8.exception;

public class ExceptionTest5
{
	public void method() 
	{
		try
		{
			System.out.println("���뵽try��");
//������Ϊreturn�ǻ�ִ��finally��	System.exit(0)����ֹ�������finally����ִ�С�0��ʾ�����˳�����0�쳣��
			System.exit(0);
			
		}
		catch(Exception ex)
		{
			System.out.println("�쳣������");
		}
		finally
		{
			System.out.println("���뵽finally��");
		}
		
		System.out.println("�쳣��������Ĵ���");
	}
	
	public static void main(String[] args)
	{
		ExceptionTest5 test = new ExceptionTest5();
		
		test.method();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
