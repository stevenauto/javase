package com.shengsiyuan.test;

import com.aruba.code8.junit.C;

public class D extends C
{
	public void output()
	{
		System.out.println(year);
	}

	public static void main(String[] args)
	{
		D d = new D();
		d.output();
	}
}
