package com.steven.code8.reflect;

import java.lang.reflect.Array;

public class ArrayTester2
{
	public static void main(String[] args)
	{
		int[] dims = new int[] { 5, 10, 15 };
		/**newInstance(componentType,int... dimensions),����һ�����飬�����������ƶ���componentType
		 * �Լ�ά�ȣ�����һά����ÿһ��Ԫ�ؾ���int�����ڶ�ά����ÿ��Ԫ����һ��һά���飬���һά����ͽ�������ͣ�
		 * 5,10,15����ÿһά�ĳ��ȡ�
		 */
		Object array = Array.newInstance(Integer.TYPE, dims);
		//==Object array = Array.newInstance(int.class, dims);

		
		System.out.println(array instanceof int[][][]);

		Object arrayObj = Array.get(array, 3);
		/**arrayObj.getClass()����һ��class��getComponentType()����class����������componentType
		 * �������಻��һ�������࣬�����������һ���ա�
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
