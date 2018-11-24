package com.steven.code1;

public class ParamTest2
{
	/*
	 * 内存有二块区域堆stack和栈heap，对象是放在堆里，变量（原生类型int）是放在stack里的。方法调用时压stack的过程。
	 * 原生类型传的是值，对象传的是引用（在内存中的地址exmaple 506）。
	 */
	public static void main(String[] args)
	{
		C c = new C();

		int a = 1;

		c.changeInt(a);

		System.out.println(a);
	}
}

class C
{
	void changeInt(int a)
	{
		a++;
		System.out.println(a);
	}
}
