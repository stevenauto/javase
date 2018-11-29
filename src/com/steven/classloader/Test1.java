package com.steven.classloader;

public class Test1
{
	public static void main(String[] args) throws Exception
	{
		/**clazz的结果为null，证明类加载器是bootstrap
		 * 
		 */
		Class clazz = Class.forName("java.lang.String");
		
		System.out.println(clazz.getClassLoader());
		
		Class clazz2 = Class.forName("com.steven.classloader.C");
		
		System.out.println(clazz2.getClassLoader());
	}
}

class C
{
	
}
