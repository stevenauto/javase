package com.steven.reflect;

import java.lang.reflect.Method;

public class TestPrivate
{
	public static void main(String[] args) throws Exception
	{
		Private p = new Private();

		Class<?> classType = p.getClass();
		/**getMethod�Ƿ���public������getDeclaredMethods�ǻ�����з���getDeclaredMethod
		 * ���ָ���ķ�����
		 */
		Method method = classType.getDeclaredMethod("sayHello",
				new Class[] { String.class });
		/**true��ʱ��ͻ�ѹ��Java�ķ��ʿ��Ƽ�飬ȱʡ�������ʿ��Ƽ�顣
		 * 
		 */
		
		method.setAccessible(true);//ѹ��Java�ķ��ʿ��Ƽ��
		
		String str = (String)method.invoke(p, new Object[]{"zhangsan"});
		
		System.out.println(str);
	}
}
