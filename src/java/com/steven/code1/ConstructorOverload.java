package com.steven.code1;

public class ConstructorOverload
{
	public ConstructorOverload()
	{
		/*
		 * �������һ�����췽���е�������һ�����췽������ô����ʹ��this()�ķ�ʽ���ã�this()�����еĲ�����ʾ
		 * Ŀ�깹�췽���Ĳ�����this()����Ҫ��Ϊ���췽���ĵ�һ����䣬���仰˵��this֮ǰ�������κο�ִ�еĴ���
		 */
		this(3);
		
		System.out.println("test");
	}

	public ConstructorOverload(int i)
	{
		System.out.println(++i);
	}

	public static void main(String[] args)
	{
		ConstructorOverload col = new ConstructorOverload();


	}
}
