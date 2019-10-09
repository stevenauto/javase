package com.steven.innerclass;

class LocalInner
{
	public void doSomething()
	{
		final int a = 4;
		/**就像一个局部变量，不能被定义成public,private,protected,static,他只能访问方法中final类型的局部变量。
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
