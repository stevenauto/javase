package com.steven.code22.classloader;

public class Test1
{
	public static void main(String[] args) throws Exception
	{
		/**clazz�Ľ��Ϊnull��֤�����������bootstrap
		 * 
		 */
		Class clazz = Class.forName("java.lang.String");
		
		System.out.println(clazz.getClassLoader());
		
		Class clazz2 = Class.forName("com.steven.code22.classloader.C");
		
		System.out.println(clazz2.getClassLoader());
	}
}

class C
{
	
}
