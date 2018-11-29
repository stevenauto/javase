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
		/**ClassLoader.getSystemClassLoader(),���������
		 * ��Ϊ����ClassLoader���loadClass��������һ���ಢ���Ƕ��������ʹ�ã�
		 * ���ᵼ����ĳ�ʼ����
		 * ���ϵͳ�������
		 */
		ClassLoader loader = ClassLoader.getSystemClassLoader();
		
		Class<?> clazz = loader.loadClass("com.steven.classloader.CL");
		
		System.out.println("----------------------------");
		
		clazz = Class.forName("com.steven.classloader.CL");
	}

}
