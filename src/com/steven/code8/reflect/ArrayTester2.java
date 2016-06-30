package com.steven.code8.reflect;

import java.lang.reflect.Array;

public class ArrayTester2
{
	public static void main(String[] args)
	{
		int[] dims = new int[] { 5, 10, 15 };
		/**newInstance(componentType,int... dimensions),创建一个数组，这个数组具有制定的componentType
		 * 以及维度，对于一维数组每一个元素就是int，对于二维数组每个元素是一个一维数组，这个一维数组就叫组件类型，
		 * 5,10,15代表每一维的长度。
		 */
		Object array = Array.newInstance(Integer.TYPE, dims);
		//==Object array = Array.newInstance(int.class, dims);

		
		System.out.println(array instanceof int[][][]);

		Object arrayObj = Array.get(array, 3);
		/**arrayObj.getClass()返回一个class，getComponentType()返回class代表的数组的componentType
		 * 如果这个类不是一个数组类，这个方法返回一个空。
		 */
		
		Class<?> classType = arrayObj.getClass().getComponentType();

		arrayObj = Array.get(arrayObj, 5);

		Array.setInt(arrayObj, 10, 37);

		int[][][] arrayCast = (int[][][]) array;

		System.out.println(arrayCast[3][5][10]);

		// System.out.println(Integer.TYPE);
		// System.out.println(Integer.class);

	}
}
