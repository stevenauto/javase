package com.steven.code1;

public class ConstructorOverload
{
	public ConstructorOverload()
	{
		/*
		 * 如果想在一个构造方法中调用另外一个构造方法，那么可以使用this()的方式调用，this()括号中的参数表示
		 * 目标构造方法的参数。this()必须要作为构造方法的第一条语句，换句话说，this之前不能有任何可执行的代码
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
