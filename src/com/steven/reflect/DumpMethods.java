package com.steven.reflect;

import java.lang.reflect.Method;

public class DumpMethods
{
	public static void main(String[] args) throws Exception
	{
		/**�᷵��һ�����������Ӧ��class����java�в����������ٸ�������Щ���󶼻��Ӧ�ڴ�����Ψһ��
		 * һ��class����Ҳ����һ�����Ӧһ��class�������class����������ص�jvm��ʱ��������ˣ�
		 * ��newû�� ��ϵ
		 * 
		 * forName()��һ����̬�ķ�����args[0]�ַ�����һ�����ȫ��������"java.lang.String"
		 */
		Class<?> classType = Class.forName(args[0]);
		/**
		 * class��������з���
		 */
		
		Method[] methods = classType.getDeclaredMethods();
		
		for(Method method : methods)
		{
			System.out.println(method);
		}
	}
}
