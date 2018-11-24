package com.steven.code2;

public class FinalTest2
{
	public static void main(String[] args)
	{
		H h = new H();
		h.output();
	}
}

class G
{
	/*
	 * final类的方法不能重写
	 */
	public final void output()
	{
		System.out.println("G");
	}
}

class H extends G
{
	public void output()
	{
		System.out.println("H");
	}
}
