package com.steven.reflect;

import java.lang.reflect.Array;

public class ArrayTester1
{
	public static void main(String[] args) throws Exception
	{
		/**����һ������Ϊ10���ַ������飬������һ����ֵ��
		 * Ҫ�봴��һ���ַ����������Ȼ��String��Ӧ��class���ͣ�
		 */
		Class<?> classType = Class.forName("java.lang.String");
		/*Array���� ��newInstance(Class<?> componentType,int length)
		 * ��һ������ʱ������ÿһ��Ԫ�ص����ͣ���������Ϊ10���ַ�������
		 */

		Object array = Array.newInstance(classType, 10);
		/*set array��indexΪ5���ַ���Ϊhello��get
		 * 
		 */
		
		Array.set(array, 5, "hello");
		
		String str = (String)Array.get(array, 5);
		
		System.out.println(str);
	}
}
