package com.steven.reflect;

import java.lang.reflect.Array;

public class ArrayTester1
{
	public static void main(String[] args) throws Exception
	{
		/**创建一个长度为10的字符串数组，给其中一个赋值。
		 * 要想创建一个字符串数组首先获得String对应的class类型，
		 */
		Class<?> classType = Class.forName("java.lang.String");
		/*Array方法 的newInstance(Class<?> componentType,int length)
		 * 第一个参数时数组中每一个元素的类型，创建长度为10的字符串数组
		 */

		Object array = Array.newInstance(classType, 10);
		/*set array中index为5的字符串为hello和get
		 * 
		 */
		
		Array.set(array, 5, "hello");
		
		String str = (String)Array.get(array, 5);
		
		System.out.println(str);
	}
}
