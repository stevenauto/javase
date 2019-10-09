package com.steven.code2;

public class StaticTest5
{
	public static void main(String[] args)
	{
		W w = new W();
		w.change();
		System.out.print(w.a);
	}
}

class W
{
	static int a = 10;

	public static void change()
	{
		a++;
	}
}
