package com.steven.innerclass;

import java.util.Date;

public class AnonymousInnerClassTest
{
	@SuppressWarnings("deprecation")
	public String get(Date date)
	{
		return date.toLocaleString();
	}
	 
	public static void main(String[] args)
	{
		AnonymousInnerClassTest test = new AnonymousInnerClassTest();
		
		//String str = test.get(new Date());;
		
		//System.out.println(str);
		/**没有class关键字，没有类名，没有extends和implements，没有构造器。
		 * 但是隐式的继承一个父类和实现一个接口。继承与Date();AnonymousInnerClassTest$1.class
		 * 生成了继承Date类的一个子类。
		 */
		String str = test.get(new Date()
		{ 
			public String toLocaleString()
			{
				return "hello world";
			}
		});
		
		System.out.println(str);

	}
}
