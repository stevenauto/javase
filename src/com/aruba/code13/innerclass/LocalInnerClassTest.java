package com.aruba.code13.innerclass;

class LocalInner
{
	public void doSomething()
	{
		final int a = 4;
		/**����һ���ֲ����������ܱ������public,private,protected,static,��ֻ�ܷ��ʷ�����final���͵ľֲ�������
		 * 
		 * @author root
		 *
		 */
		class Inner3
		{
			public void test()
			{
				System.out.println(a);
			}
		}
		
		new Inner3().test();
	}
}



public class LocalInnerClassTest
{
	public static void main(String[] args)
	{
		LocalInner localInner = new LocalInner();
		
		localInner.doSomething();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
