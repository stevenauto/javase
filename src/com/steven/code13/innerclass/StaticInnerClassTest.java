package com.steven.code13.innerclass;

class StaticInner
{ 
	private static int a = 4;
	/**名称不能与外部类相同，编译后生成独立的class文件（StaticInner$Inner.class)，只能访问外部类的静态成员和方法，包括private static
	 * 外部类不能用static关键字修饰。只有内部类可以。
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














