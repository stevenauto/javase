package com.steven.reflect;

import java.lang.reflect.Method;

public class DumpMethods
{
	public static void main(String[] args) throws Exception
	{
		/**会返回一个这个类所对应的class对象，java中不管生产多少个对象，这些对象都会对应内存里面唯一的
		 * 一个class对象。也就是一个类对应一个class对象。这个class对象在类加载到jvm的时候就生成了，
		 * 与new没有 关系
		 * 
		 * forName()是一个静态的方法，args[0]字符串传一个类的全名。例如"java.lang.String"
		 */
		Class<?> classType = Class.forName(args[0]);
		/**
		 * class对象的所有方法
		 */
		
		Method[] methods = classType.getDeclaredMethods();
		
		for(Method method : methods)
		{
			System.out.println(method);
		}
	}
}
