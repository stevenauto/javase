package com.steven.code1;

public class ParamTest2
{
	/*
	 * �ڴ��ж��������stack��ջheap�������Ƿ��ڶ��������ԭ������int���Ƿ���stack��ġ���������ʱѹstack�Ĺ��̡�
	 * ԭ�����ʹ�����ֵ�����󴫵������ã����ڴ��еĵ�ַexmaple 506����
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
