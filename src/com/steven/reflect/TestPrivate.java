package com.steven.reflect;

import java.lang.reflect.Method;

public class TestPrivate
{
	public static void main(String[] args) throws Exception
	{
		Private p = new Private();

		Class<?> classType = p.getClass();
		/**getMethod是返回public方法，getDeclaredMethods是获得所有方法getDeclaredMethod
		 * 获得指定的方法。
		 */
		Method method = classType.getDeclaredMethod("sayHello",
				new Class[] { String.class });
		/**true的时候就会压制Java的访问控制检查，缺省会做访问控制检查。
		 * 
		 */
		
		method.setAccessible(true);//压制Java的访问控制检查
		
		String str = (String)method.invoke(p, new Object[]{"zhangsan"});
		
		System.out.println(str);
	}
}
