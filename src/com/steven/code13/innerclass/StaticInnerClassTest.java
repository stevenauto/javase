package com.steven.code13.innerclass;

class StaticInner
{ 
	private static int a = 4;
	/**���Ʋ������ⲿ����ͬ����������ɶ�����class�ļ���StaticInner$Inner.class)��ֻ�ܷ����ⲿ��ľ�̬��Ա�ͷ���������private static
	 * �ⲿ�಻����static�ؼ������Ρ�ֻ���ڲ�����ԡ�
	 * @author root
	 *
	 */
	public static class Inner
	{
		public void test()
		{
			System.out.println(a);
		}
	}
}

public class StaticInnerClassTest
{
	public static void main(String[] args)
	{
		StaticInner.Inner inner = new StaticInner.Inner();
		
		inner.test();
	}
}














