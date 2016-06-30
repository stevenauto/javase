package com.steven.code8.exception;

public class ExceptionTest4
{
	/**
	 * ����Ҫ�׳������������Դ�������throws MyException�� MyException2
	 * 
	 * 
	 */
	public void method(String str) throws Exception
	{
		if(null == str)
		{
			throw new MyException("������ַ�����������Ϊnull");
		}
		else if("hello".equals(str))
		{
			throw new MyException2("������ַ�������Ϊhello");
		}
		else
		{
			System.out.println(str);
		}
	}
	/**main��������jvm���õģ�˭���õ�exception���׸�˭�������������Exception�׸�JVM
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
			System.out.println("���뵽MyException catch��");
			e.printStackTrace();
		}
		catch(MyException2 e)
		{
			System.out.println("���뵽MyException2 catch��");
			e.printStackTrace();
		}
		/**
		 * �����͵�exception(MyException)�����ɸ�����(Exception)����catch�����������С���̬
		 * ��Ϊ����method�׳�Exception��public void method(String str) throws Exception������Ҫ��������
		  ��Χ���������
		 */
		
		catch(Exception e)
		{
			System.out.println("���뵽Exception catch��");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("�쳣�������");
		}
		
		System.out.println("����ִ�����");
		
	}
}











