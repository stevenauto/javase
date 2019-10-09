package com.steven.classloader;

class Parent3
{
	static int a = 3;
	
	static
	{
		System.out.println("Parent3 static block");
	}
	
	static void doSomething()
	{
		System.out.println("do something");
	}
}

class Child3 extends Parent3
{
	static
	{
		System.out.println("Child3 static block");
	}
}

public class StaticInheritance3
{
	public static void main(String[] args)
	{
		/**Child3û�б���ʼ����ֻ�е�������ʵľ�̬������̬����ȷʵ�ڵ�ǰ
		 * ���ǰ�ӿ��ж���ʱ���ſ�����Ϊ�Ƕ�����߽ӿڵ�����ʹ�á���Ϊa��doSomething����
		 * Child3�ж�������û�г�ʼ��a
		 * 
		 */
		System.out.println(Child3.a);
		
		Child3.doSomething();
	}
}






















