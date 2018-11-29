package com.steven.classloader;

class CL
{
	static
	{
		System.out.println("Class CL");
	}
}

public class Test7
{
	public static void main(String[] args) throws Exception
	{ 
		/**ClassLoader.getSystemClassLoader(),不会输出。
		 * 因为调用ClassLoader类的loadClass方法加载一个类并不是对类的主动使用，
		 * 不会导致类的初始化。
		 * 获得系统类加载器
		 */
		ClassLoader loader = ClassLoader.getSystemClassLoader();
		
		Class<?> clazz = loader.loadClass("com.steven.classloader.CL");
		
		System.out.println("----------------------------");
		
		clazz = Class.forName("com.steven.classloader.CL");
	}

}
